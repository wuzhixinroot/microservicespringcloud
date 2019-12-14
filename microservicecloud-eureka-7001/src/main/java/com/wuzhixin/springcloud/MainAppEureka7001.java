package com.wuzhixin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author wuzhixin
 * @date 2019/11/23 10:32
 * @desc
 */
@SpringBootApplication
@EnableEurekaServer
public class MainAppEureka7001 {
    public static void main(String[] args) {

        SpringApplication.run(MainAppEureka7001.class,args);
    }
}
