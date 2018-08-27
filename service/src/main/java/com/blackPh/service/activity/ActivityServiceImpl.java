package com.blackPh.service.activity;


import com.blackPh.bean.dto.ActivityInfoDto;
import com.blackPh.bean.vo.ActivityVo;
import com.blackPh.mapper.activity.ActivityMapper;
import com.blackPh.utils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 活动相关
 *
 * @author HXL
 * @create 2018-08-28 0:00
 **/
@Service
public class ActivityServiceImpl implements ActivityService{

    @Autowired
    private ActivityMapper activityMapper;

    private static ActivityVo accept(ActivityInfoDto activityInfoDto) {
        ActivityVo activityVo = new ActivityVo();
        BeanUtils.copy(activityInfoDto, activityVo);
        return activityVo;
    }
    private static ActivityInfoDto accept(ActivityVo activityVo) {
        ActivityInfoDto activityInfoDto = new ActivityInfoDto();
        BeanUtils.copy(activityVo, activityInfoDto);
        return activityInfoDto;
    }


    @Override
    public Boolean insterActivity(ActivityVo activityVo) {

        activityMapper.insterActivity(accept(activityVo));
        return null;
    }


}
