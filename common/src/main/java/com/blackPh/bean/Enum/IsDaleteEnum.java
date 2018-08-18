package com.blackPh.bean.Enum;

/**
 * 是否删除枚举类
 *
 * @author wang.hao
 * @create 2018-08-17 下午6:01
 **/
public enum IsDaleteEnum {
    IS_DELETE(1, "被删除"),
    NOT_DELETE(0, "没有被删除");

    private Integer code;
    private String desc;

    IsDaleteEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
