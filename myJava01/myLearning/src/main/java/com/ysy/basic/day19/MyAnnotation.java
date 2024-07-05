package com.ysy.basic.day19;

import org.junit.Test;

import java.lang.annotation.*;
import static java.lang.annotation.ElementType.*;

@Inherited
@Repeatable(MyAnnotations.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE,FIELD,PARAMETER,CONSTRUCTOR,LOCAL_VARIABLE})
public @interface MyAnnotation {
    String value() default "hello";
}

@MyAnnotation()
class Zhangsan{
    private String name;
    private int age;

    @Test
    public void test1(){
        System.out.println("zhjjangsan");
    }

}