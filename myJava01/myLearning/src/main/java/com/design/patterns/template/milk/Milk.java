package com.design.patterns.template.milk;

public abstract class Milk {
    // 模板方法,可以做成final,不让覆盖
    public void make(){
        select();
        add();
        soak();
        beat();
    }

    public void select(){
        System.out.println("选材料很重要");
    }

    public abstract void add();

    public void soak(){
        System.out.println("泡一会");
    }

    public void beat(){
        System.out.println("黄豆和配料用豆浆机打碎");
    }
}
