package com.ysy.day11;

public class Quark {

    public double radius;

    public double density;

    public final double gravity = 9.8;

    final double pi = Math.PI;
    public Quark(){}

    public Quark(double radius, double density) {
        this.radius = radius;
        this.density = density;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }


    public double getVolume(){
        return (4.0/3.0) * pi * Math.pow(radius, 3);
    }

    public double getMass(){
        double volume = getVolume();
        return density * volume;
    }

    public double getWeight(){
        double mass = getMass();
        return gravity * mass;
    }

}
