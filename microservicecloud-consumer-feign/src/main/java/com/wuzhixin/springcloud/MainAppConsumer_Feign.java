package com.wuzhixin.springcloud;

import com.wuzhixin.ribbonrule.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author wuzhixin
 * @date 2019/11/23 01:15
 * @desc
 */
@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name = "MICROSERVICECLOUD-DEPT",configuration = MyRule.class)
//服务名必须的大写
@EnableFeignClients(basePackages = {"com.wuzhixin.springcloud"})
//@ComponentScan(basePackages={"com.wuzhixin.springcloud"})
public class MainAppConsumer_Feign {
    public static void main(String[] args) {

        SpringApplication.run(MainAppConsumer_Feign.class,args);
       // ApplicationContext ap = new AnnotationConfigApplicationContext()
        // ApplicationContext ap2 = new GenericApplicationContext();
        //String[] beanDefinitionNames = ap.getbean();
       // Stream<String> stream = Arrays.stream(beanDefinitionNames);
       // stream.forEach(System.out::println);
      //  System.out.println(new AnnotationConfigApplicationContext().getBeanDefinitionNames());
    }
}
