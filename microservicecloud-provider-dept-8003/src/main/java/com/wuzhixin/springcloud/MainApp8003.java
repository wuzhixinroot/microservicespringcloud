package com.wuzhixin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wuzhixin
 * @date 2019/11/23 00:16
 * @desc
 */
@SpringBootApplication
@EnableEurekaClient
public class MainApp8003 {

    public static void main(String[] args) {

        SpringApplication.run(MainApp8003.class,args);
    }
}
