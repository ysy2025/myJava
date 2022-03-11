package com.ysy.day15;

/*
* jdk8中,除了定义全局变量和抽象方法之外,interface还可以定义静态方法和默认方法
*
 */
public interface CompareA {
    // 静态方法, 接口中定义的静态方法,只能接口自己使用,类没办法调用
    public static void method1() {
        System.out.println("Compare A beijing");
    }

    // 默认方法
    public default void method2(){
        System.out.println("Compare B shanghai");
    }

    // public 可以省略
    default void method3(){
        System.out.println("Compare C hefei");
    }
}
