package com.blackPh.bean.vo;

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
public class UserInfoVo extends BasicDo{
    @ApiModelProperty("用户id")
    private String userId;
    @ApiModelProperty("用户名")
    private String userName;
    @ApiModelProperty("头像")
    private String userImg;
    @ApiModelProperty("帐号")
    private String userAccount;
}
