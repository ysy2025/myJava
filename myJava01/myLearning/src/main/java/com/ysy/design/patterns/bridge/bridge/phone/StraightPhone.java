package com.ysy.design.patterns.bridge.bridge.phone;

import com.ysy.design.patterns.bridge.bridge.brand.Brand;

public class StraightPhone extends Phone {
    public StraightPhone(Brand brand) {
        super(brand);
    }

    public void open(){
        super.open();
        System.out.println("Straight phone!");
    }

    public void close(){
        super.close();
        System.out.println("Straight phone!");
    }

    public void call(){
        super.call();
        System.out.println("Straight phone!");
    }
}
