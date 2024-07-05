package com.ysy.design.day01.principle.singleresponsibility;

public class SingleResponbility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("car");
        vehicle.run("plan");
    }
}


// 交通工具类
// 方式1的run方法中,违反了单一职责,任何交通工具都在road上跑
// 可以通过拆分不同的类,来run
class Vehicle{
    public void run(String vehicle){
        System.out.println(vehicle + " is running on the road.");
    }
}