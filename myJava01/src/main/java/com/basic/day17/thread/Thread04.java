package com.basic.day17.thread;

/**
 * 优先级问题
 * getPriority
 * setPriority
 * 高优先级的抢占,但是只是从概率的角度来说,高优先级的线程很高概率提前执行,但是不是说,只有在高优先级的线程执行完成后再执行低优先级
 */
public class Thread04 {
    public static void main(String[] args) {
        herThread herthread = new herThread();
        herthread.setPriority(10);
        herthread.start();


        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        for (int i = 0; i < 100; i ++){
            if (i %2 == 0){
                System.out.println("name is " + Thread.currentThread().getName() + "  priority is " + Thread.currentThread().getPriority() + "    " + i  + "    是偶数");
            }
        }

    }
}

class herThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i ++){
            if (i %2 == 0){
                System.out.println(Thread.currentThread().getName() + "  priority is " + Thread.currentThread().getPriority() + "    " + i  + "    是偶数");
            }
        }
    }
}