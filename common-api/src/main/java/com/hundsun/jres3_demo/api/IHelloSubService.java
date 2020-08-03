package com.hundsun.jres3_demo.api;

import com.hundsun.jrescloud.rpc.annotation.CloudService;

@CloudService
public interface IHelloSubService {
    String sayHelloSubService(String msg);
}
