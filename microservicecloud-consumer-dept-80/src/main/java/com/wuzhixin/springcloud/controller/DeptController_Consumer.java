package com.wuzhixin.springcloud.controller;

import com.wuzhixin.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author wuzhixin
 * @date 2019/11/23 00:49
 * @desc
 */
@RestController
public class DeptController_Consumer {

    //public static final  String Des_Prefix="http://localhost:8001";
    public static final  String Des_Prefix="http://MICROSERVICECLOUD-DEPT";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/dept/add",method = RequestMethod.GET)
    public boolean add(@RequestBody Dept dept){

        return  restTemplate.postForObject(Des_Prefix+"/dept/add",dept,Boolean.class);
    }

    @RequestMapping(value = "/consumer/dept/get/{id}",method = RequestMethod.GET)
    public Dept getDeptById(@PathVariable("id")Long id){
        return restTemplate.getForObject(Des_Prefix+"/dept/get/"+id,Dept.class);
    }

    @RequestMapping(value = "/consumer/dept/list",method = RequestMethod.GET)
    public List<Dept> list(){

        return restTemplate.getForObject(Des_Prefix+"/dept/list",List.class);
    }

}
