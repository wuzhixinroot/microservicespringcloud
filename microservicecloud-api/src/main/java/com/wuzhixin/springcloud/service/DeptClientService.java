package com.wuzhixin.springcloud.service;

import com.wuzhixin.springcloud.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author wuzhixin
 * @date 2019/12/3 21:53
 * @desc
 */
// 接口绑定一个微服务
@FeignClient(value = "MICROSERVICECLOUD-DEPT",
             fallbackFactory=DeptClientServiceFallbackFactory.class
)
//@Component
public interface DeptClientService {

    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<Dept> list();
    /**
     * 添加一个实体
     * @param dept
     * @return
     */
    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept);
    /**
     * 得到一个实体
     * @param id
     * @return
     */
    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    public Dept getDeptById(@PathVariable("id") Long id);


}
