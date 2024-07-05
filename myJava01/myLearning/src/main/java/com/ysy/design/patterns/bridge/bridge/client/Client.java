package com.ysy.design.patterns.bridge.bridge.client;

import com.ysy.design.patterns.bridge.bridge.brand.Xiaomi;
import com.ysy.design.patterns.bridge.bridge.phone.FoldPhone;
import com.ysy.design.patterns.bridge.bridge.phone.Phone;

public class Client {

    public static void main(String[] args) {

        // 手机
        Phone phone = new FoldPhone(new Xiaomi());
        phone.open();
        phone.close();
        phone.call();



    }
}
