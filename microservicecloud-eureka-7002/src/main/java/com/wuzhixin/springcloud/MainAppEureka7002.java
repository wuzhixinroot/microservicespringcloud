package com.wuzhixin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author wuzhixin
 * @date 2019/12/1 10:31
 * @desc
 */
@SpringBootApplication
@EnableEurekaServer
public class MainAppEureka7002 {
    public static void main(String[] args) {
        SpringApplication.run(MainAppEureka7002.class,args);
    }
}
