package com.design.patterns.facade.client;

import com.design.patterns.facade.facade.Facade;

public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();

        facade.ready();
    }
}
