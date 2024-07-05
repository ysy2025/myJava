package com.basic.day17.lock;

/**
 * 使用同步方法解决runnable接口的安全问题
 */
public class Sync3 {
    public static void main(String[] args) {
        C c = new C();
        Thread thread = new Thread(c);
        Thread thread2 = new Thread(c);
        Thread thread3 = new Thread(c);

        thread.start();
        thread2.start();
        thread3.start();
    }
}

class C implements Runnable{
    public static int tickets = 100;
    static Object obj = new Object();

    @Override
    public void run() {
        while(true){
            show();
        }
    }
    private synchronized void show(){
//        synchronized (this){
            if (tickets > 0){
                System.out.println(Thread.currentThread().getName() + "线程名 + 还剩下 " + tickets + "张票");
                tickets -= 1;
            }
//        }
    }
}