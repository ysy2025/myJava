package com.ysy.annotation.reflection;

/*
class 本身也是一个类
class对象只能由系统建立对象
一个加载的类在jvm中只会有一个class实例
一个class对象对应的是一个加载到jvm中的一个class文件
每个类的实例都会记得自己是由哪个class实例生成的
通过class可以完整得到一个类中的所有被加载的结构
class类是reflection的根源;针对任何你想动态加载的,运行的类,唯有先获得相应的class对象

 */
public class Demo01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c1 = Class.forName("com.ysy.annotation.reflection.User");

        System.out.println(c1);
        Class c2 = Class.forName("com.ysy.annotation.reflection.User");
        Class c3 = Class.forName("com.ysy.annotation.reflection.User");

        /*
        一个类在内存中只有一个clas对象
        一个类被夹在后,类的整个结构都会被封装在class对象中
         */
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());

        System.out.println(c1.getClass());

    }
}


// pojo
class User{
    String name;
    int id;
    int age;

    public User() {
    }

    public User(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}