package com.ysy.basic.day07;

import static java.lang.Math.PI;

public class Circle {
    double r;

    public void setR(double input) {
        r = input;
    }

    public double getS(){
        double s;
        s = PI * Math.pow(r, 2);
        return s;
    }
}
