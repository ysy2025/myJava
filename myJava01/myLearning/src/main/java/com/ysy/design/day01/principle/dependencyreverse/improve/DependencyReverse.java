package com.ysy.design.day01.principle.dependencyreverse.improve;

public class DependencyReverse {
    public static void main(String[] args) {

        // 客户端无需改变
        Person person = new Person();
        person.receive(new Email());

        person.receive(new QQ());

        person.receive(new Weixin());
    }

}

interface IReceiver{
    public String getInfo();
}

class Email implements IReceiver{
    @Override
    public String getInfo(){
        return "hello world";
    }
}

class QQ implements IReceiver{
    @Override
    public String getInfo() {
        return "Hello QQ!";
    }
}

class Weixin implements IReceiver{

    @Override
    public String getInfo() {
        return "Hello Weixin!";
    }
}
//person 接收消息
/*
方式1
优点:
简单,比较容易想到

缺点:
如果我们获取的对象是微信,短信呢?
需要新增类,同事Person的类,也要增加相应的方法

解决方法:
引入抽象接口,IReceiver,表示接受者,Person类与接口发生依赖
然后,实现IReceiver,根据不同类实现不同IReceiver方法
这样,Email,微信,等,都属于接收范围,各自实现IReceiver这个接口就行
也就符合了依赖倒转原则

方式2,这里通过依赖倒转原则,优化了project

实现依赖关系传递的三种方式
接口传递
构造方法传递
setter方法传递
 */
class Person{
    public void receive(IReceiver receiver){
        System.out.println(receiver.getInfo());
    }
}
