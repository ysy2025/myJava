package com.ysy.design.patterns.proxy.dynamic.dao;

public class TeacherDAO implements TeachDAO {
    @Override
    public void teach() {
        System.out.println("教书育人,书香世家");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("hello " + name);
    }
}
