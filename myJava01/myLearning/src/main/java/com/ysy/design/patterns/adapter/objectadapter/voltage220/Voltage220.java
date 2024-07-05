package com.ysy.design.patterns.adapter.objectadapter.voltage220;

public class Voltage220 {

    public int output220(){
        int src = 220;
        System.out.println("电压 = " + src + "V");
        return src;
    }
}
