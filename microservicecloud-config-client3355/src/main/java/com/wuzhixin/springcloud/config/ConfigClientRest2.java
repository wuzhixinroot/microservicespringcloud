package com.wuzhixin.springcloud.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuzhixin
 * @date 2019/12/13 12:23
 * @desc  github读取信息
 */
/*
@RestController
public class ConfigClientRest2 {
    @Value("${spring.application.name}")
    private String applicationName;
  */
/*  @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServers;
    @Value("${server.port}")
    private String port;*//*


    @RequestMapping("/config2")
    public String getConfig(){
        System.out.println("applicationName:"+this.applicationName
               */
/* +"eurekaServers:"+this.eurekaServers
                +"port:"+this.port*//*
);
        return "applicationName:"+this.applicationName
               */
/* +"eurekaServers:"+this.eurekaServers
                +"port:"+this.port*//*
;

    }

}
*/
