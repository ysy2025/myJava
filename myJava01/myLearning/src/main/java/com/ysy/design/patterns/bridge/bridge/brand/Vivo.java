package com.ysy.design.patterns.bridge.bridge.brand;

public class Vivo implements Brand {
    @Override
    public void open() {
        System.out.println("Vivo open");
    }

    @Override
    public void close() {
        System.out.println("Vivo close");
    }

    @Override
    public void call() {
        System.out.println("Vivo call");
    }
}
