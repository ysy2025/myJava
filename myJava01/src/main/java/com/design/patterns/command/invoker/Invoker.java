package com.design.patterns.command.invoker;

import com.design.patterns.command.command.Command;

public class Invoker {
    // 初始化 cmd
    Command cmd = null;

    // 构造器
    public Invoker(Command cmd) {
        this.cmd = cmd;
    }

    public void publish(Command cmd){
        System.out.println("听我命令!");
        cmd.execute();
    }
}
