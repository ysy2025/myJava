package com.basic.day18.stringbuffer;

import org.junit.Test;

/**
 * Stringbuffer stringbuilder string 三者异同
 * string:不可变,早期就有;底层用char[];
 * stringbuffer:可变字符序列,线程安全的;效率低;用多线程的用;底层用char[];
 * stringbuilder:可变字符序列,线程不安全的;效率高;jdk5.0引入;不用多线程的时候用;底层用char[];
 *
 *
 */
public class StringBufferTest1 {

    @Test
    public void test1(){
        String a = "zhangsan";
        String b = a.replace("zh", "ch");
        System.out.println(a + "====" + b);

        StringBuffer sb = new StringBuffer("zhangsan");
        sb.reverse();
        System.out.println(sb);
    }
}
