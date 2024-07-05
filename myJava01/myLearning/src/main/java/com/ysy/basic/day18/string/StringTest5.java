package com.ysy.basic.day18.string;

import org.junit.Test;

import java.util.Arrays;

public class StringTest5 {
    @Test
    public void test1(){
//        String a = "123";
//        int b = Integer.parseInt(a);
//        System.out.println(b);
//
//        String c = String.valueOf(b);
//        System.out.println(c);

        String d = "zhangsan";
        char[] charArray = d.toCharArray();
        for(int i = 0; i < charArray.length; i++){
            System.out.println(charArray[i]);
        }

//        char[] chararray2 = {'a','b','c','d'};
//        String s = new String(chararray2);
//        System.out.println(s);

        byte[] bs = d.getBytes();
        System.out.println(Arrays.toString(bs));
        for(int i = 0; i < bs.length; i++){
            System.out.println(bs[i]);
        }

        byte[] aa = {122, 104, 97, 110, 103, 115, 97, 110};
        String aaa = new String(aa);
        System.out.println(aa);
    }
}
