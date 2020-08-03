//package com.hundsun.jres3_demo.provider.dao;
//
//import org.apache.ibatis.annotations.*;
//
//import com.hundsun.jres3_demo.api.entity.User;
//
//import java.util.List;
//
//
////@Mapper
//public interface UserMapper{
//
//    @Select("select * from user where id=#{userId}")
//    User findUserById(@Param(value = "userId")int userId);
//
//    @Select("select * from user")
//    List<User> getUsers();
//
//    @Insert("insert into user(id,username,age,password,sex) values(#{id},#{username},#{age},#{password},#{sex})")
//    int insertUser(User user);
//
//    @Update("update user set username=#{username},age=#{age},password=#{password},sex=#{sex} where id=#{id}")
//    int updateUser(User user);
//}
