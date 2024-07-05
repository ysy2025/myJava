package com.ysy.basic.day17.lock;

/**
 * 同步监视器的方式来解决线程危机;
 * 俗称锁,任何一个类的对象,都可以充当锁
 * 要求多个线程必须要用同一把锁
 *
 * 好处:解决线程安全问题
 * 操作同步代码的时候只能有一个线程参与,其他线程要等待,相当于是单线程状态,效率低
 */
public class Sync {
    public static void main(String[] args) {
        A a = new A();
        Thread thread = new Thread(a);
        thread.start();

    }
}

class A implements Runnable{
    public static int tickets = 100;
    Object obj = new Object();

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