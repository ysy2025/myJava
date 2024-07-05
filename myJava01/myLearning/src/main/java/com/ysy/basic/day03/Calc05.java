package com.ysy.basic.day03;

public class Calc05 {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        if (x++ == 2 & ++y == 2){
            x = 7;
        }
        System.out.println(x +" " + y);

        boolean x1 = true;
        boolean y1 = false;
        short z1 = 42;

        if ((z1++==42)&&(y1==true)) z1++;
        System.out.println(z1);
        if ((x1=false)||(++z1==45)) z1++;
        System.out.println(z1);
    }
}
