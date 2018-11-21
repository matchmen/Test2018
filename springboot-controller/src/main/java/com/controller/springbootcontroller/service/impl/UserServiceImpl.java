package com.controller.springbootcontroller.service.impl;

import com.controller.springbootcontroller.service.UserService;
import com.mybatis.springbootmybatis.dao.UserDao;
import com.mybatis.springbootmybatis.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserByUsername(String username) {

        return userDao.findUserByUsername(username);
    }

    @Override
    public User getUserByUsernameAndPhoneNumber(String username, String phoneNumber) {
        return userDao.findUserByUsernameAndPhoneNumber(username,phoneNumber);
    }

    @Override
    public User getUserById(int id) {
        User user = userDao.findUserById(id);
        return user;
    }

    @Override
    public List<User> getUserByPhoneNumbers(List<String> phoneNumbers) {

        List<User> users = userDao.findUserByPhoneNumbers(phoneNumbers);

        return users;
    }

    @Override
    public void addUser(User user) {
        User useruser = new User("张三","matchmen2","15052233303","成都");
        userDao.insertUser(useruser);
    }

    @Override
    public void updateUserAddress(String address, int id) {
        userDao.updateUserAddressById("成都高新区",23);
    }

}
