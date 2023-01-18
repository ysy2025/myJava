package com.ysy2.proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * 是一个工厂类;不是真正的代理类,而是动态生成目标类的代理类的工具类
 * 不是具体的代理类
 * 生产代理类
 */

public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }


    public Object getProxy(){

        /**
         * newProxyInstance(ClassLoader loader, 动态代理,帮助我们动态生成类;类的加载需要加载器;指定加载动态生成的代理类的类加载器:
         *                                      加载器4种:根 c写的,加载核心类库,扩展 扩展类库,应用 自己写的,第三方的jar包,自定义
         * Class<?>[] interfaces, 获取目标对象实现的所有接口的class对象的数组
         *  InvocationHandler h) 执行handler,执行处理, 处理方法的执行;设置代理类中的抽象方法如何重写
         */

        // 获取classloader
        ClassLoader classLoader = this.getClass().getClassLoader();

        // 获取interface 的class数组
        Class<?>[] interfaces = target.getClass().getInterfaces();

        // 获得handler
        InvocationHandler invocationHandler = new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                /**
                 * 参数解释:
                 * proxy是代理对象
                 * method是需要执行的方法
                 * args是要执行的方法的参数列表
                 */
                Object res = null;//实际上是target执行method,填充了args的实现
                try {
                    System.out.println("日志, 方法: " + method.getName() + "参数是, " + Arrays.toString(args));
                    res = method.invoke(target, args);
                    System.out.println("日志, 方法:  " + method.getName() + "结果是, " + res);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("!!WTF!! 出问题了,快找人背锅!" + e);
                } finally {
                    System.out.println("!方法执行完毕! 有问题赶紧找老板!");

                }
                return res;
            }
        };

        return Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
    }
}
