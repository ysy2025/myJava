package com.ysy.day11;

/*
继承
1,优点
减少代码冗余,提高了代码的复用性
便于功能拓展
为多态性提供前提

2,怎么体现继承性(格式)
class A extends B{
xxx
}
A是子类,subclass
B是父类,superclass
体现,A继承B之后,A中获取了B类中声明的结构(属性,方法)(super是构造方法用的)
私有的,private的属性,方法什么的,也被继承了->可以通过getter方法来调用
私有的,只是因为封装性导致没办法直接调用,需要父类自己调用,然后子类才可以实现

3,子类继承父类后,还可以实现自己的方法,实现功能的扩展


java中关于继承性的说明
1,只支持单继承和多层继承,不允许多重继承:一父亲有多个儿子可以;一儿子有多个父亲不行!
c++支持多继承
2,继承可以多层,子子孙孙无穷尽也
3,直接父类和间接父类
4,子类继承父类以后,获取了直接父类和所有间接父类声明的属性和方法


没有父类的类,默认的父类是 java.lang.Object;
Object是万物之祖
所有的java类,除了java.lang.Object类之外,都直接或者间接继承了java.lang.Object类
所有java类都有java.lang.Object类中的方法

 */
public class heir01 {
    public static void main(String[] args) {
        System.out.println("zhangsan niubi");

        Pencil pencil = new Pencil();

        pencil.draw();

        NewPencil newPencil = new NewPencil();

        newPencil.draw();

        PencilCase pencilCase = new PencilCase();

        pencilCase.draw();
        pencilCase.show();
    }
}


