package com.design.patterns.visitor.actor;

import com.design.patterns.visitor.person.Man;
import com.design.patterns.visitor.person.Woman;

public abstract class Action {
    // 得到男性测评结果
    public abstract void getManResult(Man man);

    public abstract void gerWomanResult(Woman woman);
}

