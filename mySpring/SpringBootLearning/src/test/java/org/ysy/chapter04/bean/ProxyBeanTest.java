package org.ysy.chapter04.bean;

import junit.framework.TestCase;
import org.junit.Test;
import org.ysy.chapter04.interceptor.MyInterceptor;
import org.ysy.chapter04.service.HelloService;
import org.ysy.chapter04.service.impl.HelloServiceImpl;

public class ProxyBeanTest extends TestCase {

    @Test
    public void test01(){
        HelloServiceImpl helloService = new HelloServiceImpl();
        HelloService proxy = (HelloService) ProxyBean.getProxyBean(helloService, new MyInterceptor());

        proxy.sayHello("hello zhangsan");
        System.out.println("!!!!!!!!");
    }
}