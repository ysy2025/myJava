package com.design.patterns.command.command;

public class ConcreteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("进攻!~");
    }

    @Override
    public void undo() {
        System.out.println("撤退!~");
    }
}
