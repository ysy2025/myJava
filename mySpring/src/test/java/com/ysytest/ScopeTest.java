package com.ysytest;

import com.ysy.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {

    @Test
    public void testScope01(){
        ClassPathXmlApplicationContext cac = new ClassPathXmlApplicationContext("spring-score.xml");;

        Student bean1 = cac.getBean(Student.class);
        Student bean2 = cac.getBean(Student.class);

        System.out.println(bean1 == bean2);

    }
}
