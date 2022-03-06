package com.ysy.day14;

public class CircleTest {
//    Circle c0 = new Circle();
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();

        System.out.println(c1.getId());
        System.out.println(c2.getId());
        System.out.println(Circle.getTotal());

        Circle c3 = new Circle(1.11);

        System.out.println(c3.findArea());
        System.out.println(Circle.getTotal());
    }

}

class Circle{
    private double radius;
    private  int id;

    public Circle(){
        id = init++;

        total++;
    }

    public Circle(double radius){
        this();

        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private static int total;

    public static int getTotal() {
        return total;
    }
    private static int init = 1001; // 多个对象共享

    public double findArea(){
        return 3.14 * radius * radius;
    }
}