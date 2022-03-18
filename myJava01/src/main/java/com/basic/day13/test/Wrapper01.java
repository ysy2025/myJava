package com.basic.day13.test;

import org.junit.Test;

/*
* 针对8种基本数据类型定义响应的引用类型-包装类(封装类)
* 有了类的特点,就可以调用类中的方法,Java才是真的面向对象
*
* 基本数据类型    包装类
* byte          Byte
* short         Short
* int           Integer
* long          Long
* float         Float
* double        Double
* boolean       Boolean
* char          Character
*
* 包装类是类
*
* 基本数据类型,没有包装类,就没办法满足面向对象特征
* 将基本数据类型通过包装类进行包装,封装在一个类中
*
* 父类是Number
*
* 包装类的使用
* 基本类型,包装类,String类的转换
*
*
* 基本<->包装
* java提供了8种基本数据类型对应的包装类；使得基本数据类型的变量具有类的特征
* 基本->包装类
* Boolean b1 = new Boolean("true");
* 包装类->基本
* 调用包装类的xxxvalue()方法
 */

/*
*JDK5.0增加了一个自动装箱和拆箱
*
*
*
 */
public class Wrapper01 {
    public static void main(String[] args) {
        Byte b1 = 0;
        Character c1 = 'a';

        System.out.println("b1 is " + b1 +" c1 is " + c1);



    }
    @Test
    public void testEquals() {
        String s1 = "mm";
        String s2 = "aa";
        System.out.println(s1 == s2);
    }

    // 基本数据类型-->包装类,调用包装类的构造器
    @Test
    public void test1(){
        int n1 = 10;
        Integer in1 = new Integer(n1);
        System.out.println(in1.toString());

        Integer in2 = new Integer("123");
        System.out.println(in2.toString());

        Float f1 = new Float("12.3");
        System.out.println(f1);

        // boolean
        Boolean b1 = new Boolean("true");
        Boolean b2 = new Boolean(true);
        Boolean b3 = new Boolean("true123");
        // 源码的研读!
        System.out.println(b1 + "    " + b2 + "    " + b3);


    }

    @Test
    public void test2(){
        Order order = new Order();
        // boolean类型的默认初始化为0;Boolean,是没办法默认初始化的,因为已经是类了
        System.out.println(order.Male);
        System.out.println(order.Female);
    }

    @Test
    public void test3(){
        Integer i1 = new Integer(100);
        System.out.println(i1.intValue()); // 这里转换成int类型了

        Float f1 = new Float(12.3);
        System.out.println(f1.floatValue());

    }

    public void method(Object obj){
        System.out.println("zhangsan");
    }

    @Test
    public void test4(){
        int num1 = 3;
        //基本数据类型->包装类
        /*
        * 自动装箱 部分 替代了包装类了
        * int num1 = 3;
        * Integer i1 = num1;
        *
        * 就不用包装类了
        * boolean b1 = true;
        * Boolean b2 = b1;
        *
        * 自动拆箱
        * 之前需要 i1.toString()
        * 现在
        * int num3 = i1;
        * 直接拆箱了
         */
        Integer i1 = new Integer(num1);
        method(i1);
        method(num1);
    }

}

class Order {
    boolean Male;
    Boolean Female;
}