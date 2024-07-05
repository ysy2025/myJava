package com.basic.day17.product;

public class Clerk {

    private int number = 0;

    public synchronized void produceProduct() {
        if (number < 20){
            number ++;
            System.out.println(Thread.currentThread().getName() + "开始生产第 " + number + "个产品");
            notify();
        }else{
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public synchronized void consumeProduct() {
        if (number > 0){
            System.out.println(Thread.currentThread().getName() + "开始消费第 " + number + "个产品");
            number --;
            notify();
        }else{
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
