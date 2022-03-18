package com.basic.day13;

import org.junit.Test;

/*
* 基本数据类型和包装类->String类型
* 1,直接做连接计算
* 2,调用String类型的valueOf方法
*
* String->基本类型和包装类
* 调用包装类中的Parsexxx
 */
public class Wrapper02 {

    @Test
    public void test2(){
        String str = "123";

        //int num1 = (int) str; // 不行的,强行转换是不行的;可以强转的,必须是有父子类的关系
        // Integer int1 = (Integer) str;  // 不行的,强行转换是不行的;可以强转的,必须是有父子类的关系

        int num1 = Integer.parseInt(str);
        System.out.println(num1);

        String str2 = "true1";
        boolean b1 = Boolean.parseBoolean(str2);
        System.out.println(b1);
    }

    @Test
    public void test1(){
        int num1 = 10;
        // String str1 = num1; // 没办法直接运算
        String str2 = num1 + "";

        System.out.println(str2);

        // 方法2 valueOf 自动拆箱
        String str3 = String.valueOf(num1);
        System.out.println(String.valueOf(num1));

        Double d1 = new Double(12.4);
        String str4 = String.valueOf(d1);

        System.out.println(str4);


    }
}
