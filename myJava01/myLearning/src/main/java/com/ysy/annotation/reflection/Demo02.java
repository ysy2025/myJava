package com.ysy.annotation.reflection;

public class Demo02 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Student("zhangsan");
        System.out.println("name is " + person.name);

        // 通过对象获得
        Class c1 = person.getClass();
        System.out.println(c1.hashCode());

        // 通过forName
        Class c2 = Class.forName("com.ysy.annotation.reflection.Student");
        System.out.println(c2.hashCode());

        // 通过.class
        Class c3 = Student.class;
        System.out.println(c3.hashCode());

        // 基本内置类型的包装类都有一个type属性
        System.out.println(Integer.TYPE);

        // 父类对象
        Class c5 = c1.getSuperclass();
        System.out.println(c5);

    }
}

class Person{
    String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Student extends Person{
    public Student(String name) {
        this.name = name;
    }
}

class Teacher extends Person{
    public Teacher(String name) {
        this.name = name;
    }
}
