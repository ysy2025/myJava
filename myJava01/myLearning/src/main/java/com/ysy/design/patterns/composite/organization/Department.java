package com.ysy.design.patterns.composite.organization;

// department 是最小单位,没办法细分了
public class Department extends Organization {

    // 构造器
    public Department(String name, String desc) {
        super(name, desc);
    }

    @Override
    public void show() {
        System.out.println("This is " + getName() + " and it is " + getDesc());
    }

    //add,remove这些就不需要了,叶子节点,不需要重写


    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDesc() {
        return super.getDesc();
    }
}
