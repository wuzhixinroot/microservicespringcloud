package com.wuzhixin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wuzhixin
 * @date 2019/11/23 00:16
 * @desc
 */
@SpringBootApplication
@EnableEurekaClient  // eureka服务注册客户端
@EnableCircuitBreaker  // hysrrix开始电路熔断，返回错误处理数据，没有关闭服务
public class MainApp8001hystrix {
    public static void main(String[] args) {
        SpringApplication.run(MainApp8001hystrix.class,args);
    }
}
