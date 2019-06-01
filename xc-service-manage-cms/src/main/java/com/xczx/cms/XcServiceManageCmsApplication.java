package com.xczx.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("com.xuecheng.framework.domain.cms")
@ComponentScan(basePackages = {"com.xuecheng.api"})
@ComponentScan(basePackages={"com.xczx.cms"})
@ComponentScan(basePackages={"com.xuecheng.framework"})
public class XcServiceManageCmsApplication {

    public static void main(String[] args) {

        SpringApplication.run(XcServiceManageCmsApplication.class, args);
    }

}
