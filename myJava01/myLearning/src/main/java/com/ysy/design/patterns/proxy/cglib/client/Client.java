package com.ysy.design.patterns.proxy.cglib.client;

import com.ysy.design.patterns.proxy.cglib.dao.TeacherDAO;
import com.ysy.design.patterns.proxy.cglib.proxy.ProxyFactory;

public class Client {
    public static void main(String[] args) {
        // 创建目标对象
        TeacherDAO target = new TeacherDAO();

        // 获取到代理对象,并且将目标对象传递给代理对象
        TeacherDAO proxyInstance = (TeacherDAO) new ProxyFactory(target).getProxyInstance();

        // 执行代理对象的方法,触发interceptor的方法,从而实现对目标对象的调用
        proxyInstance.teach();
    }
}
