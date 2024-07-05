package com.design.patterns.composite.organization;

import java.util.ArrayList;
import java.util.List;

// college 负责管理 department
public class College extends Organization {
    // 构造器
    public College(String name, String desc) {
        super(name, desc);
    }

    // 管理 department
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
