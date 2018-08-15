package com.blackPh.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.cglib.beans.BeanCopier;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 复制Bean工具类
 *
 * @author wang.hao
 * @create 2018-08-13 下午4:55
 **/
public class BeanCopy {
    private static final Logger LOGGER = LoggerFactory.getLogger(BeanCopy.class);

    /**
     *
     * @param source 初始数据类
     * @param target 复制结果类
     * @param targetClazz 类型
     * @param <T>
     * @return
     */
    public static <T> T copy(Object source, Object target, Class<T> targetClazz) {
        try {
            if (null != source && null != target) {
                BeanCopier copy = BeanCopier.create(source.getClass(), targetClazz, false);
                copy.copy(source, target, null);
            }
        } catch (Exception e) {
            LOGGER.error("BeanCopy.copy failed! params: {}",
                    "source = [" + source + "], target = [" + target + "], targetClazz = [" + targetClazz + "]", e);
        }
        return targetClazz.cast(source);
    }

    /**
     * 无返回值的copy 只copy属性
     * @param source
     * @param target
     */
    public static void copy(Object source, Object target) {
        try {
            if (source != null && target != null) {
                BeanCopier copy = BeanCopier.create(source.getClass(), target.getClass(), false);
                copy.copy(source, target, null);
            }
        } catch (Exception e) {
            LOGGER.error("BeanCopy.copy failed! params: {}", "source = [" + source + "], target = [" + target + "]", e);
        }
    }

    /**
     * 多个obj属性 合并到一个obj
     * @param targetClazz
     * @param target
     * @param froms 来源初始类
     * @param <T>
     * @return
     */
    public static <T> T copy(Class<T> targetClazz, Object target, Object... froms) {
        try {
            for (Object from : froms) {
                if (from != null && target != null) {
                    BeanCopier copy = BeanCopier.create(from.getClass(), targetClazz, false);
                    copy.copy(from, target, null);
                }
            }
        } catch (Exception e) {
            LOGGER.error("BeanCopy.copy failed! params: {}",
                    "targetClazz = [" + targetClazz + "], target = [" + target + "], froms = [" + froms + "]", e);
        }
        return targetClazz.cast(target);
    }

    /**
     * 无返回值 多个obj属性 合并到一个obj
     * @param target
     * @param froms
     */
    public static void copy(Object target, Object... froms) {
        try {
            for (Object from : froms) {
                if (from != null && target != null) {
                    BeanCopier copy = BeanCopier.create(from.getClass(), target.getClass(), false);
                    copy.copy(from, target, null);
                }
            }
        } catch (Exception e) {
            LOGGER.error("BeanCopy.copy failed! params: {}", "target = [" + target + "], froms = [" + froms + "]", e);
        }
    }

    public static void copyIgnoreNullValue(Object source, Object target) {
        List<Field> fields = getAllFields(source);
        for (Field field : fields) {
            try {
                PropertyDescriptor sproperty = new PropertyDescriptor(field.getName(), source.getClass());
                Method readMethod = sproperty.getReadMethod();
                if (readMethod == null) {
                    continue;
                }
                Object value = readMethod.invoke(source);
                if (value == null) {
                    continue;
                }
                PropertyDescriptor tproperty = new PropertyDescriptor(field.getName(), target.getClass());
                Method writeMethod = tproperty.getWriteMethod();
                if (writeMethod == null) {
                    continue;
                }
                writeMethod.invoke(target, value);
            } catch (IntrospectionException ignore){
                LOGGER.debug(ignore.getMessage());
            } catch (Exception e) {
                LOGGER.error("BeanCopy.copyIgnoreNullValue failed! params: {}",
                        "source = [" + source + "], target = [" + target + "]", e);
            }
        }
    }

