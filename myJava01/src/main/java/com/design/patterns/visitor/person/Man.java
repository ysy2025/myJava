package com.design.patterns.visitor.person;

import com.design.patterns.visitor.actor.Action;

/**
 * 这里使用了双分派,即首先在客户端程序中,将具体状态作为参数,传递到man中,进行一次分派
 * 然后,man这个类,调用了参数的具体方法,同时将自己作为参数传入,这个地方是第二次分派
 */
public class Man extends Person{
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
