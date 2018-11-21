package com.controller.springbootcontroller.service.impl;

import com.controller.springbootcontroller.service.HouseService;
import com.mybatis.springbootmybatis.dao.HouseDao;
import com.mybatis.springbootmybatis.dto.House;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HouseServiceImp implements HouseService {

    @Autowired
    private HouseDao houseDao;

    @Override
    public void addHouse(House house) {

        houseDao.insertHouse(house);

    }
}
