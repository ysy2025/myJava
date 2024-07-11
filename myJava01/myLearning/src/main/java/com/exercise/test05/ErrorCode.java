package com.exercise.test05;

/*
接口的含义理解:接口可以理解成统一的"协议",而接口中的属性也属于协议中的内容;但是接口的属性都是公共的,静态的,最终的
 */

public interface ErrorCode {
    int age = 18;
    String name = "zhangsan";

    // 错误码编号
    String getCode();

    // 错误码描述
    String getDescription();

    String toString();
}
