package com.blackPh.controller.user;

import com.blackPh.bean.Enum.IsDaleteEnum;
import com.blackPh.bean.Result;
import com.blackPh.bean.vo.UserInfoVo;
import com.blackPh.service.UserService;
import com.blackPh.utils.BeanUtils;
import com.google.common.collect.Maps;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户相关
 *
 * @author wang.hao
 * @create 2018-08-13 下午5:23
 **/
@Controller
@Api("用户相关类")
public class UserAction {

    @Autowired
    private UserService userService;


    @ApiOperation(value = "保存用户信息.", httpMethod = "POST")
    @ResponseBody
    @RequestMapping("/saveUserInfo")
    public Result<?> saveUserInfo(@ModelAttribute UserInfoVo userInfoVo) {
        Map<String, Object> map = Maps.newHashMap();
        if (BeanUtils.isEmpty(userInfoVo)) {
            return Result.fail("412", "参数为空。");
        }
        String userAccount = userInfoVo.getUserAccount();
        if (StringUtils.isEmpty(userAccount)) {
            return Result.fail("412", "userAccount is NULL!");
        }
        UserInfoVo user = userService.queryUserByUserAccount(userAccount);
        Boolean updateUser = false;
        Boolean insertUser = false;
        if (BeanUtils.isNotEmpty(user)
                && IsDaleteEnum.NOT_DELETE.getCode().equals(user.getIsDelete())) {
            if (StringUtils.isNotEmpty(userInfoVo.getUserName())
                    && !userInfoVo.getUserName().equals(user.getUserName())) {
                //TODO update
                user.setUserName(userInfoVo.getUserName());
                updateUser = userService.updateUser(user);
            }
        } else {
            //TODO add
            insertUser = userService.insertUser(userInfoVo);
        }
        map.put("updateUser", updateUser);
        map.put("insertUser", insertUser);
        return Result.success(map);
    }


}
