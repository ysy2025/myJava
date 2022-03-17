package com.design.test;

/*
单例模式的8种写法
 */
public class test1 {
    public static void main(String[] args) {
        Hungry1 hungry1 = Hungry1.getInstance();
        Hungry1 hungry11 = Hungry1.getInstance();

        System.out.println(hungry1.hashCode() + "== " + hungry11.hashCode());

        Hungry2 hungry2 = Hungry2.getInstance();
        Hungry2 hungry22 = Hungry2.getInstance();

        System.out.println(hungry2.hashCode() + "== " + hungry22.hashCode());

        Lazy1 lazy1 = Lazy1.getInstance();
        Lazy1 lazy11 = Lazy1.getInstance();

        System.out.println(lazy1.hashCode() + "== " + lazy11.hashCode());

        Lazy2 lazy2 = Lazy2.getInstance();
        Lazy2 lazy22 = Lazy2.getInstance();

        System.out.println(lazy2.hashCode() + "== " + lazy22.hashCode());

        Lazy3 lazy3 = Lazy3.getInstance();
        Lazy3 lazy33 = Lazy3.getInstance();

        System.out.println(lazy3.hashCode() + "== " + lazy33.hashCode());

        DoubleCheck dc = DoubleCheck.getInstance();
        DoubleCheck dc2 = DoubleCheck.getInstance();
        System.out.println(dc.hashCode() + "== " + dc2.hashCode());

        InnerClass ic = InnerClass.getInstance();
        InnerClass ic2 = InnerClass.getInstance();
        System.out.println(ic.hashCode() + "== " + ic2.hashCode());

        Enumerate e = Enumerate.INSTANCE;
        Enumerate e2 = Enumerate.INSTANCE;
        System.out.println(e.hashCode() + "== " + e2.hashCode());

    }
}

/*
饿汉式
 */
class Hungry1{
    // 2, 构建构造器,私有化,确保只能内部使用,不允许外部调用
    private Hungry1() {
    }

    // 3, 声明类的变量,私有化之,静态之,final之,确保不被改变,
    private final static Hungry1 hungry1 = new Hungry1();

    // 1, 创建getinstance方法,静态的,在类加载的时候加载,并且只加载一次,确保只有一个对象
    public static Hungry1 getInstance() {
        return hungry1;
    }
}

/*
饿汉式静态代码块
 */
class Hungry2 {
    // 2, 构建构造器,私有化,确保只能内部使用,不允许外部调用

    private Hungry2() {
    }

    // 3, 声明对象,但不赋值
    private static Hungry2 hungry2;

    // 静态代码块赋值
    static {
        hungry2 = new Hungry2();
    }

    // 1, 创建getinstance方法,静态的,在类加载的时候加载,并且只加载一次,确保只有一个对象
    public static Hungry2 getInstance() {
        return hungry2;
    }
}


/*
懒汉式
 */
class Lazy1{
    // 2, 构建构造器,私有化,确保只能内部使用,不允许外部调用
    private Lazy1() {
    }
    // 3, 声明对象,但不赋值
    private static Lazy1 lazy1;

    // 1, 创建getinstance方法,静态的,在类加载的时候加载,并且只加载一次,确保只有一个对象
    public static Lazy1 getInstance() {
        // 4, 赋值
        if(lazy1 == null){
            lazy1 = new Lazy1();
        }
        return lazy1;
    }
}

/*
饿汉式,线程安全,同步方法
 */
class Lazy2{
    // 2, 构建构造器,私有化,确保只能内部使用,不允许外部调用
    private Lazy2() {
    }

    // 3, 声明对象,但不赋值,私有化之,static之
    private static Lazy2 lazy2;

    // 1, 创建getinstance方法,静态的,在类加载的时候加载,并且只加载一次,确保只有一个对象
    public static synchronized Lazy2 getInstance() {
        if(lazy2 == null){
            lazy2 = new Lazy2();
        }
        return lazy2;
    }
}

/*
懒汉式,线程安全,同步代码块
本意上是对懒汉式,同步代码块进行改进,因为前面同步效率低,改为同步实例化的代码块
但是这种同步无法起到线程同步的作用;假如线程进入了if,还是会产生多线程同时实例化问题
使用synchronized的时候,可以锁住对象
 */
class Lazy3{
    // 2, 构建构造器,私有化,确保只能内部使用,不允许外部调用
    private Lazy3() {
    }

    // 3, 声明对象,但不赋值,私有化之,static之
    private static Lazy3 lazy3;


    // 1, 创建getinstance方法,静态的,在类加载的时候加载,并且只加载一次,确保只有一个对象

    public static Lazy3 getInstance() {
        if (lazy3 == null){
            synchronized (Lazy3.class){
            lazy3 = new Lazy3();
            }
        }
        return lazy3;
    }
}

/*
双重check
    * double-check 概念是多线程开发中经常使用的,使用了两次if null 检查,确保线程安全
    * 实例化代码只用执行一次,避免反复进行方法同步
    * 线程安全,延迟加载,效率高
    * 在实际开发中,推荐使用此种单例设计模式
 */
class DoubleCheck{
    // 2, 构建构造器,私有化,确保只能内部使用,不允许外部调用

    private DoubleCheck() {
    }

    // 3, 声明对象,但不赋值,私有化之,static之
    private static DoubleCheck dc;

    // 1, 创建getinstance方法,静态的,在类加载的时候加载,并且只加载一次,确保只有一个对象
    public static DoubleCheck getInstance() {
        // 4, 双重检查
        if (dc == null){
            synchronized (DoubleCheck.class){
                if(dc==null){
                    dc = new DoubleCheck();
                }
            }
        }
        return dc;
    }
}

/*
静态内部类的实现
    静态内部类的特点
        外部类装载的时候,静态内部类不会被装载
        外部类的方法,用到了静态内部类,才装载,而且只会装载一次
        类装载的时候,线程安全
    因此,静态内部类可以实现懒加载,而且线程安全

推荐使用
 */

class InnerClass{
    // 2, 构建构造器,私有化,确保只能内部使用,不允许外部调用

    private InnerClass() {
    }

    // 3, 声明静态内部类
    private static class InnerInnerClass{

        private static InnerClass instance = new InnerClass();

//        public static InnerClass getInstance() {
//            return new InnerClass();//这种内部类实现方式也不行,因为也会实例化两次
//        }
    }


    // 1, 创建getinstance方法,静态的,在类加载的时候加载,并且只加载一次,确保只有一个对象
    public static InnerClass getInstance() {

        return InnerInnerClass.instance;
    }
}

/*
枚举 实现单例
    借助1.5添加的枚举来实现,避免多线程问题,而且还能防止反序列化重新创建新对象
 */
enum Enumerate{
    INSTANCE;

    public void run(){
        System.out.println("hello");
    }
}