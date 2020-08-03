package com.hundsun.jres3_demo.provider.service;

import com.hundsun.jres3_demo.api.IHelloService;
import com.hundsun.jres3_demo.api.IHelloSubService;
import com.hundsun.jrescloud.rpc.annotation.CloudComponent;
import com.hundsun.jrescloud.rpc.annotation.CloudReference;

@CloudComponent
public class MyHelloService  implements IHelloService {

    @CloudReference
    IHelloSubService iHelloSubService;

    public String sayHello(String message) {
        return "provider 正在为您提供优质的服务"+iHelloSubService.sayHelloSubService(message);
    }
}
