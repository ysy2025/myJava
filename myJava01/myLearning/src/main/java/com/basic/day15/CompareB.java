package com.basic.day15;

public class CompareB{
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        //通过实现类的对象,可以调用接口中的默认方法;

//        System.out.println("====================================");
//        subClass.method2();
        //静态方法, 接口中定义的静态方法,只能接口自己使用,类没办法调用

//        System.out.println("!@!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//        CompareA.method1();

        // 方法被重写后,调用的时候是调用重写的方法
        // 当继承的父类和实现的接口中,声明了同名同参数的默认方法,子类在没有重写此方法的时候,默认采用父类的方法 --> 类优先原则 属性没有优先,方法有优先
        // 类没有继承父类,实现了多个接口,而且多个接口中有同名同参数的方法
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        subClass.method3();
    }
}

//class SubClass extends SuperClass implements CompareA{
//    @Override
//    public void method2() {
//        System.out.println("subclass zhangsan lisi");
//    }
//
////    @Override
////    public void method3() {
////        System.out.println("sunwukong niubi!");
////    }
//}

// 类没有继承父类,实现了多个接口,而且多个接口中有同名同参数的有方法体的默认方法,在没有重写此方法的时候,会冲突-->接口冲突
// 一旦有了父类,就不会冲突了.

class SubClass extends SuperClass implements CompareA, CompareC{
    @Override
    public void method2() {
        System.out.println("subclass zhangsan lisi");
    }

    @Override
    public void method3() {
        System.out.println("subclass !!!");
    }

    public void mymethod(){
        method3();
        super.method3();

        // 实现类实现了接口,想调用已经重写的接口中的默认方法,
        CompareA.method1();
        CompareA.super.method2();
    }
}