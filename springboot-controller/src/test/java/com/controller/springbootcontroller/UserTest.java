package com.controller.springbootcontroller;

import com.mybatis.springbootmybatis.dao.UserDao;
import com.mybatis.springbootmybatis.dto.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class UserTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void addUserTest(){

        User user = new User("张三","matchmen","15052233301","成都");
        userDao.insert(user);

    }
}
