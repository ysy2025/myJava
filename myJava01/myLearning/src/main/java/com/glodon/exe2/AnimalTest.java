package com.glodon.exe2;

public class AnimalTest {

    public static void main(String[] args) {
        AnimalTest animalTest = new AnimalTest();

        animalTest.func(new Dog());

    }

    // 这里的方法,参数是父类,但是为了实现功能,需要采用多态
    // 如果没有多态,想传递不同类型的参数,需要每种类需要实现一个func
    // 比如这里 public void func(Dog dog)
    // public void func(Cat cat)
    // 多态性避免了许多重载类!
    // 多态性确保了方法的通用性!
    public void func(Animal animal){
        animal.shout();
    }
}

class Animal{
    public void eat(){
        System.out.println("eat !!!!!!!");
    }

    public void shout(){
        System.out.println("!!!!!!!!!!!!");
    }
}

class Dog extends Animal{
    public void eat(){
        System.out.println("狗吃骨头");
    }

    public void shout(){
        System.out.println("汪汪汪");
    }
}

class Cat extends Animal{
    public void eat(){
        System.out.println("猫吃鱼");    }

    public void shout(){
        System.out.println("喵喵喵");
    }
}