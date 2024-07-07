package com.ysy.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 可以显示复制,如果没有默认值,就要给
@MyAnno2(schools = "zhangsan")
public class AnnoDemo2 {

    @MyAnno3("zhangsan")
    public void test2(){}
}

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno2{
    // 注解的参数 参数类型+参数名+()
    String name() default "";
    int age()  default 100;
    int id() default -1; // 如果默认值为-1,代表不存在

    String[] schools() default {"PKU", "THU"};
}


@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno3{

    String value();
}