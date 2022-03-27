package com.design.patterns.proxy.dynamic.client;

import com.design.patterns.proxy.dynamic.dao.TeachDAO;
import com.design.patterns.proxy.dynamic.dao.TeacherDAO;
import com.design.patterns.proxy.dynamic.proxy.ProxyFactory;

public class Client {
    public static void main(String[] args) {
        // 创建目标对象
        TeachDAO target = new TeacherDAO();

        // 给目标对象创建代理对象
        TeachDAO proxyInstance = (TeachDAO) new ProxyFactory(target).getProxyInstance();

        // class com.sun.proxy.$Proxy0 说明是动态生成了代理对象
        System.out.println(proxyInstance.getClass());

        // 通过代理对象调用方法
        proxyInstance.teach();

        proxyInstance.sayHello("Tom!");
    }
}
