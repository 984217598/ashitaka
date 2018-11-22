package com.blackPh.bean.dto;

import com.blackPh.bean.BasicDo;
import lombok.Data;

import java.util.Date;

/**
 * 活动类
 *
 * @author HXL
 * @create 2018-08-27 22:42
 **/
@Data
public class ActivityInfoDto extends BasicDo {
    //标题
    private String title;
    //地址（全）
    private String address;
    //省code
    private String provinceCode;
    //省
    private String province;
    //市code
    private String cityCode;
    //市
    private String city;
    //县code
    private String countyCode;
    //县
    private String county;
    //活动开始时间
    private Date startACTime;
    //活动结束时间
    private Date endACTime;
    //报名开始时间
    private Date startSUTime;
    //报名结束时间
    private Date endSUTime;
    //内容
    private String content;
    //活动图片
    private String imgAC;
    //报名人数
    private Integer enrolment;
    //标签code
    private String labelCode;
    //标签
    private String label;

}
