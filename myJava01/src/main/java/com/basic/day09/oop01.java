package com.basic.day09;

/*
1,封装和隐藏
高内聚:内部数据操作细节自己完成,不允许外部干涉
低耦合:仅仅对外暴露少量方法用于使用
便于外界调用,提高系统可扩展性,可维护性
把该隐藏的隐藏起来,该暴露的暴露出来


通过setter和getter确实可以封装好;但是没能把属性的修改隐藏起来,还是可以直接通过
调用属性来修改属性.
因此在提供setter和getter的同时,需要通过权限修饰符->private

这样,即有调用方法又有封闭条件.

get方法,getter;
private的时候,普通的get方法也没办法获取了
只能用getter
私有化->普通的set和get方法失效;只能使用setter和getter

2,封装性的体现
属性私有化,提供setter和getter
不对外暴露的私有方法
单例模式

3,封装性体现需要权限修饰符配合
3.1 四种权限
private->缺省->protected->public

            类内部     同一个包    不同包的子类  同一个工程
private     √
缺省        √          √
protected   √          √            √
public      √          √            √           √

class权限只有public和default(缺省)

default只能被同一个包内部的类访问.
4种修饰符可以用来修饰类和类的内部结构:属性方法构造器内部类
具体的,4种权限,都可以修饰类的内部结构
    修饰类,只能用 缺省,public

 */
public class oop01 {
    public static void main(String[] args) {
        Animal animal1 = new Animal();

        animal1.name = "zhangsan";
        animal1.age = 1;
//        animal1.legs = 1;
        animal1.setLegs(6);
        animal1.show();

    }
}

class Animal{
    int age;
    int weight;
    int height;
    String name;
    private int legs;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        if(legs > 0 && legs % 2 == 0) {
            this.legs = legs;
        } else{
            legs = 0;
        }
    }


    public void eat(){
        System.out.println("chifan");
    }

    public void show(){
        System.out.println("name is " + name + " age is " + age + " legs is " + legs);
    }
}