package com.wuzhixin.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.wuzhixin.springcloud.entities.Dept;
import com.wuzhixin.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wuzhixin
 * @date 2019/11/22 23:59
 * @desc
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;
    /**
     * 得到一个实体
     * @param id
     * @return
     */
    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod="process_hystrix_Get")
    public Dept getDeptById(@PathVariable("id") Long id){
        Dept dept = deptService.get(id);
        if(null==dept){
            throw new RuntimeException("没有第"+id+"条记录 , 熔断器返回结果");
        }
        return deptService.get(id);
    }

    public Dept process_hystrix_Get(@PathVariable("id") Long id){

        return new Dept().setDeptNo(id).
                setDeptName("没有对应的"+id+"@hystrixcommond").
                setDbSource("not this database in mysql");
    }


}
