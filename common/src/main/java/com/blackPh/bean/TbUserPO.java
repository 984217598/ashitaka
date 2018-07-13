package com.blackPh.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author wang.hao
 * @create 2018-07-12 下午2:27
 **/
@Data
@ApiModel(value = "实体类")
public class TbUserPO {
    @ApiModelProperty(value = "用户id")
    private String userId;
    private String userName;
    private String realName;
    @ApiModelProperty(value = "用户")
    private String passWord;

}
