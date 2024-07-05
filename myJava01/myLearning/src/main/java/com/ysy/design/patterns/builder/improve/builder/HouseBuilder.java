package com.ysy.design.patterns.builder.improve.builder;

import com.ysy.design.patterns.builder.improve.house.House;

// 抽象的建造者
public abstract class HouseBuilder {
    // 初始化一个house
    public House house = new House();


    // 打地基
    public abstract void buildBasic();

    // 砌墙
    public abstract void buildWall();

    // 封顶
    public abstract void roofed();

    // 整合起来
    public House build(){
//        buildBasic();
//        buildWall();
//        roofed();

        // 盖好房子之后,返回
        return house;
    }
}
