package com.ysy.day07;

/*
如何设计类->本质上就是设计类的成员

属性
对应类中的成员变量=字段=域(fields)

方法
对应类中的成员方法=函数


类和对象的使用
1,创建类,设计类成员
2,创建类的对象,实例化
3,通过对象,调用方法或属性

一个类的多个对象的关系
每个对象都独立拥有一套类的属性(暂时来看)
如果修改一个对象的属性,不影响其他对象的属性值(暂时)
 */
public class klass02 {
    public static void main(String[] args) {
        Company a = new Company();
        a.country = "China";
        System.out.println(a.country);
        a.eat("dinner");
        a.sleep(10);

        Company b = new Company();
        System.out.println(b.country);


        //c&a指向了同一个对象,所以一变则皆变
        Company c = a;
        System.out.println(c.country);
        c.country = "USA";
        System.out.println(a.country);
    }
}

class Person{
    //属性
    int age = 18;
    String sex = "F";
    String name = "zhangsan";
    String country;

    //方法
    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }

    public void sleep(int hours){
        System.out.println(name + " need to sleep for " + hours + " hours");
    }
}