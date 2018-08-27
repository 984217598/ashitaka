package com.blackPh.mapper.activity;

import com.blackPh.bean.dto.ActivityInfoDto;

/**
 * 活动相关接口
 *
 * @author HXL
 * @create 2018-08-27 22:38
 **/
public interface ActivityMapper {
    //添加
    void insterActivity (ActivityInfoDto activityInfoDto);
}
