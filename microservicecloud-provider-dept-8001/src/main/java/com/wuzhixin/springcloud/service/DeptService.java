package com.wuzhixin.springcloud.service;

import com.wuzhixin.springcloud.entities.Dept;

import java.util.List;

/**
 * @author wuzhixin
 * @date 2019/11/22 23:50
 * @desc
 */
public interface DeptService {
    boolean add(Dept dept);
    Dept get(Long id);
    List<Dept> list();

}
