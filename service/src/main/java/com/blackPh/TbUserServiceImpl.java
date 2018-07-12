package com.blackPh;

import com.blackPh.bean.TbUserPO;
import com.blackPh.mapper.TbUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wang.hao
 * @create 2018-07-12 下午3:07
 **/
@Service
public class TbUserServiceImpl implements TbUserService {
    @Autowired
    private TbUserMapper tbUserMapper;

    @Override
    public List<TbUserPO> getUser() {
        return tbUserMapper.getTbUser();
    }
}
