package com.basic.day11;

public class heir02 {
    public final double Gparameter =  6.672 * Math.pow(10, -11);

    public double getForce(Electron e1, Electron e2){
        double m1 = e1.getMass();
        double m2 = e2.getMass();

        double distance = e1.getRadius() + e2.getRadius();

        return (Gparameter * m1 * m2) / Math.pow(distance, 2);

    }

    public static void main(String[] args) {
        Electron e1 = new Electron(100.0, 100.0);
        Electron e2 = new Electron(100.0, 100.0);

        heir02 h02 = new heir02();

        double force = h02.getForce(e1, e2);

        System.out.println("force between e1 and e2 is " + force);

        System.out.println(e1.getMagnet());
        System.out.println(e2.getMagnet());

    }
}
