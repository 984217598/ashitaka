package com.blackPh.bean.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 *  省市区VO
 *  @author  wang.hao
 *  @create 2018-08-25 12:03
 **/
@Data
public class ProvincesVo {
    @ApiModelProperty("地区Id")
    private Integer areaId;
    @ApiModelProperty("地区编码")
    private String areaCode;
    @ApiModelProperty("地区名")
    private String areaName;
    @ApiModelProperty("地区级别(1:省份province,2:市city,3:区县district,4:街道street)")
    private Integer level;
    @ApiModelProperty("城市编码")
    private String cityCode;
    @ApiModelProperty("城市中心坐标")
    private String center;
    @ApiModelProperty("地区父节点Id")
    private Integer parentId;

    @ApiModelProperty("子城市")
    private List<ProvincesVo> children;


}
