package com.ysytest;

import com.ysy.Clazz;
import com.ysy.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

    @Test
    public void testIOC(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student studentOne = (Student) applicationContext.getBean("studentOne");

        System.out.println(studentOne);
    }

    @Test
    public void testDI(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student studentTwo = ac.getBean("studentTwo", Student.class);

        System.out.println(studentTwo);
    }

    @Test
    public void testDI2(){
        ClassPathXmlApplicationContext cac = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student studentThree = cac.getBean("studentThree", Student.class);

        System.out.println(studentThree);
    }

    @Test
    public void testDI3(){
        ClassPathXmlApplicationContext cac = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student sf = cac.getBean("studentFour", Student.class);

        System.out.println(sf);
//        System.out.println(studentFour.getAge().getClass());
//        System.out.println(studentFour.getSex().toString());
    }

    @Test
    public void testDI4(){
        ClassPathXmlApplicationContext cac = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student sf = cac.getBean("studentFive", Student.class);

        System.out.println(sf);

//        Clazz clazzInner = cac.getBean("clazzInner", Clazz.class);
//
//        System.out.println(clazzInner);
    }


    @Test
    public void testDI5(){
        ClassPathXmlApplicationContext cac = new ClassPathXmlApplicationContext("applicationContext.xml");

        Clazz clazzOne = cac.getBean("clazzOne", Clazz.class);

        System.out.println(clazzOne);
    }


    @Test
    public void testDI6(){
        ClassPathXmlApplicationContext cac = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student sf = cac.getBean("studentSix", Student.class);

        System.out.println(sf);

//        Clazz clazzInner = cac.getBean("clazzInner", Clazz.class);
//
//        System.out.println(clazzInner);
    }

}
