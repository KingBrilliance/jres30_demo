package com.hundsun.jres3_demo.provider;

import com.hundsun.jrescloud.common.boot.CloudApplication;
import com.hundsun.jrescloud.common.boot.CloudBootstrap;
//import org.mybatis.spring.annotation.MapperScan;

@CloudApplication
//@MapperScan(basePackages = "com.hundsun.jres3_demo.provider.dao")
public class ProviderApplication {

    public static void main(String[] args) {
        CloudBootstrap.run(ProviderApplication.class,args);
    }
}
