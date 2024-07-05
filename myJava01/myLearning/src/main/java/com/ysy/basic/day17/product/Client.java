package com.ysy.basic.day17.product;

public class Client {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();

        Producer p1 = new Producer(clerk);
        p1.setName("生产者1");

        Customer c1 = new Customer(clerk);
        c1.setName("消费者1");
        Customer c2 = new Customer(clerk);
        c1.setName("消费者2");

        p1.start();
        c1.start();
        c2.start();
    }
}
