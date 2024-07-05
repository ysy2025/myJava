package com.ysy.basic.day19;

/**
 * 示例一：生成文档相关的注解
 * @author 标明开发该类模块的作者, 多个作者之间使用,分割
 * @version 标明该类模块的版本
 * @see 参考转向, 也就是相关主题
 * @since 从哪个版本开始增加的
 * @param 对方法中某参数的说明, 如果没有参数就不能写
 * @return 对方法返回值的说明, 如果方法的返回值类型是void就不能写
 * @exception 对方法可能抛出的异常进行说明 , 如果方法没有用throws显式抛出的异常就不能写
 *
 * 示例二： 在编译时进行格式检查(JDK内置的三个基本注解)
 * @Override: 限定重写父类方法, 该注解只能用于方法;编译的时候就要校验,给我们良好的提示
 * @Deprecated: 用于表示所修饰的元素(类, 方法等)已过时。通常是因为所修饰的结构危险或存在更好的选择
 * @SuppressWarnings: 抑制编译器警告
 */
public class AnnoTest1 {
}

class Person{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void walk(){
        System.out.println("ren zoulu");
    }
    public void eat(){
        System.out.println("ren chifan");
    }


}

interface Info{
    void show();
}
class Student extends Person implements Info{

    @SuppressWarnings("unchecked")
    @Override
    public void walk() {
        super.walk();
        System.out.println("zhangsan niubi!");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("zhangsan niubi!");
    }

    @Override
    public void show() {
        System.out.println("zhangsan xiangchi xigua!");
    }
}