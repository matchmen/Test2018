package com.controller.springbootcontroller.service.impl;

import com.controller.springbootcontroller.service.CarService;
import com.mybatis.springbootmybatis.dao.CardDao;
import com.mybatis.springbootmybatis.dto.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CardDao cardDao;

    @Override
    public void addCar(Card card) {

        cardDao.insertCard(card);

    }
}
