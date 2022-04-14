package com.basic.day18.string;

import org.junit.Test;

/**
 * 字符串拼接的底层原理
 *   字面量连接(常量和常量的拼接)还是在常量池中
 *   变量名(变量)参与了拼接,就是在堆空间
 */
public class StringTest3 {

    @Test
    public void test1(){
        String s1 = "JavaEE";
        String s2 = "hadoop";
        String s3 = "JavaEEhadoop";
        String s4 = "JavaEE" + "hadoop";
        String s5 = s1 + "hadoop";
        String s6 = "javaEE" +s2;
        String s7 = s1 + s2;

        System.out.println(s3 == s4);
        System.out.println(s3 == s5);
        System.out.println(s3 == s6);
        System.out.println(s3 == s7);
        System.out.println(s4 == s5);
        System.out.println(s4 == s6);
        System.out.println(s4 == s7);
        System.out.println(s5 == s7);
        System.out.println(s5 == s6);
        System.out.println(s6 == s7);

        String s8 = s7.intern(); // 返回值得到的值,是常量值中存在的,常量池中
        System.out.println(s4 == s8);
    }
}
