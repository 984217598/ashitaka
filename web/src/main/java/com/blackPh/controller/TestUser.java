package com.blackPh.controller;

import com.blackPh.TbUserService;
import com.blackPh.bean.Result;
import com.blackPh.bean.TbUserPO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author wang.hao
 * @create 2018-07-12 下午3:02
 **/
@Controller
@Api(description = "测试")
public class TestUser {

    @Autowired
    private TbUserService tbUserService;

    @RequestMapping("/test")
    @ResponseBody
    @ApiOperation(value = "测试方法。", httpMethod = "GET")
    public Result getUser(@ApiParam("参数")
                          @RequestParam(value = "userId", required = true) String id) {
        List<TbUserPO> user = tbUserService.getUser();

        return Result.success(user);
    }

}
