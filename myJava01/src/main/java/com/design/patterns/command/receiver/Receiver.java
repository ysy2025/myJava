package com.design.patterns.command.receiver;

import com.design.patterns.command.command.Command;

public class Receiver {
    // 初始化 cmd
    Command cmd = null;

    public Receiver(Command cmd) {
        this.cmd = cmd;
    }

    public void action(Command cmd){
        cmd.execute();
        System.out.println("兄弟们冲啊");
        cmd.undo();
        System.out.println("兄弟们跑啊");
    }
}
