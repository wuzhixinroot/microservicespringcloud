package com.wuzhixin.springcloud.configbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author wuzhixin
 * @date 2019/11/23 00:45
 * @desc java配置类
 */

@Configuration
public class ConfigBean {

    /**
     * 注入一个 resttemplate 用来 数据交互的对象
     *
     */
    @LoadBalanced
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }


    // 可以覆盖默认轮询算法
  /*  @Bean
    public IRule getRule(){
        return new RandomRule();
    }*/
}