    public static <T> List<Field> getAllFields(T t) {
        if (t == null) {
            return new ArrayList<Field>();
        }
        Class<?> claz = t.getClass();
        List<Field> fields = new ArrayList<Field>();
        try {
            while (true) {
                Field[] superFields = claz.getDeclaredFields();
                if (superFields != null) {
                    for (Field field : superFields) {
                        /**
                         * 忽略序列号
                         */
                        if ("serialVersionUID".equals(field.getName())) {
                            continue;
                        }
                        fields.add(field);
                    }
                }
                if (claz.getSuperclass() == null || claz.getSuperclass() == Object.class) {
                    break;
                }
                claz = claz.getSuperclass();

            }
        } catch (Exception e) {
            LOGGER.error("BeanCopy.getAllFields failed! params: {}", "t = [" + t + "]", e);
        }
        return fields;
    }

//    /**
//     * COPY 属性忽略属性 AND 不COPY为NULL的属性
//     *
//     * @param to
//     * @param from
//     * @param ignoreProperties
//     */
//    public static ErpBeanUtilsBean beanUtilsBean;
//
//    static {
//        beanUtilsBean = new ErpBeanUtilsBean();
//        //如果没有下面几行，则在转换null时会抛异常，例如：org.apache.commons.beanutils.ConversionException: No value specified for 'BigDecimal'
//        //在org.apache.commons.beanutils.converters这个包下面有很多的Converter，可以按需要使用
//        beanUtilsBean.getConvertUtils()
//                .register(new org.apache.commons.beanutils.converters.BigDecimalConverter(null), BigDecimal.class);
//        beanUtilsBean.getConvertUtils()
//                .register(new org.apache.commons.beanutils.converters.DateConverter(null), java.util.Date.class);
//        beanUtilsBean.getConvertUtils()
//                .register(new org.apache.commons.beanutils.converters.SqlTimestampConverter(null),
//                        java.sql.Timestamp.class);
//        beanUtilsBean.getConvertUtils()
//                .register(new org.apache.commons.beanutils.converters.SqlDateConverter(null), java.sql.Date.class);
//        beanUtilsBean.getConvertUtils()
//                .register(new org.apache.commons.beanutils.converters.SqlTimeConverter(null), java.sql.Time.class);
//        beanUtilsBean.getConvertUtils().register(false, true, 0);
//    }
//
//    public static void beanUtilsCopy(Object target, Object from, String... ignoreProperties) {
//        try {
//            beanUtilsBean.setIgnorePropertiesMap(ignoreProperties);
//            beanUtilsBean.setIgnoreNull(true);
//            beanUtilsBean.copyProperties(to, from);
//            beanUtilsBean.clearIgnoreNull();
//        } catch (Exception e) {
//            LOGGER.error("BeanCopy.beanUtilsCopy failed! params: {}",
//                    "to = [" + to + "], from = [" + from + "], ignoreProperties = [" + ignoreProperties + "]", e);
//        }
//    }
//
//    public static void beanUtilsCopyNotIgnoreNull(Object target, Object from, String... ignoreProperties) {
//        try {
//            beanUtilsBean.setIgnorePropertiesMap(ignoreProperties);
//            beanUtilsBean.setIgnoreNull(false);
//            beanUtilsBean.copyProperties(to, from);
//            beanUtilsBean.clearIgnoreNull();
//        } catch (Exception e) {
//            LOGGER.error("BeanCopy.beanUtilsCopyNotIgnoreNull failed! params: {}",
//                    "to = [" + to + "], from = [" + from + "], ignoreProperties = [" + ignoreProperties + "]", e);
//        }
//    }
//
//
//    public static void main(String[] args) throws IOException {
//        CarVO car = new CarVO();
//        car.setMileage(10000L);
//        copy(car, new TanGeCheNeedFields());
//
//        //生成一个类只需要ClassWriter组件即可
//        ClassWriter cw = new ClassWriter(0);
//        //通过visit方法确定类的头部信息
//        cw.visit(Opcodes.V1_5, Opcodes.ACC_PUBLIC + Opcodes.ACC_ABSTRACT + Opcodes.ACC_INTERFACE, "com/asm3/Comparable",
//                null, "java/lang/Object", new String[]{"com/asm3/Mesurable"});
//        //定义类的属性
//        cw.visitField(Opcodes.ACC_PUBLIC + Opcodes.ACC_FINAL + Opcodes.ACC_STATIC, "LESS", "I", null, -1).visitEnd();
//        cw.visitField(Opcodes.ACC_PUBLIC + Opcodes.ACC_FINAL + Opcodes.ACC_STATIC, "EQUAL", "I", null, 0).visitEnd();
//        cw.visitField(Opcodes.ACC_PUBLIC + Opcodes.ACC_FINAL + Opcodes.ACC_STATIC, "GREATER", "I", null, 1).visitEnd();
//        //定义类的方法
//        cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_ABSTRACT, "compareTo", "(Ljava/lang/Object;)I", null, null)
//                .visitEnd();
//        cw.visitEnd(); //使cw类已经完成
//        //将cw转换成字节数组写到文件里面去
//        byte[] data = cw.toByteArray();
//        File file = new File("/Users/souche/Desktop/test.class");
//        FileOutputStream fout = new FileOutputStream(file);
//        fout.write(data);
//        fout.close();
//    }


    /**
     * 获取为null的属性
     * @param source
     * @return
     */
    public static String[] getNullPropertyNames (Object source) {
        final BeanWrapper src = new BeanWrapperImpl(source);
        java.beans.PropertyDescriptor[] pds = src.getPropertyDescriptors();

        Set<String> emptyNames = new HashSet<String>();
        for(java.beans.PropertyDescriptor pd : pds) {
            Object srcValue = src.getPropertyValue(pd.getName());
            if (srcValue == null) emptyNames.add(pd.getName());
        }
        String[] result = new String[emptyNames.size()];
        return emptyNames.toArray(result);
    }

    /**
     * 获取不为null的属性
     * @param source
     * @return
     */
    public static String[] getNotNullPropertyNames(Object source){
        final BeanWrapper src = new BeanWrapperImpl(source);
        java.beans.PropertyDescriptor[] pds = src.getPropertyDescriptors();

        Set<String> emptyNames = new HashSet<String>();
        for(java.beans.PropertyDescriptor pd : pds) {
            Object srcValue = src.getPropertyValue(pd.getName());
            if (srcValue != null) emptyNames.add(pd.getName());
        }
        String[] result = new String[emptyNames.size()];
        return emptyNames.toArray(result);
    }
}
