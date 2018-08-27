package com.blackPh.bean.Enum;

/**
 *  省市区等级枚举
 *  @author  wang.hao
 *  @create 2018-08-27 23:51
 **/
public enum CityLevelEnum {
    ONE("1", "省"),
    TWO("2", "市"),
    THREE("3", "区县"),
    FOUR("4", "街道");

    private String level;
    private String desc;

    CityLevelEnum(String level, String desc) {
        this.level = level;
        this.desc = desc;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
