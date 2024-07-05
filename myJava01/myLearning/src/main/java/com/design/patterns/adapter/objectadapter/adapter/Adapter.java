package com.design.patterns.adapter.objectadapter.adapter;

import com.design.patterns.adapter.objectadapter.voltage220.Voltage220;
import com.design.patterns.adapter.objectadapter.voltage5.Voltage5;

// adapter
public class Adapter implements Voltage5 {
    // 声明 220V
    Voltage220 voltage220;

    // 通过构造器,引入voltage220
    public Adapter(Voltage220 voltage220) {
        this.voltage220 = voltage220;
    }

    @Override
    public int output5() {

        int dest = 0;

        // 针对传入的进行判断
        if (voltage220 != null){
            // 获取220V
            int src = voltage220.output220();

            System.out.println("适配器进行适配");
            dest = src / 44; // 转换成5V

            System.out.println("适配器完成适配");
        }

        return dest;
    }
}
