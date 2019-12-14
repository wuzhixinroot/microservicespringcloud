package com.wuzhixin.springcloud.dao;

import com.wuzhixin.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author wuzhixin
 * @date 2019/11/22 23:27
 * @desc
 */

@Mapper
public interface DeptDao {

    boolean addDept(Dept dept);
    Dept findById(Long id);
    List<Dept> findAll();
}
