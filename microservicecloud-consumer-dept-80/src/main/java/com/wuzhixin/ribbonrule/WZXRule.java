package com.wuzhixin.ribbonrule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;
import java.util.Random;

/**
 * @author wuzhixin
 * @date 2019/12/3 13:08
 * @desc
 */
public class WZXRule extends AbstractLoadBalancerRule {
    private int totalcount = 0; // 记录请求次数
    private int machineindex = 0 ; // 服务器下标
    private Random rand = new Random();

    public Server choose(ILoadBalancer lb, Object key) {
        if (lb == null) {
            return null;
        } else {
            Server server = null;

            while(server == null) {
                if (Thread.interrupted()) {
                    return null;
                }

                List<Server> upList = lb.getReachableServers();
                List<Server> allList = lb.getAllServers();
                int serverCount = allList.size();
                if (serverCount == 0) {
                    return null;
                }
               /* int index = this.rand.nextInt(serverCount);
                server = (Server)upList.get(index);  根据索引选择*/
               // start by wuzhixin 每台轮询五次
               if(totalcount<5){
                   server = (Server)upList.get(machineindex);//得到服务
                   totalcount++;
               }else{
                   if(totalcount>=5){
                       totalcount=0;
                       machineindex++;
                   }
                   if(machineindex>=upList.size()){
                       machineindex=0;
                   }
               }
               // end by wuzhixin

                if (server == null) {
                    Thread.yield();
                } else {
                    if (server.isAlive()) {
                        return server;
                    }

                    server = null;
                    Thread.yield();
                }
            }

            return server;
        }
    }

    public Server choose(Object key) {
        return this.choose(this.getLoadBalancer(), key);
    }

    public void initWithNiwsConfig(IClientConfig clientConfig) {
    }
}