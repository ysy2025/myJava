package com.ysy2test;

import com.ysy2.proxy.Calculator;
import com.ysy2.proxy.CalculatorStaticProxy;
import com.ysy2.proxy.CalculatorImpl;
import com.ysy2.proxy.ProxyFactory;
import org.junit.Test;

import java.lang.reflect.Proxy;

public class proxytest {

    @Test
    public void testProxy(){
        CalculatorStaticProxy proxy = new CalculatorStaticProxy(new CalculatorImpl());

        int aaa = proxy.add(1, 2);

        System.out.println(aaa);
    }


    /**
     * 动态代理jdk代理; 要求必须有接口;生成的代理类和目标类实现相同接口,是在 com.sun.proxy包下;类名为$proxy2
     * cglib动态代理;动态代理,最终生成的代理类会继承目标类,和目标类在相同包下
     */
    @Test
    public void testProxy2(){
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());

        // 没有具体类型,就用共同父类名
        Calculator proxy = (Calculator) proxyFactory.getProxy();

        proxy.add(1,2 );

//        proxy.div(1, 0);
    }
}
