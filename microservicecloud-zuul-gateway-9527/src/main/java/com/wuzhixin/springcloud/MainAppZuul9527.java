package com.wuzhixin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author wuzhixin
 * @date 2019/12/11 10:23
 * @desc
 */
@SpringBootApplication
@EnableZuulProxy
public class MainAppZuul9527 {
    public static void main(String[] args) {

        SpringApplication.run(MainAppZuul9527.class,args);
    }
}
