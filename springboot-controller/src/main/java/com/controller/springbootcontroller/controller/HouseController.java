package com.controller.springbootcontroller.controller;

import com.controller.springbootcontroller.service.HouseService;
import com.mybatis.springbootmybatis.dto.House;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/house")
public class HouseController {

    @Autowired
    private HouseService houseService;

    @RequestMapping(value = "/addHouse",method = RequestMethod.GET)
    public void addHouse() {

        House house = new House("别墅");

        houseService.addHouse(house);
    }
}
