package com.ysy.basic.day03;

/*
位运算符
<<左移
>>右移
>>>无符号右移
&与
|或
^异或
~取反

异或
(m^n)^n = m
(m^n)^m = n
这个公式很重要

三元运算符
(条件表达式) ? 表达式1 : 表达式2
结果是boolean类型
根据条件表达式结果,决定执行表达式1或2
true->表达式1,false->表达式2
表达式1和表达式2需要保持一致.
表达式可以嵌套
 */
public class Calc06 {
    public static void main(String[] args) {
        System.out.println("zhangsan");

        int a = 8;
        int b = 13;

        int c = a^b;
        int d = c^b;
        int e = c^a;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
