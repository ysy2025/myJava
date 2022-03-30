package com.basic.day17;

/**
 * 多线程,需要借助 Thread 来实现
 *
 */
public class Sample {
    public Sample() {
    }

    public void method1(){
        System.out.println("zhangsan niubi");
    }

    public void method2(){
        System.out.println("lisi niubi");
    }
    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.method1();
    }
}
