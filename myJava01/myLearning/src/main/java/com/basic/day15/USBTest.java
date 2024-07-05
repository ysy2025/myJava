package com.basic.day15;

/*
* 这里,printer和flash都是usb的子接口
* 体现了多态
* 面向接口编程
* 以不变应万变
* 提供一个壳,壳的内容后续添加.壳是不变的,内容是万变的
 */
public class USBTest {
    public static void main(String[] args) {
        Computer computer = new Computer();

        Flash flash = new Flash();
        Printer printer = new Printer();
        computer.transfer(flash);

        computer.transfer(printer);


    }
}

class Computer{
    public void transfer(USB usb){
        usb.start();
        System.out.println("________________!!!!!!!");
        usb.stop();
    }

}
interface USB{
    // 常量定义,长宽高,传输速度

    void start();
    void stop();
}

class Flash implements USB{
    @Override
    public void start() {
        System.out.println("Flash is running!");
    }

    @Override
    public void stop() {
        System.out.println("Flash is stopping!");
    }
}


class Printer implements USB{
    @Override
    public void start() {
        System.out.println("Printer is running!");
    }

    @Override
    public void stop() {
        System.out.println("Printer is stopping!");
    }
}