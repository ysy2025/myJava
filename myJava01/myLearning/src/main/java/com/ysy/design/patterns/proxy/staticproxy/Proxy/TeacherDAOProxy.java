package com.ysy.design.patterns.proxy.staticproxy.Proxy;


import com.ysy.design.patterns.proxy.staticproxy.dao.TeachDAO;

public class TeacherDAOProxy implements TeachDAO {

    private TeachDAO target; // 目标对象,通过接口来聚合

    // 构造器,引入接口
    public TeacherDAOProxy(TeachDAO target) {
        this.target = target;
    }

    @Override
    public void teach() {
        // 通过代理增强功能
        System.out.println("代理老师教书");
        target.teach();
        System.out.println("代理结束!");
    }
}
