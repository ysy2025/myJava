package com.ysy.basic.day17.thread;

/**
 * 实现runnable的方式
 */
public class WindowTest02 {
    public static void main(String[] args) {
        Window1 window1 = new Window1();

        Thread thread1 = new Thread(window1);
        Thread thread2 = new Thread(window1);
        Thread thread3 = new Thread(window1);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Window1 implements Runnable{
    private static int num = 100;
    @Override
    public void run() {
        while(true){
            if (num > 0){
                System.out.println("线程名是: " + Thread.currentThread().getName() + "卖出去1张票,id是 "+ num);
                num -= 1;
            }
            else{
                break;
            }

        }
    }
}