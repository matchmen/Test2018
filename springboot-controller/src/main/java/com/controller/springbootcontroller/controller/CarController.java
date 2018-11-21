package com.controller.springbootcontroller.controller;

import com.controller.springbootcontroller.service.CarService;
import com.mybatis.springbootmybatis.dto.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/car")
public class CarController {

    @Autowired
    private CarService carService;

    @RequestMapping(value = "/addCar",method = RequestMethod.GET)
    public void addCar(){

        Card card = new Card("奔驰","c200","奔驰");


        carService.addCar(card);

    }

}
