package com.mybatis.springbootmybatis.dao;


import com.mybatis.springbootmybatis.dto.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Component;

import java.util.List;


@Mapper
@Component
public interface UserDao {

    @Insert("insert into t_user(USERNAME,NAME,PHONE_NUMBER,ADDRESS) values(#{user.username,jdbcType=VARCHAR},#{user.name,jdbcType=VARCHAR},#{user.phoneNumber,jdbcType=VARCHAR},#{user.address,jdbcType=VARCHAR})")
    void insert(@Param("user") User user);

   /* @Select("select * from t_user where username = #{username,jdbcType=VARCHAR}")
    @Results({
            @Result(column = "ID" , property = "id",jdbcType = JdbcType.VARCHAR),
            @Result(column = "NAME" , property = "name",jdbcType = JdbcType.VARCHAR),
            @Result(column = "USERNAME" , property = "username",jdbcType = JdbcType.VARCHAR),
            @Result(column = "PHONE_NUMBER" , property = "phoneNumber",jdbcType = JdbcType.VARCHAR),
            @Result(column = "ADDRESS" , property = "address",jdbcType = JdbcType.VARCHAR)
    })*/
    User findUserByUsername(@Param("username")String username);


    @Select("select * from t_user where username = #{username,jdbcType=VARCHAR} and phone_number = #{phoneNumber,jdbcType=VARCHAR}")
    User findUserByUsernameAndPhoneNumber(@Param("username")String username,@Param("phoneNumber")String phonenumber);


    @Select("<script> select * from t_user where  phone_number in " +
            "<foreach item='item' index='index' collection='phoneNumbers' open='(' separator=',' close=')' > #{item}</foreach> </script>")
    List<User> findUserByPhoneNumbers(@Param("phoneNumbers")List<String> phonenumbers);

    void insertUser(@Param("user") User user);

    User findUserById(@Param("id") int id);


    //@Select("select * from t_user where id = #{id}")
    User findUser(@Param("id") int id);

    /*User findUserByUsername(@Param("username") int username);*/

    void updateUserAddressById(@Param("address") String address, @Param("id") int id);



}
