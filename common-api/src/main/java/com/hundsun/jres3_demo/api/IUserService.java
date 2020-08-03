package com.hundsun.jres3_demo.api;

import com.hundsun.jres3_demo.api.entity.User;
import com.hundsun.jrescloud.rpc.annotation.CloudService;

import java.util.List;

@CloudService()
public interface IUserService {
    User getUser(Integer userId);
    List<User> getUsers();
    int insertUser(User user);
    int updateUser(User user);
}
