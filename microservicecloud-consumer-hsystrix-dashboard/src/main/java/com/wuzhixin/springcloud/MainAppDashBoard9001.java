package com.wuzhixin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author wuzhixin
 * @date 2019/12/10 20:27
 * @desc
 */
@SpringBootApplication
@EnableHystrixDashboard
public class MainAppDashBoard9001 {

    public static void main(String[] args) {
        SpringApplication.run(MainAppDashBoard9001.class);
    }
}
