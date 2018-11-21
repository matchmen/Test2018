package com.mybatis.springbootmybatis.dao;

import com.mybatis.springbootmybatis.dto.House;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface HouseDao {


    @Insert("insert into t_house(ADDRESS) VALUES(#{house.address})")
    public void insertHouse(@Param("house") House house);

}
