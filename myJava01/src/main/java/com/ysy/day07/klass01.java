package com.ysy.day07;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/*
面向对象
0,面向对象的思想和面向过程的思想
面向过程:功能行为,以函数为最小单位,考虑怎么做
面向对象:具备了功能的对象,以类/对象为最小单位,考虑谁来做

程序员从面向过程的执行者->面向对象的指挥者

分析思路:
根据问题需要,选择实体
从实体中寻找解决问题的属性和功能,形成了概念世界中的类
抽象的实体用计算机语言描述形成计算机世界中的类
类实例化形成对象


1,类和类成员

属性
方法
构造器

代码块
内部类

2,面向对象的三大特征
封装性
继承性
多态性

3,其他关键字
this
super
final
abstract
interface
package
public private
static
void

 */
public class klass01 {
    public static void main(String[] args) {
        Man zhangsan = new Man();
        System.out.println(zhangsan.getAge());

        Man lisi = new Man();
        System.out.println(lisi.getSex());
    }

}

class Man{
    private int age = 18;
    private int height = 180;
    private String sex = "F";

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }



}