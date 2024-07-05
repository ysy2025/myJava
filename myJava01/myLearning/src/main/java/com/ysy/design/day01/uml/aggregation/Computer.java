package com.ysy.design.day01.uml.aggregation;

/*
* mouse和screen 与computer可以分离
* 这种就是聚合,而不是组合
*
 */
public class Computer {
    private Mouse mouse;
    private Screen screen;

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }



}
