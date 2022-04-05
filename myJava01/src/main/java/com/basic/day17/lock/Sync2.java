package com.basic.day17.lock;

/**
 * 继承类的方式的sync的实现
 */
public class Sync2 {
    public static void main(String[] args) {
        B b = new B();
        B b2 = new B();
        B b3 = new B();
        b.start();
        b2.start();
        b3.start();
    }
}

class B extends Thread{
    public static int tickets = 100;
    static Object obj = new Object();

    @Override
    public void run() {
        while(true){
            synchronized(obj){
                if (tickets > 0){
                    System.out.println(Thread.currentThread().getName() + "线程名 + 还剩下 " + tickets + "张票");
                    tickets -= 1;
                }else{
                    break;
                }
            }
        }
    }
}