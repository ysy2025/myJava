package com.design.patterns.proxy.dynamic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    // 维护一个目标对象,Object
    private Object target;

    // 通过构造器,对target进行初始化
    public ProxyFactory(Object target) {
        this.target = target;
    }

    // 给目标对象生成代理对象
    /*
        Proxy.newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)

        ClassLoader loader 指定当前目标对象使用的类加载器,获取加载器的方法固定
        Class<?>[] interfaces 目标对象实现的接口类型,使用泛型方法确认类型
        InvocationHandler h 事情处理,执行目标对象的方法时,会触发事情处理方法,会把当前执行目标对象方法作为参数传入

     */
    public Object getProxyInstance(){

        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("JDK 代理开始");

                        // 通过反射机制,调用目标对象方法
                        Object returnVal = method.invoke(target, args);
                        System.out.println("JDK 代理结束");
                        return returnVal;

                    }
                }) ;
    }
}
