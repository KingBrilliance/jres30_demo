package com.hundsun.jres3_demo.consumer.controller;


import com.hundsun.jres3_demo.api.IUserService;
import com.hundsun.jres3_demo.api.entity.User;
import com.hundsun.jres3_demo.consumer.entity.Response;
import com.hundsun.jrescloud.rpc.annotation.CloudReference;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
//@RequestMapping("/user")
public class UserController {
    @CloudReference
    IUserService iUserService;

    @GetMapping("/getUser")
    public Response<User> getUserById(int userId){
        User user = iUserService.getUser(userId);
        return Response.responseBySuccess("访问",user);
    }

    @GetMapping("/getAll")
    public Response<List<User>> getUser(){
        List<User> users = iUserService.getUsers();
        return Response.responseBySuccess("sss",users);
    }

    @PostMapping("/insertUser")
    public Response<String> insertUser(User user){
        int i = iUserService.insertUser(user);
        if(i>0)
            return Response.responseBySuccess("插入成功","操作无误");
        return null;
    }

    @PutMapping("update")
    public Response<String> updateUser(User user){
        return Response.responseBySuccess("修改成功",iUserService.updateUser(user)+"成功");
    }
}
