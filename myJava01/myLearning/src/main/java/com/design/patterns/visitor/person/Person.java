package com.design.patterns.visitor.person;

import com.design.patterns.visitor.actor.Action;

public abstract class Person {
    // 一个方法,让访问者可以访问.
    public abstract void accept(Action action);
}
