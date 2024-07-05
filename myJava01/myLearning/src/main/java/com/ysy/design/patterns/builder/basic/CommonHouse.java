package com.ysy.design.patterns.builder.basic;

public class CommonHouse extends AbstractHouse {
    @Override
    public void buildBasic() {
        System.out.println("给普通房子打地基");
    }

    @Override
    public void buildWall() {
        System.out.println("给普通房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("给普通房子封顶");
    }

    @Override
    public void build() {
        buildBasic();
        buildWall();
        roofed();
    }
}
