package com.controller.springbootcontroller.controller;


import com.controller.springbootcontroller.service.UserService;
import com.mybatis.springbootmybatis.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/helloWorld")
    public @ResponseBody String helloWorld(){

        userService.addUser(null);

        return "hello world!";

    }

    @RequestMapping(value = "/getUserByUsername")
    public @ResponseBody User getUserByUsername(){

        return userService.getUserByUsername("matchmen");

    }

    @RequestMapping(value = "/getUserByUsernameAndPhoneNumber")
    public @ResponseBody User getUserByUsernameAndPhoneNumber(){

        return userService.getUserByUsernameAndPhoneNumber("matchmen","15052233301");

    }


    @RequestMapping(value = "/getUserByPhoneNumbers")
    public @ResponseBody List<User> getUserByPhoneNumbers(){

        return userService.getUserByPhoneNumbers(Arrays.asList("15052233301","15052233302"));

    }

    @RequestMapping(value = "/getUserById",method = RequestMethod.GET)
    public @ResponseBody User getUserById(int id){

        return userService.getUserById(id);

    }


    @RequestMapping(value = "/updateUserAddress",method = RequestMethod.GET)
    public @ResponseBody User updateUserAddress(){

        userService.updateUserAddress("", 0);
        return null;

    }




}
