package com.ysy.basic.day17.thread;

/**
 * 测试 thread 常用方法
 * start 启动当前线程,调用当前线程的run方法
 * run 通常需要重写,方法体是将创建的线程要执行的操作
 * currentThread() 静态方法,返回当前代码执行的线程
 * setName 设置当前现场名称
 * getName 获取当前线程名称
 * yield 线程临时释放当前cpu的执行权
 * join 当前线程和另外的线程的合并(当前停止,切换到另外线程,直到另外线程结束,再启动当前线程)
 * stop 强制执行当前线程
 * sleep 让当前线程休息
 */

class hisThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i ++){
            if (i %2 == 0){
                System.out.println(Thread.currentThread().getName() + "   " + i  + "    是偶数");
            }


            // 这里sleep 需要 try catch,而不能在方法上继承exception,因为父类方法没有继承exception,子类的exception不能比父类的异常更root
            if (i%20 == 0){
//                this.yield();
//                this.stop();
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class hisThread02 extends Thread{

    public hisThread02(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i ++){
            if (i %2 == 0){
                System.out.println(Thread.currentThread().getName() + "   " + i  + "    是偶数");
            }

            if (i%20 == 0){
                this.yield();
            }
        }
    }
}


public class Thread03 {
    public static void main(String[] args) throws InterruptedException {
        hisThread histhread = new hisThread();
        //setName
        histhread.setName("main");
        histhread.start();

        // 主线程命名
        Thread.currentThread().setName("lisi");
        for (int i = 0; i < 100; i ++){
            if (i %2 == 0){
                System.out.println(Thread.currentThread().getName() + "   " + i  + "    是偶数");
            }

            if(i == 56){
                histhread.join();
            }
        }

        hisThread02 histhread02 = new hisThread02("孙悟空");
        histhread02.start();
    }
}


