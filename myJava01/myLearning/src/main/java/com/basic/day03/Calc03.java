package com.basic.day03;

/*
比较运算符
==
!=
<
>
<=
>=
instanceof:检查是否是类的对象;instanceof左边显式声明的类型与右边操作元必须是同种类或存在继承关系，也就是说需要位于同一个继承树，否则会编译错误
返回boolean
 */
public class Calc03 {
    public static void main(String[] args) {
        System.out.println(10 > 11);
        Integer a = 10;
        System.out.println(a instanceof Integer);
    }
}
