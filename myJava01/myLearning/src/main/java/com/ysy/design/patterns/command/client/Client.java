package com.ysy.design.patterns.command.client;

import com.ysy.design.patterns.command.command.OffCommand;
import com.ysy.design.patterns.command.command.OnCommand;
import com.ysy.design.patterns.command.controller.Controller;
import com.ysy.design.patterns.command.receiver.Receiver;

public class Client {
    public static void main(String[] args) {
        // 使用命令设计模式,通过遥控器,对电灯进行操作

        // 创建点灯对象
        Receiver receiver = new Receiver();

        // 创建点灯相关开关命令
        OnCommand onCommand = new OnCommand(receiver);
        OffCommand offCommand = new OffCommand(receiver);

        // 创建遥控器
        Controller controller = new Controller();

        // 给遥控器设置相关命令,no=0是电灯开关
        controller.setCommand(0, onCommand, offCommand);

        System.out.println("--------------");
        controller.onButtonWasPushed(0);
    }
}
