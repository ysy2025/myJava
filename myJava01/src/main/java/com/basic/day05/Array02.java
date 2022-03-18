package com.basic.day05;

import java.util.Arrays;

/*
一维数组的使用

1,声明和初始化
2,如何调用数组指定位置元素
3,如何获取数组长度
4,遍历数组
5,数组元素默认初始化值
6,数组内存解析


 */
public class Array02 {
    public static void main(String[] args) {
        // 1.一维数组的声明和初始化
        int num;
        num = 10;
        int id = 100;

        //声明;中括号就说明了是数组
        int[] ids;
        //1.1静态初始化,数组初始化和数组元素赋值同时进行
        ids = new int[]{1001,1002,1003,1004};
        //1.2动态初始化,数组初始化和数组元素赋值分开

        //1.3 赋值,角标用来赋值;从0开始到n-1

        String[] names = new String[4];
        names[0] = "zhangsan";
        names[1] = "lisi";
        names[2] = "wangwu";
        names[3] = "heihei";
        System.out.println(Arrays.toString(names));
        String temp = names[1];
        char temp2 = temp.charAt(0);
        System.out.println(temp + temp2);
        // 错误的写法
        //int[] arr1 = new int[];需要定义好长度
        //int[5] arr1 = new int[];长度要在后面定义

        //一旦初始化完成,长度确定
        // 获取数组长度
        System.out.println(names.length);

        String[] names2 = names;
        System.out.println(names.equals(names.clone()));

        System.out.println(names.equals(names2));

        //遍历数组
        for(String s:names){
            System.out.println(s);
        }

        //getClass
        System.out.println(names.getClass());


        // 数组元素默认初始值
        /*
        int 类型默认初始值0
        整型数组元素是0;
        浮点数组元素是0.0;
        数组元素是char类型,默认初始值是'0';
        数组元素是boolean类型,false;
        数组元素是引用类型时,默认null;
         */
        int[] aa = new int[6];
        System.out.println(aa[0]);
        for(int a1:aa){
            System.out.println(a1);
        }
        float[] aa1 = new float[6];
        System.out.println(aa1[0]);
        for(float a1:aa1){
            System.out.println(a1);
        }

        char[] aa2 = new char[6];
        System.out.println(aa1[0]);
        for(char a1:aa2){
            System.out.println(a1);
        }

    }

    }
