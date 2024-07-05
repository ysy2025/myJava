package com.basic.day17.communication;

/**
 * 线程通信的三个方法
 * wait
 * notify
 * notifyAll
 *
 * wait方法,一旦执行此方法,当前线程进入阻塞状态,并释放同步监视器,其他线程可以拿到同步监视器,接着进入同步代码块中
 * notify,一旦执行此方法,唤醒wait的一个线程;多个线程同时wait,唤醒优先级更高的
 * notifyAll,唤醒所有
 *
 * 说明:
 * 1.线程通信的前提->同步代码块或同步方法中使用
 * 2.上述三个方法的调用者,必须是同步代码块或同步方法块中的同步监视器
 *      否则会报错 非法监视器错误
 * 3.上述三个方法是定义在java.lang.Object类中
 *
 * sleep 和 wait 的异同
 *      相同:都可以让当前线程阻塞
 *      不同:1,sleep和wait定义的位置不同;thread类中声明sleep;object类中声明wait
 *           2,调用范围不同:sleep想调用就调用;wait方法,必须是同步监视器调用(同步代码块或同步方法中)
 *           3,都在同步代码块(同步方法)中运用时,sleep不会释放同步监视器(当前不休息,等待的也要等),wait则会释放同步监视器(当前休息,换下一个干活)
 */
class Number implements Runnable{
    private static int number = 1;
    @Override
    public void run() {
        while(true){
            synchronized (this) {

                // 通信,让wait的线程起来干活
                notify();

                if (number <= 100) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "the number is:" + number);
                    number++;

                    try {
                        // wait 方法,使得调用wait方法的线程进入阻塞状态
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }
    }
}
public class Comm {
    public static void main(String[] args) {
        Number number = new Number();
        Thread thread1 = new Thread(number);
        Thread thread2 = new Thread(number);

        thread1.setName("线程1");
        thread2.setName("线程2");

        thread1.start();
        thread2.start();
    }
}
