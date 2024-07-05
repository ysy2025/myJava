package com.ysy.design.patterns.template.client;

import com.ysy.design.patterns.template.milk.Milk;
import com.ysy.design.patterns.template.milk.RedMilk;

public class Client {
    public static void main(String[] args) {
        // 制作红豆豆浆
        System.out.println("制作红豆豆浆");
        Milk redMilk = new RedMilk();
        redMilk.make();
    }
}
