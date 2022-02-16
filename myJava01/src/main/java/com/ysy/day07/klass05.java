package com.ysy.day07;

public class klass05 {
    public static void main(String[] args) {
//        Customer myCustomer = new Customer();
//        System.out.println(myCustomer.age);
//
//        myCustomer.study();
//        myCustomer.addAge(10);
//        System.out.println(myCustomer.age);
//
//        Customer c1 = new Customer();
//        System.out.println(c1.age);
//
//        Customer c2 = new Customer();
//

        Circle c1 = new Circle();

        double area = c1.getS();
        System.out.println("c1 radius is " + c1.r + " area of c1 is " + area);


        c1.setR(10.1);
        area = c1.getS();
        System.out.println("c1 radius is " + c1.r + " area of c1 is " + area);

        c1.r = 20.1;
        area = c1.getS();
        System.out.println("c1 radius is " + c1.r + " area of c1 is " + area);
    }
}
