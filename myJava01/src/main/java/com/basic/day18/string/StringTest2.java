package com.basic.day18.string;

/**
 * String a = "abc";
 * String a = new String("abc")
 * 有什么区别
 * 通过字面量定义的方式,此时a的数据,声明在方法区中的字符串常量池中
 * 构造器的方式,b&b1保存的地址值,是数据在对空间中开辟空间之后对应的地址值
 *
 * String a = new String("abc")
 * 实际上创建了两个对象,一个是堆空间中的new结构,另一个是char[]对应的常量池中的数据
 */
public class StringTest2 {
    public static void main(String[] args) {
        String a = "zhangsan";
        System.out.println(a.substring(0,5));
        String a1 = "zhangsan";
        System.out.println(a.hashCode() + "==" + a1.hashCode());

        String b = new String("zhangsan");
        System.out.println(b.substring(0, 5));
        String b1 = new String("zhangsan");
        System.out.println(b.hashCode() + "==" + b1.hashCode());

        System.out.println(a==a1);
        System.out.println(a==b);
        System.out.println(a==b1);
        System.out.println(b==b1);

        Person p1 = new Person("zhangsan", 11);
        Person p2 = new Person("zhangsan", 11);

        System.out.println(p1.name==p2.name);
    }
}

class Person{

    String name;
    int age;

    public Person(String name, int age) {
    // 通过字面量形式构建的
        this.name = name;
        // 通过类的实例构建
//        this.name = new String(name);
        this.age = age;
    }
}