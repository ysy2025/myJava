package com.design.patterns.adapter.objectadapter.client;

import com.design.patterns.adapter.objectadapter.adapter.Adapter;
import com.design.patterns.adapter.objectadapter.phone.Phone;
import com.design.patterns.adapter.objectadapter.voltage220.Voltage220;

public class Client {
    public static void main(String[] args) {
        System.out.println("这是类适配器");

        // create phone
        Phone phone = new Phone();

        // charging
        phone.charging(new Adapter(new Voltage220()));
    }
}
