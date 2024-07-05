package com.ysy.design.patterns.visitor.person;

import com.ysy.design.patterns.visitor.actor.Action;

public class Woman extends Person {
    @Override
    public void accept(Action action) {
        action.gerWomanResult(this);
    }
}
