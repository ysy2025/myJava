package com.design.patterns.command.receiver;

import com.design.patterns.command.command.Command;

public class Receiver {

    public void on(){
        System.out.println("打开!");
    }
    public void off(){
        System.out.println("关闭!");
    }
}
