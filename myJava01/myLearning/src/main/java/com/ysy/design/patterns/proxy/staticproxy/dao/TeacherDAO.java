package com.ysy.design.patterns.proxy.staticproxy.dao;

public class TeacherDAO implements TeachDAO {
    @Override
    public void teach() {
        System.out.println("教书育人好课堂");
    }
}
