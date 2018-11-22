package com.blackPh.service;

import com.blackPh.bean.dto.UserInfoDto;
import com.blackPh.bean.vo.UserInfoVo;
import com.blackPh.mapper.UserMapper;
import com.blackPh.utils.BeanUtils;
import com.blackPh.utils.CollectionUtils;
import com.blackPh.utils.UUIDUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author wang.hao
 * @create 2018-08-13 下午6:04
 **/
@Service
public class UserServiceImpl implements UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);


    @Autowired
    private UserMapper userMapper;

    private static UserInfoVo accept(UserInfoDto userInfoDto) {
        UserInfoVo userInfoVo = new UserInfoVo();
        BeanUtils.copy(userInfoDto, userInfoVo);
        return userInfoVo;
    }
    private static UserInfoDto accept(UserInfoVo userInfoVo) {
        UserInfoDto userInfoDto = new UserInfoDto();
        BeanUtils.copy(userInfoVo, userInfoDto);
        return userInfoDto;
    }


    @Override
    public UserInfoVo queryUserByUserAccount(String userAccount) {

        List<UserInfoDto> userInfoDtos = userMapper.queryUserByUserAccount(userAccount);
        if (CollectionUtils.isEmpty(userInfoDtos)) {
            return null;
        }
        UserInfoDto userInfoDto = userInfoDtos.get(0);
        return accept(userInfoDto);
        }

    @Override
    public Boolean insertUser(UserInfoVo userInfoVo) {
        try {
            if (BeanUtils.isEmpty(userInfoVo)) {
                return false;
            }
            String id10 = UUIDUtils.getID10();
            String id32 = UUIDUtils.getID32();
            userInfoVo.setId(id32);
            userInfoVo.setUserId(id10);
//            UserInfoDto accept = accept(userInfoVo);
            userMapper.insertUserInfo(accept(userInfoVo));
        } catch (Exception e) {
            LOGGER.error("添加用户信息异常。");
            return false;
        }
        return true;
    }

    @Override
    public Boolean updateUser(UserInfoVo userInfoVo) {
        if (BeanUtils.isEmpty(userInfoVo)) {
            return false;
        }
        try {
            UserInfoDto accept = accept(userInfoVo);
            accept.setUpdateCreate(new Date());
            userMapper.updateUserInfo(accept);
        } catch (Exception e) {
            LOGGER.error("更新用户信息失败。");
            return false;
        }
        return true;
    }
}
