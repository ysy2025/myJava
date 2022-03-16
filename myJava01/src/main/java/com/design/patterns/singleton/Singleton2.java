package com.design.patterns.singleton;

/*
* 懒汉式1, Ren类
*   优点:
*       lazy loading,没有浪费,但是只能在单线程下使用;
*   缺点:
*       多线程下,如果一个线程进入了 if 语句,还没有执行,另一个线程也进入了语句,此时会产生多个实例
*       多线程不安全
*
*
 */
public class Singleton2 {
    public static void main(String[] args) {
        Ren ren = Ren.getInstance();
        Ren ren2 = Ren.getInstance();

        System.out.println(ren.hashCode() + " == " + ren2.hashCode());

        Dog dog1 = Dog.getInstance();
        Dog dog2 = Dog.getInstance();
        System.out.println(dog1.hashCode() + " == " + dog2.hashCode());

        Shou shou = Shou.getInstance();
        Shou shou2 = Shou.getInstance();
        System.out.println(shou.hashCode() + " == " + shou2.hashCode());
    }
}


// 懒汉式
class Ren{
    // 2, 私有化构造器,避免外界调用,只能内部调用
    private Ren() {
    }

    // 3, 初始化一个实例,但是不创建;
    // 4, 实例->static,为了让static方法调用
    // 5, 私有化之,避免外界调用;不能final,否则就没办法改了
    //private final static Ren ren;
    private static Ren ren;

    // 1, 提供一个静态的方法,供调用,从而创建方法;但是只有在调用方法的时候才创建对象
    public static Ren getInstance() {
        if (ren == null) {
            ren = new Ren();
        }
        return ren;
    }
}

/*
* 懒汉式,线程安全,同步方法
*
* 优点:
*   解决了线程危机
* 缺点:
*   效率太低,每个线程在尝试获取实例的时候都要登台,但是这个方法只要执行一次就可以了
*   后面想获取,直接return就可以了
*
*
 */

class Dog{
    //2, 私有化构造器,避免外界调用,只能内部调用
    private Dog() {
    }

    //3, 声明对象,但是不完全初始化
    //5, 让dog->static,匹配静态方法
    //6, 让dog->private,避免外界调用,同时不能final
    private static Dog dog;

    //1, 构建静态方法,供外部调用
    //8, 让方法 sychronized, 同步代码,解决线程安全;当有个线程在执行的时候,就不让其他线程执行,避免多线程撞衫
    public static synchronized Dog getInstance() {
        //4, 彻底初始化
        //7, 如果已经加载过了,就不要再加载一次
        if (dog == null) {
            dog = new Dog();
        }
        return dog;

    }
}

/*
懒汉式,线程安全,同步代码块
本意上是对懒汉式,同步代码块进行改进,因为前面同步效率低,改为同步实例化的代码块
但是这种同步无法起到线程同步的作用;假如线程进入了if,还是会产生多线程同时实例化问题

 */
class Shou{
    //2, 声明构造器,私有化之,避免外界调用
    private Shou() {}

    //3, 声明实例但是不初始化
    //5, 让实例->static,配合静态方法使用
    private static Shou shou;

    //1, 声明静态方法,一旦类加载,此方法就被调用
    public static Shou getInstance() {
        //4. 初始化之
        if (shou == null){
            synchronized (Shou.class){
                shou = new Shou();
            }
        }
        return shou;
    }
}