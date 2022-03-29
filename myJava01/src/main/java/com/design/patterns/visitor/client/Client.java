package com.design.patterns.visitor.client;

import com.design.patterns.visitor.actor.Fail;
import com.design.patterns.visitor.actor.Success;
import com.design.patterns.visitor.person.Man;
import com.design.patterns.visitor.person.Woman;
import com.design.patterns.visitor.structure.Structure;

public class Client {
    public static void main(String[] args) {
        // 创建structure
        Structure structure = new Structure();

        structure.attach(new Man());
        structure.attach(new Woman());

        // 成功
        Success success = new Success();
        structure.display(success);

        System.out.println("===========================");

        // 失败
        Fail fail = new Fail();
        structure.display(fail);


    }
}
