package com.design.day01;

/*
* 依赖倒转原则 dependency inversion principle
* 高层模块不应该依赖底层模块,二者都应该依赖其抽象
* 抽象不应该依赖细节,细节应该依赖抽象
* 依赖倒转的中心思想是面向接口编程
*
* 相对于细节的多变性,抽象的东西更加稳定
* 以抽象为基础搭建的架构比以细节搭建的要稳定
* java中,抽象的是接口或者抽象类,细节就是具体的实现类
*
* 使用接口,或者抽象类,制定好规范,而不涉及任何具体的操作,把展现细节的任务交给实现类
*
* 设计!设计很重要!
*
* 依赖倒转原则:
*   底层模块,尽量都有抽象类或者接口,或者两者都有
*   变量的声明类型,尽量是抽象类,或者接口,这样我们的变量引用和实际对象之间,就存在一个缓冲层,利于程序扩展和优化
*   继承时,遵循,里氏替换原则
 */
public class design04 {
}