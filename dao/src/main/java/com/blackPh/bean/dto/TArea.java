package com.blackPh.bean.dto;

import lombok.Data;

/**
 *  全国省市区DTO类
 *  @author  wang.hao
 *  @create 2018-08-25 11:19
 **/
@Data
public class TArea {
    private Integer areaId; //地区Id
    private String areaCode; //地区编码
    private String areaName; //地区名
    private Integer level; //地区级别（1:省份province,2:市city,3:区县district,4:街道street）
    private String cityCode; //城市编码
    private String center; //城市中心坐标（即：经纬度坐标）
    private Integer parentId; //地区父节点Id
}
