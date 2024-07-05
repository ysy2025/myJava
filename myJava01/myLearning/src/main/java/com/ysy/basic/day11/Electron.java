package com.ysy.basic.day11;

public class Electron extends Quark {
    public final double magnet = Math.sqrt(Math.PI);

    public Electron(){};
    public Electron(double radius, double density){
        super(radius, density);
    };

    public double getMagnet(){
        return magnet * getWeight();
    }
}
