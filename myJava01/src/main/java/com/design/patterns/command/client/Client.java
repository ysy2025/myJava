package com.design.patterns.command.client;

import com.design.patterns.command.command.ConcreteCommand;
import com.design.patterns.command.invoker.Invoker;
import com.design.patterns.command.receiver.Receiver;

public class Client {
    public static void main(String[] args) {
        // 命令发布者
        Invoker invoker = new Invoker(new ConcreteCommand());

        // 命令接受者
        Receiver receiver = new Receiver(new ConcreteCommand());

        // 发布命令
        invoker.publish(new ConcreteCommand());
    }
}
