package com.basic.day17.deadlock;

/**
 * 1,死锁的理解:不同线程分别占用对方需要的同步资源不放弃,都在等待对方放弃资源
 * 2,说明
 *  出现死锁后,不会出现异常,不会出现提示,只是所有线程都处于阻塞状态,无法继续
 *  使用同步时,需要避免死锁
 */
public class Dead {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();

        new Thread(){
            @Override
            public void run() {
                synchronized (sb1){
                    sb1.append("a");
                    sb2.append("1");

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (sb2){
                        sb1.append("b");
                        sb2.append("2");

                        System.out.println("sb1 is: " + sb1 + " sb2 is " + sb2);
                    }
                }
            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (sb2){
                    sb1.append("c");
                    sb2.append("3");

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (sb1){
                        sb1.append("d");
                        sb2.append("4");

                        System.out.println("sb1 is: " + sb1 + " sb2 is " + sb2);
                    }
                }
            }
        }).start();
    }

}
