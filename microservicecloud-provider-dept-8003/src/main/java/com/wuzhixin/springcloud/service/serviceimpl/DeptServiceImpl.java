package com.wuzhixin.springcloud.service.serviceimpl;

import com.wuzhixin.springcloud.dao.DeptDao;
import com.wuzhixin.springcloud.entities.Dept;
import com.wuzhixin.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wuzhixin
 * @date 2019/11/22 23:51
 * @desc 接口符合restful 接口风格
 */
@Service
public class DeptServiceImpl implements DeptService {


    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean add(Dept dept) {
        return deptDao.addDept(dept) ;
    }

    @Override
    public Dept get(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }
}
