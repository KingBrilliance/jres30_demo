package com.hundsun.jres3_demo.consumer.controller;

import com.hundsun.jres3_demo.api.IHelloService;

import com.hundsun.jres3_demo.consumer.entity.Response;
import com.hundsun.jrescloud.rpc.annotation.CloudReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/hello")
public class HelloController {


    @CloudReference
    private IHelloService iHelloService;

    @GetMapping("/sayHello")
    public Response<String> sayHello(String message){
        return Response.responseBySuccess("访问成功",iHelloService.sayHello(message));
    }


}
