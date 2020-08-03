package com.hundsun.jres3_demo.provider_01.service;

import com.hundsun.jres3_demo.api.IHelloSubService;
import com.hundsun.jrescloud.rpc.annotation.CloudComponent;

@CloudComponent
public class HelloSubService implements IHelloSubService {


    public String sayHelloSubService(String msg) {
        return "该服务模块由子服务提供："+msg;
    }
}
