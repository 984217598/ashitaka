package com.blackPh.controller.user;

import com.blackPh.bean.Enum.IsDaleteEnum;
import com.blackPh.bean.Result;
import com.blackPh.bean.vo.UserInfoVo;
import com.blackPh.service.UserService;
import com.blackPh.utils.BeanUtils;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private UserService userService;


    @ApiOperation(value = "保存用户信息.", httpMethod = "POST")
    @ResponseBody
    @RequestMapping("/saveUserInfo")
    public Result<?> saveUserInfo(@ModelAttribute UserInfoVo userInfoVo) {
        if (BeanUtils.isEmpty(userInfoVo)) {
            return Result.fail("412", "参数为空。");
        }
        String userAccount = userInfoVo.getUserAccount();
        if (StringUtils.isEmpty(userAccount)) {
            return Result.fail("412", "userAccount is NULL!");
        }
        UserInfoVo user = userService.queryUserByUserAccount(userAccount);
        if (BeanUtils.isNotEmpty(user)
                && IsDaleteEnum.NOT_DELETE.getCode().equals(user.getIsDelete())) {
            if (StringUtils.isNotEmpty(userInfoVo.getUserName())
                    && userInfoVo.getUserName().equals(user.getUserName())) {
                //TODO update

            }
        }
        //TODO add
        Boolean result = userService.insertUser(userInfoVo);

        return Result.success("");
    }


}
