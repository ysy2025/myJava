package com.basic.day17.thread;

/**
 * 多线程创建1:继承thread类
 * 1,创建thread子类
 * 2,重写run方法
 * 3,实例化对象
 * 4,通过对象,调用start方法
 */
class myThread extends Thread{
    public void show(int input){
        for(int i = 0; i < input; i++){
            if (i%2==0){
                System.out.println(i + " 是偶数");
            }
        }
    }

    @Override
    public void run() {
        show(100);
    }
}

public class Thread01{
    public static void main(String[] args) {
        myThread myThread = new myThread();
        myThread.start();

//        System.out.println("hello");
        for(int i = 0; i < 100; i++){
            if (i%2!=0){
                System.out.println("zhangsanniubi");
            }
        }
    }
}