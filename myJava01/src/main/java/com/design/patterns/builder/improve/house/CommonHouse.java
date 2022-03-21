package com.design.patterns.builder.improve.house;

import com.design.patterns.builder.improve.builder.HouseBuilder;

public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基需要5m");
    }

    @Override
    public void buildWall() {
        System.out.println("普通房子砌墙也需要5m");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子屋顶需要25m2");
    }
}
