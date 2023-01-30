package com.ysy3test;

import com.ysy3.aop.annotation.Calculator;
import com.ysy3.aop.annotation.CalculatorImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPtest {

    @Test
    public void testAOPByAnnotation(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("aop-annotation.xml");

        Calculator calculator = ioc.getBean(Calculator.class);

//        calculator.add(1, 1);
        calculator.div(10, 1);
    }


    @Test
    public void testAOPByAnnotation2(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("aop-annotation.xml");

        Calculator calculator = ioc.getBean(Calculator.class);

//        calculator.add(1, 1);
        calculator.div(10, 1);
    }

}
