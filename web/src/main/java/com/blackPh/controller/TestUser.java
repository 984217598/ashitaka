package com.blackPh.controller;

import com.blackPh.TbUserService;
import com.blackPh.bean.Result;
import com.blackPh.bean.TbUserPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author wang.hao
 * @create 2018-07-12 下午3:02
 **/
@Controller
public class TestUser {

    @Autowired
    private TbUserService tbUserService;

    @RequestMapping("/test")
    @ResponseBody
    public Result getUser() {
        List<TbUserPO> user = tbUserService.getUser();

        return Result.success(user);
    }

}
