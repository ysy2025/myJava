package com.ysy.design.patterns.command.command;

import com.ysy.design.patterns.command.receiver.Receiver;

public class OffCommand implements Command {
    // 聚合Receiver
    Receiver receiver;

    // 构造器
    public OffCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("停止进攻!~");
        receiver.off();
    }

    @Override
    public void undo() {
        System.out.println("停止撤退!~");
        receiver.on();
    }
}
