package com.design.patterns.singleton;

/*
单例模式使用的场景:需要频繁创建,销毁的对象;创建对象十分浪费时间或者资源,但是又经常用到的对象;工具类对象;频繁范文数据库或者文件的对象
 */
import java.lang.Runtime;
/*
* 双重检查
    * double-check 概念是多线程开发中经常使用的,使用了两次if null 检查,确保线程安全
    * 实例化代码只用执行一次,避免反复进行方法同步
    * 线程安全,延迟加载,效率高
    * 在实际开发中,推荐使用此种单例设计模式
*
* 静态内部类
 */
public class Singleton3 {
    public static void main(String[] args) {
        // 双重检查
        Card card = Card.getInstance();
        Card card2 = Card.getInstance();

        System.out.println(card.hashCode() + "==" + card2.hashCode());

        // 静态内部类
        Cup cup1 = Cup.getInstance();
        Cup cup2 = Cup.getInstance();
        System.out.println(cup1.hashCode() + "==" + cup2.hashCode());

        Car car1 = Car.INSTANCE;
        Car car2 = Car.INSTANCE;
        System.out.println(car1.hashCode() + "==" + car2.hashCode());

        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.freeMemory());

    }
}

/*
在静态的公有方法中,增加双重检查代码,解决线程安全问题,同时解决懒加载问题,同时确保了效率安全
 */
class Card {
    // 2, 声明构造器,并且私有化,避免外界使用
    private Card() {
    }

    // 3, 声明静态的私有的field,供静态方法调用
    private static Card card;

    // 1, 声明方法,静态的,确保类加载后就执行
    public static Card getInstance() {
        // 4, 第一次检查
        if (card == null){
            // 6, 线程安全
            synchronized (Card.class){
                // 7, 第二次检查
                if (card == null){
                card = new Card();
                }
            }
        }
        return card;
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

class Cup{
    // 2, 声明构造器,私有化之,避免外部调用

    private Cup() {
    }

    // 3, 声明静态内部类,该类中有一个静态属性
    private static class Instance{
        private static final Cup cup = new Cup();
    }
    // 1, 声明静态方法,方便类调用
    public static synchronized Cup getInstance() {
        return Instance.cup;
    }

}

/*
枚举 实现单例
    借助1.5添加的枚举来实现,避免多线程问题,而且还能防止反序列化重新创建新对象
 */
enum Car{
    INSTANCE;

    public void run(){
        System.out.println("hello");
    }
}