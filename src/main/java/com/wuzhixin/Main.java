package com.wuzhixin;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wuzhixin
 * @date 2019/12/30 17:35
 * @desc
 */
public class Main {
    private static List<re> list = new ArrayList<>();
    public static void main(String[] args) {


        double r1 =0,r2=0,r3=0;

      for(double i = 0;i<13;i=i+0.01){
          double x = Double.parseDouble(String.format("%2f",11-i));
          double y = Double.parseDouble(String.format("%2f",13-i));
        //  double y = 13 -i;
          double tmp = Double.parseDouble(String.format("%2f",i));

          double result = x+y;
         if(isIntegerForDouble(result)){
             if(24-2*tmp==11){
                 r1=tmp;
                 r2=11-tmp;
                 r3=13-tmp;
                 list.add(new re(r1,r2,r3));
             }
             if(24-2*tmp==13){
                 r1=tmp;
                 r2=11-tmp;
                 r3=13-tmp;
                 list.add(new re(r1,r2,r3));
             }
         }

      }
    //    System.out.println(list.size());
      list.stream().forEach(System.out::println);
    }

    /**
     * 判断double是否是整数
     * @param obj
     * @return
     */
    public static boolean isIntegerForDouble(double obj) {
        double eps = 1e-10;  // 精度范围
        return obj-Math.floor(obj) < eps;
    }
}

class re{
    double a;
    double b;
    double c;


    public re(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public String toString() {
        return "re{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
