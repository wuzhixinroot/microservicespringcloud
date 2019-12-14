package com.wuzhixin.springcloud;

import com.wuzhixin.ribbonrule.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author wuzhixin
 * @date 2019/11/23 01:15
 * @desc
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "MICROSERVICECLOUD-DEPT",configuration = MyRule.class)
//服务名必须的大写
public class MainAppConsumer {

    public static void main(String[] args) {

        SpringApplication.run(MainAppConsumer.class,args);
       // ApplicationContext ap = new AnnotationConfigApplicationContext()
        // ApplicationContext ap2 = new GenericApplicationContext();
        //String[] beanDefinitionNames = ap.getbean();
       // Stream<String> stream = Arrays.stream(beanDefinitionNames);
       // stream.forEach(System.out::println);
      //  System.out.println(new AnnotationConfigApplicationContext().getBeanDefinitionNames());
    }
}
