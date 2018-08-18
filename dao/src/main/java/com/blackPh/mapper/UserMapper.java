package com.blackPh.mapper;

import com.blackPh.bean.dto.UserInfoDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户mapper
 *
 * @author wang.hao
 * @create 2018-08-17 下午4:08
 **/
public interface UserMapper {
    List<UserInfoDto> queryUserByUserAccount(@Param("userAccount") String userAccount);
    void insertUserInfo(UserInfoDto userInfoDto);
    void updateUserInfo(UserInfoDto userInfoDto);
}
