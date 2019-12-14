package com.wuzhixin.springcloud.controller;

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
     * 返回集合
     * @return
     */
    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<Dept> list(){
        return deptService.list();
    }
    /**
     * 添加一个实体
     * @param dept
     * @return
     */
    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept){
        return deptService.add(dept);
    }
    /**
     * 得到一个实体
     * @param id
     * @return
     */
    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    public Dept getDeptById(@PathVariable("id") Long id){
        return deptService.get(id);
    }


}
