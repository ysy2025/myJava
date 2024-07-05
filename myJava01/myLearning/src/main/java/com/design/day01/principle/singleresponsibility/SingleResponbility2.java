package com.design.day01.principle.singleresponsibility;

import jdk.nashorn.internal.ir.CallNode;

/*
* 方案2,遵守了单一职责,但是改动很大
* 需要将类分解,还要修改客户端
*
* 怎么改进?
* 直接修改vehicle类,改动代码
 */
public class SingleResponbility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("motobike");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("plan");
    }
}

class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + " is running on the road.");
    }
}

class AirVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + " is running on the air.");
    }
}

class WaterVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + " is running on the water.");
    }
}