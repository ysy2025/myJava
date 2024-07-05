package com.ysy.design.patterns.visitor.actor;

import com.ysy.design.patterns.visitor.person.Man;
import com.ysy.design.patterns.visitor.person.Woman;

public class Fail extends Action {

    @Override
    public void getManResult(Man man) {
        System.out.println("男人失败了");
    }

    @Override
    public void gerWomanResult(Woman woman) {
        System.out.println("女人失败了");
    }
}
