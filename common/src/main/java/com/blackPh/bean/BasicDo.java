package com.blackPh.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 基础类
 *
 * @author wang.hao
 * @create 2018-08-13 下午4:39
 **/
@Data
public class BasicDo implements Serializable {
    private static final long serialVersionUID = -9081575921201049447L;
    private String id;
    private Date dateCreate;
    private Date updateCreate;
    private Date deleteCreate;
    private Integer isDelete;
}
