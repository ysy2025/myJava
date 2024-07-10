package com.exercise.test03;

import java.util.Date;

/*
成员内部类
内部类的对象实例化操作,必须在外部类或者外部类的非静态方法中实现

局部内部类
在方法等地,局部位置,进行定义的类

匿名内部类

等等

总而言之,这些复杂规则,实际开发中我很少碰到,尽量避免就是了.
 */
public class PackageDemo {

    public static void main(String[] args) {
//        Date date = new Date(100000);
//        System.out.println(date);

        PackageDemo demo = new PackageDemo();

        inner inner = demo.new inner();

        inner inner1 = demo.newInner();

        System.out.println(inner1.equals(inner));
    }

    class inner{
        inner(){}

        public void say(){
            System.out.println("hello");
        }
    }

    public inner newInner(){
        return new inner();
    }

    public newObject haha(){
        return new newObject(){
            // 匿名内部类;是实例化了一个类才行.
        };
    }

    private class newObject {
    }
}
