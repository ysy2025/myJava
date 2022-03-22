package com.design.patterns.decorator.drink;

public abstract class Drink {
    // 针对drink的描述
    public String des;

    // 价格
    public float price = 0.0f;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    // 计算费用的价格

    public abstract float cost();
}
