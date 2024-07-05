package com.ysy.design.patterns.composite.organization;

import java.util.ArrayList;
import java.util.List;

//university 就是composite,可以管理college
public class University extends Organization {
    // 构造器
    public University(String name, String desc) {
        super(name, desc);
    }

    // 管理college
    List<Organization> organizationList = new ArrayList<Organization>();

    @Override
    public void show() {
        System.out.println("This is " + getName() + " and it is " + getDesc());

        // 遍历学院
        for(Organization org:organizationList){
            org.show();
        }
    }

    @Override
    public void add(Organization org) {
        organizationList.add(org);
    }

    @Override
    public void remove(Organization org) {
        organizationList.remove(org);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDesc() {
        return super.getDesc();
    }
}
