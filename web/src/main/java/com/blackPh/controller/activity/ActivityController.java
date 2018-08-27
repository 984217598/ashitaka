package com.blackPh.controller.activity;

import com.blackPh.bean.Result;
import com.blackPh.bean.vo.ActivityVo;
import com.blackPh.service.activity.ActivityService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 活动相关
 *
 * @author HXL
 * @create 2018-08-28 0:31
 **/
@Controller
@Api("活动相关类")
public class ActivityController {
    @Autowired
    private ActivityService activityService;

    @ApiOperation(value = "活动创建", httpMethod = "POST")
    @ResponseBody
    @RequestMapping("/saveActivityInfo")
    public Result<?> insterActivity (@ModelAttribute ActivityVo activityVo ) {
        activityService.insterActivity(activityVo);
        return Result.success("");
    }
}
