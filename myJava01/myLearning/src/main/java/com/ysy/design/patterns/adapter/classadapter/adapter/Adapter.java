package com.ysy.design.patterns.adapter.classadapter.adapter;

import com.ysy.design.patterns.adapter.classadapter.voltage220.Voltage220;
import com.ysy.design.patterns.adapter.classadapter.voltage5.Voltage5;

// adapter
public class Adapter extends Voltage220 implements Voltage5 {
    @Override
    public int output5() {

        // 获取220V
        int src = output220();

        int dest = src / 44; // 转换成5V
        return dest;
    }
}
