package com.design.patterns.adapter.classadapter.client;

import com.design.patterns.adapter.classadapter.adapter.Adapter;
import com.design.patterns.adapter.classadapter.phone.Phone;

public class Client {
    public static void main(String[] args) {
        System.out.println("这是类适配器");

        // create phone
        Phone phone = new Phone();

        // charging
        phone.charging(new Adapter());
    }
}
