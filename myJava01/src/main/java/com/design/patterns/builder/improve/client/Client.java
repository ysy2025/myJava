package com.design.patterns.builder.improve.client;

import com.design.patterns.builder.improve.director.HouseDirector;
import com.design.patterns.builder.improve.house.CommonHouse;
import com.design.patterns.builder.improve.house.HighBuilding;
import com.design.patterns.builder.improve.house.House;

public class Client {
    public static void main(String[] args) {

        // 盖普通房子
        CommonHouse commonHouse = new CommonHouse();

        // 准备盖房子的指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouse);

        // 完成盖房子,返回产品
        House house = houseDirector.constructHouse();

        System.out.println();


        // 盖高楼
        HighBuilding highBuilding = new HighBuilding();
        // 重置建造者
        houseDirector.setHousebuilder(highBuilding);
        // 完成盖房子
        houseDirector.constructHouse();
    }
}
