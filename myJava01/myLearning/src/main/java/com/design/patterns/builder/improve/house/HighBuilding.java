package com.design.patterns.builder.improve.house;

import com.design.patterns.builder.improve.builder.HouseBuilder;

public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("高楼大厦打地基需要50m");
    }

    @Override
    public void buildWall() {
        System.out.println("高楼大厦墙高150m");
    }

    @Override
    public void roofed() {
        System.out.println("高楼大厦屋顶是玻璃的");
    }
}
