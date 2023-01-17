package com.ysytest;

import com.ysy.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    /**
     * 实例化
     * 依赖注入
     * 初始化,需要通过bean-init属性指定初始化方法
     * IOC容器关闭的时候类销毁
     */
    @Test
    public void userTest01(){
        ClassPathXmlApplicationContext cac = new ClassPathXmlApplicationContext("spring-lifecycle.xml");

        User bean = cac.getBean(User.class);

        System.out.println(bean);

        cac.close();
    }
}
