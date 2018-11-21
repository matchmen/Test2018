package com.controller.springbootcontroller.service;

import com.mybatis.springbootmybatis.dto.User;

import java.util.List;

public interface UserService {

    public User getUserByUsername(String username);

    public User getUserByUsernameAndPhoneNumber(String username,String phoneNumber);

    public User getUserById(int id);

    public List<User> getUserByPhoneNumbers(List<String> phoneNumbers);

    public void addUser(User user);


    public void updateUserAddress(String address, int id);



}
