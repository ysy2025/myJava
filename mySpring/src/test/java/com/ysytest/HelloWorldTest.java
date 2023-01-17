package com.ysytest;

import com.ysy.HelloWorld;
import com.ysy.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

public class HelloWorldTest {

    @Test
    public void Test01(){
        System.out.println("zhangsan");
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        HelloWorld helloworld = (HelloWorld) ac.getBean("helloworld");

        helloworld.sayHello();
    }
}
