package com.basic.day17.deadlock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 解决线程安全问题的方式 lock锁,jdk5.0新增
 *
 * 面试题 synchronized & lock
 *  同:都可以解决线程安全问题
 *  异:lock需要自己手动加锁解锁;synchronized 在执行完相应代码块之后自动释放监视器
 *
 *
 */

class Person implements Runnable{
    private int ticket = 100;

    // Lock 解决线程安全问题, 实例化 reentranlock
    private ReentrantLock lock = new ReentrantLock();


    @Override
    public void run() {
        while (true){
            try{
                // 调用lock方法,确保是单线程的.
                lock.lock();
                if (ticket > 0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("线程: " + Thread.currentThread().getName() + "售票,票号码为 " + ticket);
                    ticket --;
                }else{
                    break;
                }
            }finally {
                // 解锁
                lock.unlock();
            }
        }
    }
}
public class Lock2 {
    public static void main(String[] args) {
        Person person = new Person();
        Thread thread1 = new Thread(person);
        Thread thread2 = new Thread(person);
        Thread thread3 = new Thread(person);


        thread1.start();
        thread2.start();
        thread3.start();
    }
}
