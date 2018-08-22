package com.blackPh;

import com.blackPh.bean.vo.UserInfoVo;
import com.blackPh.mapper.UserMapper;
import com.blackPh.service.UserService;
import com.blackPh.utils.UUIDUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * @author wang.hao
 * @create 2018-07-12 下午2:33
 **/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml", "classpath:applicationContext-*.xml"})
@WebAppConfiguration
public class UserTest{

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserService userService;

    @Test
    public void test() {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext-dao.xml");
//        TbUserMapper tbUserMapper = applicationContext.getBean(TbUserMapper.class);
//        List<TbUserPO> tbUser = tbUserMapper.getTbUser();
//        System.out.println(tbUser);
    }


//    @Test
//    public void test2() {
//        String value = "36700";
//        Long divide = 10000L;
//        int scale = 2;
//        BigDecimal divide1 = new BigDecimal(value).divide(new BigDecimal(divide), scale, BigDecimal.ROUND_UP);
//        long l = divide1.longValue();
//        System.out.println(l);
//    }
//
//
//
//    @Test
//    public void test3() {
//        UserInfoVo userInfoVo = new UserInfoVo();
//        userInfoVo.setUserName("ashidaka");
//        userInfoVo.setUserAccount("123536536258");
//        Boolean aBoolean = userService.insertUser(userInfoVo);
//        System.out.println(aBoolean);
//    }
}
