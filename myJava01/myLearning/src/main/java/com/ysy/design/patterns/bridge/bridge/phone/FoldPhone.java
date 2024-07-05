package com.ysy.design.patterns.bridge.bridge.phone;

import com.ysy.design.patterns.bridge.bridge.brand.Brand;

public class FoldPhone extends Phone {
    // 构造器,传入brand
    public FoldPhone(Brand brand) {
        super(brand);
    }

    public void open(){
        super.open();
        System.out.println("Fold phone!");
    }

    public void close(){
        super.close();
        System.out.println("Fold phone!");
    }

    public void call(){
        super.call();
        System.out.println("Fold phone!");
    }
}
