package com.ysy.basic.day17.thread;

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
                System.out.println(Thread.currentThread().getName() + "   " + i  + "    是偶数");
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
        /**
         * start,启动当前线程;调用当前线程的run方法
         */
        myThread.start();
//            myThread.run();

//        System.out.println("hello");
        for(int i = 0; i < 100; i++){
            if (i%2!=0){
                System.out.println(Thread.currentThread().getName() + "   " + i + "    zhangsanniubi");
            }
        }
        //再启动一个线程,遍历;不能让已经start的线程去执行
        myThread mythead02 = new myThread();
        mythead02.start();
    }
}