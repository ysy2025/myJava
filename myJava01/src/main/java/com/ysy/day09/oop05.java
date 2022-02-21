package com.ysy.day09;

/*

封装
继承
多态

this关键字的用处
1,使用情况
    方法内部使用,即这个方法所属对象的引用
    构造器内部使用,表示该构造器在初始化的对象

2,表示当前对象,可以调用类的属性,方法,和构造器
3,使用时间
    在方法内需要调用该方法的对象时,调用this
    适合形参名字和实参名字相同的时候做区分.
    this.属性或者this.方法 调用属性或者方法
    通常省略this

4, this,相当于当前对象或者当前正在构造的对象->用在构造对象中


5, this 调用构造器, 来实现构造器
    显式调用本类中指定的其他构造器格式来初始化
    构造器中,不能通过this 调用自己
    构造器中不能形成loop
    this构造器必须声明在当前构造器中的首行!!!
    构造器内部只能调用1个构造器(毕竟必须声明在首行),用来调用其他构造器
 */
public class oop05 {
    public static void main(String[] args) {
        Paper paper1 = new Paper();

//        paper1.setLength(100);
//
//        System.out.println(paper1.length);

        paper1.setEverything();
        System.out.println(paper1.area);

        Paper paper2 = new Paper(100, 10000);
        System.out.println(paper2.height + " " + paper2.length + " " + paper2.area);

    }
}

class Paper{
    int length;
    int height;
    int area;

    Paper(){
        System.out.println("张三牛逼~!!!!!!");
    }

    // this 用在构造方法里面
    Paper(int length){
        this.length = length;
        System.out.println("张三牛逼~!!!!!!");
    }

    Paper(int height, int area){
        this(height);
        this.height = height;
        this.area = area;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        // 没有this的时候,就近原则,赋值给setLength的length
//        length = length;
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return area;
    }

    public void setArea() {
        this.area = this.length * this.height;
    }

    // this 调用方法
    public void setEverything(){
        this.setLength(100);
        this.setHeight(1000);
        this.setArea();
    }

}
