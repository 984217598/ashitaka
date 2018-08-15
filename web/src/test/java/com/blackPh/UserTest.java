package com.blackPh;

import com.blackPh.bean.TbUserPO;
import com.blackPh.mapper.TbUserMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author wang.hao
 * @create 2018-07-12 下午2:33
 **/
public class UserTest {

    @Test
    public void test() {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext-dao.xml");
//        TbUserMapper tbUserMapper = applicationContext.getBean(TbUserMapper.class);
//        List<TbUserPO> tbUser = tbUserMapper.getTbUser();
//        System.out.println(tbUser);
    }


    @Test
    public void test2() {
        String value = "36700";
        Long divide = 10000L;
        int scale = 2;
        BigDecimal divide1 = new BigDecimal(value).divide(new BigDecimal(divide), scale, BigDecimal.ROUND_UP);
        long l = divide1.longValue();
        System.out.println(l);
    }
}
