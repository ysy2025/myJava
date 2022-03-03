package com.ysy.day13;

import java.sql.SQLOutput;

/*
Object类的使用
Object类是所有java类的根父类
如果在类声明中没有显示表明extends的父类,默认extends Object类

属性没有
方法 equals,toString,getClass,hashCode,clone,finalize
wait,notify-多线程
Object类的方法和属性具有通用性
Object只声明了一个空参数的构造器

final-关键字
finally-无意义
finalizie-垃圾回收机制
 */
public class Object01 implements Cloneable{
    int id = 1;
    int weight = 10;
    String name = "zhangsan";

    public static void main(String[] args) {
        Object01 object01 = new Object01();

        System.out.println(object01.id);
        System.out.println(object01.name);
        System.out.println(object01.getClass());
        try {
            Object01 object02 = (Object01) object01.clone();
            System.out.println(object02.id);

            System.out.println(object02 == object01);

            System.out.println(object01.equals(object02));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}

