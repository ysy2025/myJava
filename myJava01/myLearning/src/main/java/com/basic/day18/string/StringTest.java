package com.basic.day18.string;

import org.junit.Test;

/**
 * String 使用
 */
public class StringTest {
    /**
     string类,代表字符串
     string是一个final,代表不可变的字符序列
     字符串是常量,双引号,创建后不能更改
     string对象的字符内容是存储在一个字符数组的value[]中
     string 实现了Serializable接口,可以序列化,字符串是支持序列化的,等到IO流的时候回说
            实现了comparable接口,可以比较大小

     通过字面量的方式,而不是new的方式,给一个字符串赋值,此时的字符串,声明在字符串常量池中,
     字符串常量池中,是不会存储相同内容的字符串的.

     不可变性,体现在,对字符串重新赋值的时候,需要重写指定内存区域赋值,不能使用原有的value赋值
                    当对现有的字符串进行连接操作的时候,也要重新指定内存区域赋值,不能使用原有value赋值
                    当调用string的replace方法修改字符的时候,
     */


    @Test
    public void test1(){
        String s1 = "hello";//string是类,但是不需要用new,直接得到;字面量的定义
        String s2 = "hello";
//        s1 = "lisi";

        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode() + " == " + s2.hashCode());

        String s3 = "hello";
        System.out.println(s3.hashCode());
        s3 += "df";
        System.out.println(s3.hashCode());

        String s4 = "hello";
        System.out.println(s4.hashCode());
        s4 = s4.replace("l", "aaa");
        System.out.println(s4.hashCode());
    }
}
