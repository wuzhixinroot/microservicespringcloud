package com.wuzhixin.ribbonrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wuzhixin
 * @date 2019/12/2 16:55
 * @desc
 */
@Configuration
public class MyRule {

    @Bean
    public IRule getRule(){
        return new WZXRule();
    }
}
