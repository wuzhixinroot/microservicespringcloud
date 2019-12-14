package com.wuzhixin.springcloud.controller;

import com.wuzhixin.springcloud.entities.Dept;
import com.wuzhixin.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
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

   @Autowired
   private DeptClientService deptClientService;

    @RequestMapping(value = "/consumer/dept/add",method = RequestMethod.GET)
    public boolean add(@RequestBody Dept dept){

        return this.deptClientService.add(dept);
    }

    @RequestMapping(value = "/consumer/dept/get/{id}",method = RequestMethod.GET)
    public Dept getDeptById(@PathVariable("id")Long id){
        return this.deptClientService.getDeptById(id);
    }

    @RequestMapping(value = "/consumer/dept/list",method = RequestMethod.GET)
    public List<Dept> list(){

        return this.deptClientService.list();
    }

}
