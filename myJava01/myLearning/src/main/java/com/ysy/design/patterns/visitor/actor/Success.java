package com.ysy.design.patterns.visitor.actor;

import com.ysy.design.patterns.visitor.person.Man;
import com.ysy.design.patterns.visitor.person.Woman;

public class Success extends Action {

    @Override
    public void getManResult(Man man) {
        System.out.println("男人成功了");
    }

    @Override
    public void gerWomanResult(Woman woman) {
        System.out.println("女人成功了");
    }
}
