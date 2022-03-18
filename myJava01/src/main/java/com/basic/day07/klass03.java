package com.basic.day07;

/*
内存解析 见尚硅谷ppt

属性怎么声明
属性=成员变量 vs 局部变量
1 相同点
1.1 格式一致
    类型 变量名 = 变量值
1.2 先声明,后使用
1.3 都有对应作用域

2 不同点
2.1 在类中声明位置不同
    属性直接定义在类的{}中
    局部变量声明在方法内,方法形参,代码块内,构造器形参,构造器内部变量
2.2 关于权限修饰符的不同
    属性:可以在声明属性时,指明权限修饰符
        常用的权限修饰符:private public 缺省(默认为缺省),protected,可见性的影响,说白了能不能调用->封装性
    局部变量:不可以使用权限修饰符的.(除非是final)
2.3 默认初始化值的情况
    属性:根据类型不同,初始化值不同
        整型=0
        浮点=0.0
        字符=0
        boolean = false
        引用数据类型 = null
    局部变量:没有初始化值
        在调用局部变量前,必须要赋值.
        特别的,形参在调用时,赋值即可(方法里面的形参);
2.4 内存中加载位置不同
    属性加载在堆空间(非static, static属性在栈空间)
    局部变量加载在栈空间

方法怎么声明

 */
public class klass03 {
    public static void main(String[] args) {

    }
}

class Person1{
    //属性=成员变量
    int age = 18;
    String sex = "F";
    String name = "zhangsan";
    String country;

    //方法,这里面的food是局部变量
    public void eat(String food){
        System.out.println(name + " is eating " + food);
        //这里的food2是方法内部的变量,也是变量,但是是局部变量
        String food2 = "pizza";
//        private String food3 = "pizza"; //非法的
        final String food3 = "pizza";
        System.out.println(name + " do not like eating " + food);
    }

    public void sleep(int hours){
        System.out.println(name + " need to sleep for " + hours + " hours");
    }

    public void play(String thing){
        int times;
//        System.out.println(times);
    }
}