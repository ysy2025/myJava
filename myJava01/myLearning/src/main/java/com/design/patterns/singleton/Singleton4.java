package com.design.patterns.singleton;

/*
单例模式:
采取一定的方式确保整个软件系统中,某个类只有1个对象实例,而且该类只提供一个取的戚对象实例的方法(静态方法);

单例模式,在jdk中的源码:
Runtime,饿汉式
 */
public class Singleton4 {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();

        System.out.println(rt.freeMemory());
    }
}
