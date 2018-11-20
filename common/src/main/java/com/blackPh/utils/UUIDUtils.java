package com.blackPh.utils;

import java.util.UUID;

/**
 * UUID工具类
 *
 * @author wang.hao
 * @create 2018-08-17 下午5:38
 **/
public class UUIDUtils {
    /**
     * 生成10位UUID
     *
     * @return
     */
    public static String getID10() {
        UUID uuid = UUID.randomUUID();

        // 改变uuid的生成规则
        return HashUtils.convertToHashStr(uuid.getMostSignificantBits(), 5)
                + HashUtils.convertToHashStr(uuid.getLeastSignificantBits(), 5);
    }
    /**
     * 生成36位UUID
     */
    public static String getID36(){
        return UUID.randomUUID().toString();
    }
    /**
     * 生成32位UUID
     * @return
     */
    public static String getID32(){
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
