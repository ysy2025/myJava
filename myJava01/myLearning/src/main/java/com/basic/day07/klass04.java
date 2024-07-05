package com.basic.day07;

/*
如何定义方法,声明和使用
1.方法是刻画类应该具有的功能
2.方法分类
    有形参
        无返回值 void 方法名(){}
        有返回值 返回值类型 方法名(){}

    无形参
        无返回值 void 方法名(形参类型 形参名){}
        有返回值 返回值类型 方法名(形参类型 形参名){}

3.方法的声明
    权限修饰符 + 返回值类型 + 方法名 + (形参类型 形参名) + {方法体}
    修饰符后面再说 static final abstract

    3.1 权限修饰符
        Java指定的4中 private public 默认缺省 protected->封装性
    3.2 返回值类型
        无返回值:void
            if 没有返回值时
            通常没有返回值就不需要使用return
            但是如果使用了,只能 return; 这里的return起到了结束方法的作用;return后不可以声明表达式
        有返回值:自定义指定返回值类型
            方法声明时,指定返回值类型
            需要return 关键字来返回指定类型的变量或者常量
        需不需要返回值,看经验
    3.3 方法名,标识符,遵循标识符的规则和规范
    3.4 形参列表
        可以0,1,多个
        格式: 类型1 形参1, 类型2 形参2
        要不要形参? 看经验
    3.5 方法体
        方法功能的实现
    3.6 return
        使用范围:方法体结尾
        结束方法
        针对有返回值的方法

    3.7 方法使用中的注意事项
        方法调用可以使用当前类的属性和方法(自己人!)
            递归:自己调用自己
        方法中不可以再调用方法;不能内嵌

 */
public class klass04 {
    public static void main(String[] args) {

    }
}

class Person2{
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
        int times = 18;
//        System.out.println(times);
        return;
//        int aaa = 1; // unreachable,无法达到的语句
    }
}