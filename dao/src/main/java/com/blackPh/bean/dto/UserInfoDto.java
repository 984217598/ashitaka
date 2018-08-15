package com.blackPh.bean.dto;

import com.blackPh.bean.BasicDo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 用户基础信息
 *
 * @author wang.hao
 * @create 2018-08-13 下午4:43
 **/
@Data
public class UserInfoDto extends BasicDo {
    //用户id
    private String userId;
    //用户名
    private String userName;
    //头像
    private String userImg;
    //帐号
    private String userAccount;
}
