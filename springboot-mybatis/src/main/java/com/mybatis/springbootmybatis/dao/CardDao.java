package com.mybatis.springbootmybatis.dao;

import com.mybatis.springbootmybatis.dto.Card;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface CardDao {


    @Insert("INSERT INTO t_car (BRAND,VERSION,NAME) VALUES(#{card.brand},#{card.version},#{card.name})")
    public void insertCard(@Param("card") Card card);


}
