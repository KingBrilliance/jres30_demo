//package com.hundsun.jres3_demo.provider.service;
//
//import com.hundsun.jres3_demo.api.IUserService;
//import com.hundsun.jres3_demo.api.entity.User;
//import com.hundsun.jres3_demo.provider.dao.UserMapper;
//import com.hundsun.jrescloud.rpc.annotation.CloudComponent;
//
//import javax.annotation.Resource;
//import java.util.List;
//
////@CloudComponent
//public class MyUserService implements IUserService {
//
//    @Resource
//    UserMapper userMapper;
//
//    public User getUser(Integer userId) {
//        if(userId!=null&&userId>0){
//            return userMapper.findUserById(userId);
//        }
//        throw new RuntimeException("用户id格式有误");
//    }
//
//    public List<User> getUsers() {
//        List<User> users = userMapper.getUsers();
//        return users;
//    }
//
//    public int insertUser(User user) {
//        return userMapper.insertUser(user);
//    }
//
//    public int updateUser(User user){
//        return userMapper.updateUser(user);
//    }
//}
