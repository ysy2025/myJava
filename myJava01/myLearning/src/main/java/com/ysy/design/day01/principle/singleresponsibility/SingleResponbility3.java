package com.ysy.design.day01.principle.singleresponsibility;

/*
* 方法3,对于原来的类没有大修改,只要增加方法
* 方法级别上符合单一职责原则,在类级别没有遵守单一职责
 */
public class SingleResponbility3 {
    public static void main(String[] args) {
        NeWVehicle neWVehicle = new NeWVehicle();

        neWVehicle.run("car");

        neWVehicle.run("plane");
    }
}

class NeWVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + " is running on the road.");
    }

    public void runAir(String vehicle){
        System.out.println(vehicle + " is running on the air.");
    }
    public void runWater(String vehicle) {
        System.out.println(vehicle + " is running on the water.");
    }
}