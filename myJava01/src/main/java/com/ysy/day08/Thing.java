package com.ysy.day08;

/*
方法

一,理解"万物皆对象"
1,java语言中,通过将功能,结构封装到类中,通过类实例化成为对象,来调用具体的对象
2,涉及到java语言和前段html,后端数据库交互时,前后端的结构在java层面交互时,都体现为类和对象

对象数组的内存解析
对于Student[] a = new Student[20]这类,引用类型的变量,只可能存储两类值:null,或者地址值(引用的类的实例)

比如这里的phone,是Phone类型的实例化,打印时,是个地址值
ps是引用了Phone类型的数组,没有初始化,打印的时候是数组,其中的类型是Phone
 */

/*
二,匿名对象
1,匿名对象没有赋给一个变量名
2,匿名对象只能用一次

*/
public class Thing {
    public static void main(String[] args) {
        System.out.println("zhangsan");

        Phone phone = new Phone();
        System.out.println(phone);

        Phone[] ps = new Phone[2];
        System.out.println(ps);


        // 实名函数,实例化的对象调用的函数
        Phone phone1 = new Phone();
        phone1.send("zhangsan");
        phone1.play("zhangsan");

        //匿名对象
        new Phone().send("zhjangsan");
        new Phone().play("zhangsan");
        /*
        这两个new Phone()不是同一个对象

         */
        new Phone().price = 100;
        new Phone().showPrice();

        //匿名对象的使用
        PhoneMall phoneMall = new PhoneMall();
        phoneMall.show(new Phone());
    }
}

class PhoneMall{
    public void show(Phone phone){
        phone.send("zhangsan");
        phone.play("zhangsan");
    }
}
class Phone{
    double price;

    public void send(String email){
        System.out.println("0000 It is Sending " + email);
    }
    public void play(String game){
        System.out.println("1111 It is Playing " + game);
    }

    public void showPrice(){
        System.out.println(price);
    }
}