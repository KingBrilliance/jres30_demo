package com.hundsun.jres3_demo.provider_01;

import com.hundsun.jrescloud.common.boot.CloudApplication;
import com.hundsun.jrescloud.common.boot.CloudBootstrap;
//import org.mybatis.spring.annotation.MapperScan;

@CloudApplication
//@MapperScan(basePackages = "com.hundsun.jres3_demo.provider.dao")
public class Provider01Application {

    public static void main(String[] args) {
        CloudBootstrap.run(Provider01Application.class,args);
    }
}
