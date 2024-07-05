package com.design.patterns.bridge.bridge.phone;

import com.design.patterns.bridge.bridge.brand.Brand;

public abstract class Phone {

    // 需要调用品牌
    public Brand brand;

    // 通过构造器,引入品牌
    public Phone(Brand brand) {
        this.brand = brand;
    }

    public void open(){
        this.brand.open();
    }

    public void close(){
        this.brand.close();
    }

    public void call(){
        this.brand.call();
    }
}
