package com.blackPh.controller;

import com.blackPh.bean.Result;
import com.blackPh.bean.vo.UserInfoVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用户登录验证
 *
 * @author wang.hao
 * @create 2018-08-13 下午3:54
 **/
//@Controller
//@Api("用户")
public class Login {

    @RequestMapping("/login")
    @ResponseBody
    @ApiOperation(value = "")
    public Result<UserInfoVo> login() {

        return Result.success(new UserInfoVo());
    }

}
