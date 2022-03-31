package com.basic.day17.thread;

public class Thread02 {
    public static void main(String[] args) {
        myThread01 mythread01 = new myThread01();

        myThread02 mythread02 = new myThread02();

        mythread01.start();
        mythread02.start();

        //创建thread的匿名子类的方式
        new Thread(){
            @Override
            public void run() {
                for(int i = 0; i < 100; i++){
                    if (i%2==0){
                        System.out.println(Thread.currentThread().getName() + "   " + i  + "    是偶数");
                    }
                }
            }
        }.start();


    }

}

class myThread01 extends Thread{
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

class myThread02 extends Thread{
    public void show(int input){
        for(int i = 0; i < input; i++){
            if (i%2!=0){
                System.out.println(Thread.currentThread().getName() + "   " + i  + "    是奇数");
            }
        }
    }

    @Override
    public void run() {
        show(100);
    }
}