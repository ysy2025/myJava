package com.ysy.design.patterns.command.receiver;

public class Receiver {

    public void on(){
        System.out.println("打开!");
    }
    public void off(){
        System.out.println("关闭!");
    }
}
