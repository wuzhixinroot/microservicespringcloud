package com.wuzhixin.springcloud.service;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixThreadPoolKey;
import com.wuzhixin.springcloud.entities.Dept;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wuzhixin
 * @date 2019/12/10 19:19
 * @desc
 */

/*
public class DeptServerServerCircuit extends HystrixCommand<DeptService> {

    protected DeptServerServerCircuit(HystrixCommandGroupKey group) {
        super(group);
    }

    protected DeptServerServerCircuit(HystrixCommandGroupKey group, HystrixThreadPoolKey threadPool) {
        super(group, threadPool);
    }

    protected DeptServerServerCircuit(HystrixCommandGroupKey group, int executionIsolationThreadTimeoutInMilliseconds) {
        super(group, executionIsolationThreadTimeoutInMilliseconds);
    }

    protected DeptServerServerCircuit(HystrixCommandGroupKey group, HystrixThreadPoolKey threadPool, int executionIsolationThreadTimeoutInMilliseconds) {
        super(group, threadPool, executionIsolationThreadTimeoutInMilliseconds);
    }

    protected DeptServerServerCircuit(Setter setter) {
        super(setter);
    }

    @Override
    protected DeptService run() throws Exception {
        return new DeptService() {
            @Override
            public boolean add(Dept dept) {
                return false;
            }

            @Override
            public Dept get(Long id) {
                return new Dept();
            }

            @Override
            public List<Dept> list() {
                return  new ArrayList<Dept>(Arrays.asList(new Dept[]{new Dept(1l,"fwe","wfe")}));

            }
        };
    }
}
*/
