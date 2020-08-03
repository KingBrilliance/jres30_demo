package com.hundsun.jres3_demo.consumer;


import com.hundsun.jrescloud.common.boot.CloudApplication;
import com.hundsun.jrescloud.common.boot.CloudBootstrap;

@CloudApplication
public class ConsumerApplication {
    public static void main(String[] args) {
        CloudBootstrap.run(ConsumerApplication.class,args);
    }
}
