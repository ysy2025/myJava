package com.ysy3test;

import com.ysy3.aop.annotation.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPByXMLtest {

    @Test
    public void testAOPByXML(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("aop-xml.xml");

        Calculator calculator = ioc.getBean(Calculator.class);

//        calculator.add(1, 1);
        calculator.div(10, 1);
    }


}
