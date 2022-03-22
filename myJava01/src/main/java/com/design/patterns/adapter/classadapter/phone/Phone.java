package com.design.patterns.adapter.classadapter.phone;

import com.design.patterns.adapter.classadapter.voltage5.Voltage5;

public class Phone {

    // 充电
    public void charging(Voltage5 voltage5){
        if(voltage5.output5() == 5){
            System.out.println("output is 5v and phone can be charged");
        }else{
            System.out.println("output is not 5v and phone can not be charged");
        }
    }
}
