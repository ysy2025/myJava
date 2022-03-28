package com.design.patterns.command.command;

import com.design.patterns.command.receiver.Receiver;

public class OnCommand implements Command {

    // 聚合Receiver
    Receiver receiver;

    // 构造器
    public OnCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("进攻!~");
        receiver.on();
    }

    @Override
    public void undo() {
        System.out.println("撤退!~");
        receiver.off();
    }
}
