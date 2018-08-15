package com.blackPh.controller.user;

import com.blackPh.bean.Result;
import com.blackPh.bean.vo.UserInfoVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用户相关
 *
 * @author wang.hao
 * @create 2018-08-13 下午5:23
 **/
//@Controller
//@Api("用户相关类")
public class UserAction {



    @ApiOperation(value = "保存用户信息.", httpMethod = "POST")
    @ResponseBody
    @RequestMapping("/saveUserInfo")
    public Result<?> saveUserInfo(@ModelAttribute UserInfoVo userInfoVo) {




        return Result.success("");
    }


}
