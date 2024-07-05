package com.design.patterns.proxy.staticproxy.client;

import com.design.patterns.proxy.staticproxy.Proxy.TeacherDAOProxy;
import com.design.patterns.proxy.staticproxy.dao.TeacherDAO;

public class Client {

    public static void main(String[] args) {
        // 创建目标对象,被代理
        TeacherDAO teacherDAO = new TeacherDAO();

        // 代理对象,同时将被代理对象,传递给代理对象
        TeacherDAOProxy teacherDAOProxy = new TeacherDAOProxy(teacherDAO);

        // 通过代理对象,调用到被代理对象的方法
        teacherDAOProxy.teach();
    }
}
