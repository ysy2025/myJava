package com.design.day01.uml.composition;

/*
* mouse和screen 与computer 不可以分离
* 这种就是组合
* 
 */
public class Computer {
    private Mouse mouse = new Mouse();
    private Screen screen = new Screen();

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
