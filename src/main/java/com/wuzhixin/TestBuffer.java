package com.wuzhixin;

import org.junit.Test;

import java.nio.ByteBuffer;

/**
 * @author wuzhixin
 * @date 2020/1/1 11:44
 * @desc
 */
public class TestBuffer {

    @org.junit.jupiter.api.Test

    public void test(){


        ByteBuffer btf = ByteBuffer.allocate(1024);
        System.out.println(btf.capacity());
        System.out.println(btf.limit());
        System.out.println(btf.position());

        String str = "abcde";


        btf.put(str.getBytes());

        System.out.println("============");


        System.out.println(btf.capacity());
        System.out.println(btf.limit());
        System.out.println(btf.position());

        btf.flip();  // 切换成读模式

        System.out.println("*************");

        System.out.println(btf.capacity());
        System.out.println(btf.limit());
        System.out.println(btf.position());


        ByteBuffer byteBuffer = btf.get(new byte[btf.limit()]);




        //System.out.println(byteBuffer.);


       // String st = new String(byteBuffer.array(),);
        System.out.println();
        System.out.println();

        System.out.println(byteBuffer.position());
        System.out.println(byteBuffer.limit());
     //  System.out.println(byteBuffer.position());


        System.out.println(new String(byteBuffer.array(),byteBuffer.position(),byteBuffer.limit()));




    }

}
