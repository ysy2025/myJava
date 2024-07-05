package com.ysy.basic.day13;

/*
==
对于引用数据类型来讲,比较的是两个引用数据类型变量的地址值是否相同
赋值,赋的是内存的地址

 */
public class Test01 {
    public static void main(String[] args) {
        Sub s = new Sub();
        System.out.println(s.count);
        s.show();

        Base b = s;
        System.out.println(b==s);

        //多态性,属性看左边,方法看右边
        System.out.println(b.count);

        b.show();

    }
}

class Base{
    int count = 10;
    public void  show(){
        System.out.println(this.count);
    }
}

class Sub extends Base{
    int count = 20;
    public void  show(){
        System.out.println(this.count);
    }
}