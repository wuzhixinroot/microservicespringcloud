package com.wuzhixin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author wuzhixin
 * @date 2019/12/12 17:16
 * @desc
 */
@SpringBootApplication
@EnableConfigServer
public class MainAppServerConfig3344 {
    public static void main(String[] args) {

        SpringApplication.run(MainAppServerConfig3344.class,args);

    }
}
