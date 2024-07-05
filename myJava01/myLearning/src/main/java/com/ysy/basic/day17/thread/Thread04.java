package com.ysy.basic.day17.thread;

/**
 * 创建多线程的方式二,实现runnable接口
 * 1,创建一个实现了runnable接口的类
 * 2,实现类,去实现runnable中的run方法
 * 3,创建实现了类的对象
 * 4,对象作为参数传递给thread类的构造器,创建thread类的对象
 * 5,通过thread类的对象调用start
 *
 * start 两个作用=1,启动线程;2,启动当前线程的run方法
 *
 * 想再启动一个线程呢
 * 再启动一个thread
 */
public class Thread04 {
    public static void main(String[] args) {
        Mthread mthread = new Mthread();
        Thread thread = new Thread(mthread);
        thread.setName("线程1");
        thread.start();

        Thread thread2 = new Thread(mthread);
        thread2.setName("线程2");
        thread2.start();
    }
}

class Mthread implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                System.out.println(i + "是偶数, 线程名是: " + Thread.currentThread().getName());
            }
        }
    }
}