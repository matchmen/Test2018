package com.mybatis.springbootmybatis;

import com.mybatis.springbootmybatis.dao.UserDao;
import com.mybatis.springbootmybatis.dto.User;
import org.junit.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@MapperScan(basePackages = "com.mybatis.springbootmybatis.dao")

public class UserTest {


    @Autowired
    UserDao userDao;



}
