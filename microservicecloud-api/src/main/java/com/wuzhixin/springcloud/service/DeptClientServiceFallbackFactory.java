package com.wuzhixin.springcloud.service;

import com.wuzhixin.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author wuzhixin
 * @date 2019/12/10 14:22
 * @desc
 */
@Component  //一定加在容器中
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

    @Override
    public DeptClientService create(Throwable throwable) {
        /**
         * 匿名内部类处理
         */
        return new DeptClientService() {
            @Override
            public List<Dept> list() {
                return null;
            }

            @Override
            public boolean add(Dept dept) {
                return false;
            }

        /*    @Override
            public Dept getDeptById(Long id) {
                return new Dept().setDeptNo(id).
                        setDeptName("没有对应的"+id+"@hystrixcommond服务,暂时关闭。").
                        setDbSource("not this database in mysql");
            }*/

            @Override
            public Dept getDeptById(Long id) {
                return new Dept().setDeptNo(id).
                        setDeptName("没有对应的"+id+"@hystrixcommond服务,暂时关闭。").
                        setDbSource("not this database in mysql");
            }
        };
    }
}
