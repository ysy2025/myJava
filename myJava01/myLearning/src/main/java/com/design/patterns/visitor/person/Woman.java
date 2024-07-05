package com.design.patterns.visitor.person;

import com.design.patterns.visitor.actor.Action;

public class Woman extends Person{
    @Override
    public void accept(Action action) {
        action.gerWomanResult(this);
    }
}
