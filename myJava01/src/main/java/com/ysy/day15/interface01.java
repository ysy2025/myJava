package com.ysy.day15;

/*
* 一方面,有时候需要从几个类中衍生出一个子类,来继承所有属性和方法;
* 另一方面,java不支持多重继承
* 因此需要接口,来实现多继承(实现多个接口)
*
* 还有一方面,有时候必须从几个类中抽取一些共同的行为特征,但是没有 is-a 关系,不是集成关系,仅仅是具有相同的行为特征
* 例如 鼠标,键盘,手机,摄像机等都可以用usb接口
*
* 接口就是规范,定义的是一组规则
* 集成是一个是不是的关系,接口是一个能不能的关系.
* 接口的本质是契约,标准,规范
*
* 接口的使用:
*       interface来定义
*       java中,interface和class是并列的结构
*
*   如何定义接口? 定义接口中的成员
*       jdk7和以前
*           只能定义全局常量和抽象方法
*           public static final 常量; 书写时候,可以省略
*           public abstract 方法 书写的时候也可以省略
*       jdk8
*           除了全局变量和抽象方法外,还有 静态方法,默认方法
*
*   接口中,不能定义构造器->接口不能实例化
*   抽象类也不能实例化,但是能够定义构造器
*
* java开发中,让类去实现接口
* implement
* 如果 实现类 覆盖了所有抽象方法,那么可以实例化
* 如果 实现类 没有覆盖所有抽象方法,只能是abstract
*
* java 类可以多实现接口->弥补了单继承性的局限性
*
* 接口和接口之间,也叫继承关系;接口可以多继承
*
* 接口的使用,体现了多态性
*
* 抽象类和接口有哪些异同
*   abstract 和 interface
*   都不能实例化
*
 */
public class interface01 {
    public static void main(String[] args) {
        System.out.println(Flyable.ability);

//        Flyable.ability = 0;

        Bullet bullet = new Bullet();

        System.out.println(bullet.MAX_SPEED);

        bullet.eat();

        bullet.fly();

    }
}

interface Flyable{
    // 全局常量
    public static final int MAX_SPEED = 7900; // 第一宇宙速度
    public static final int MIN_SPEED = 1; // 第一宇宙速度
    int ability = 1;

    // 抽象方法
    public abstract void fly();

    public abstract void eat();

}

interface Harmful{
    public static final String MAX_HARM = "dead"; // 第一宇宙速度
    public static final String MIN_HARM = "injure"; // 第一宇宙速度
}

interface Kill extends Harmful {
    public abstract void killing();
}

interface Bomb extends Kill, Harmful{
    public abstract void bombing();
}
class Bullet implements Flyable, Harmful{

    @Override
    public void fly() {

    }

    @Override
    public void eat() {

    }
}