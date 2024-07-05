package com.ysy.basic.day17.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * 使用callable创建线程
 * 1,创建一个实现了callable的实现类
 * 2,实现call方法,将此线程,需要执行的操作,声明在call方法中
 * 3,创建callable接口实现类的对象
 * 4,将此callable实现类的对象,作为参数,传递到futuretask构造器中,创建futuretask对象
 * 5,future task对象作为参数,传递到thread类的构造器中,创建thread对象,调用start方法
 * 6,获取返回值
 *
 */
public class CallTest {
    public static void main(String[] args) throws Exception {
        NumThread numThread = new NumThread();
//        numThread.call(); // 方式1
//        FutureTask futureTask = new FutureTask(numThread);
        FutureTask<Integer> futureTask = new FutureTask<>(numThread);
        System.out.println("!!!!!!!!!!!!!!!!");

        new Thread(futureTask).start();

        try{
            System.out.println("@@@@@@@@@@@@@@@@@@");
            Object sum = futureTask.get();
            System.out.println("sdfadsfasdf");
            System.out.println(sum);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class NumThread implements Callable<Integer>{
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 10; i++){
            if (i%2 == 0){
                System.out.println("线程为 " + Thread.currentThread().getName() + " i 是 " + i);
                sum += i;
            }
        }
        return sum;
    }
}
