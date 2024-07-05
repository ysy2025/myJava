package com.ysy.design.patterns.composite.organization;

public abstract class Organization {

    public String name;

    public String desc;

    public void add(Organization org){
        throw new UnsupportedOperationException();
    };

    public void remove(Organization org){
        throw new UnsupportedOperationException();
    };

    public Organization(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public abstract void show();
}
