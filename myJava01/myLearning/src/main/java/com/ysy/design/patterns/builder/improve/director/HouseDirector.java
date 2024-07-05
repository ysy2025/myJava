package com.ysy.design.patterns.builder.improve.director;

import com.ysy.design.patterns.builder.improve.builder.HouseBuilder;
import com.ysy.design.patterns.builder.improve.house.House;

public class HouseDirector {
    // 首先需要housebuilder
    HouseBuilder housebuilder = null;

    // 构造器传入housebuilder
    public HouseDirector(HouseBuilder housebuilder) {
        this.housebuilder = housebuilder;
    }

    // setter 传入housebuilder
    public void setHousebuilder(HouseBuilder housebuilder) {
        this.housebuilder = housebuilder;
    }

    // 如何处理建造房子的流程?交给指挥者
    public House constructHouse(){
        housebuilder.buildBasic();
        housebuilder.buildWall();
        housebuilder.roofed();

        return housebuilder.build();
    }
}
