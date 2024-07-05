package com.ysy.design.patterns.builder.basic;

public abstract class AbstractHouse {
    // 打地基
    public abstract void buildBasic();

    // 砌墙
    public abstract void buildWall();

    // 封顶
    public abstract void roofed();

    // 整合起来
    public void build(){
        buildBasic();
        buildWall();
        roofed();
    }
}
