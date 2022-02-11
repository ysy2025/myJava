package com.ysy.day05;

/*
数组
多个相同类型的数据按照一定顺序排列;通过编号对数据进行统一管理.

数组概念
数组名
元素
下表
数组长度
数组是有序排列的.

数组是引用数据类型的变量.
数组的元素既可以基本数据类型也可以是引用数据类型.
创建数组对象时会在内存中开辟一块连续空间;数组名中引用的的是这块空间的首地址.
数组长度一旦确认,无法更改.
可以通过下标或者索引方式调用指定位置的元素.
按照维度区分为一维二维...
按照元素数据类型分为基本数据类型,引用数据类型...
 */
import java.util.ArrayList;
import com.ysy.day04.Utility01;
public class Array01 {
    public static void main(String[] args) {
        ArrayList<String> myArray = new ArrayList<>();

//        Utility01 myUtility = new Utility01();
        String a = Utility01.readKeyBoard(10);
        for (int i = 0; i < a.length(); i++){
            myArray.add(""+a.charAt(i));
        }
        System.out.println(myArray);

        System.out.println("index 9 in myarray is " + myArray.indexOf("z"));
        System.out.println("size of my array is " + myArray.size());

        System.out.println(myArray.toString());

        System.out.println(myArray.get(0));


        for (int i = 0; i < 10; i++){
            String b = Utility01.readKeyBoard(30);
            myArray.add(b);
        }
        System.out.println(myArray);
    }

}
