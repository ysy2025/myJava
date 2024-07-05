package com.ysy.design.patterns.command.controller;

import com.ysy.design.patterns.command.command.Command;
import com.ysy.design.patterns.command.command.NoCommand;

public class Controller {
    // 开 按钮的命令数组
    Command[] onCommands;
    Command[] offCommands;

    // 撤销命令
    Command undoCommand;

    // 构造器,完成按钮初始化

    public Controller() {
        onCommands = new Command[5];
        offCommands = new Command[5];

        for(int i = 0; i <5; i++){
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();

        }
    }

    // 给我们的按钮设置需要的命令
    public void setCommand(int no, Command onCommand, Command offCommand){
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    public void onButtonWasPushed(int no){
        // 找到你按下的按钮
        onCommands[no].execute();

        // 记录操作,用于撤销
        undoCommand = onCommands[no];
    }

    public void offButtonWasPushed(int no){
        // 找到你按下的按钮
        offCommands[no].execute();

        // 记录操作,用于撤销
        undoCommand = offCommands[no];
    }

    public void undoButtonWasPushed(){
        // 找到你按下的按钮
        undoCommand.undo();
    }
}
