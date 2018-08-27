package com.blackPh.service;

import com.blackPh.bean.dto.UserInfoDto;
import com.blackPh.bean.vo.UserInfoVo;

import java.util.List;

/**
 * @author wang.hao
 * @create 2018-08-13 下午6:03
 **/
public interface  UserService {
    UserInfoVo queryUserByUserAccount(String userAccount);

    Boolean insertUser(UserInfoVo userInfoVo);

    Boolean updateUser(UserInfoVo userInfoVo);
}
