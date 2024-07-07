package com.ysy.annotation;


import java.lang.annotation.*;

@myAnno
public class MetaAnnoDemo {

}


/*
自定义一个注解
target 表示注解可以放在那里
retention 表示注解在什么地方来生效
    runtime > class > source 这个顺序
        在runtime有效,一定在class有效;反之未必
documented 表示是否将注解生成在javadoc中
inherited 表示子类可以继承父类的注解
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.METHOD, ElementType.TYPE})
@interface myAnno{

}