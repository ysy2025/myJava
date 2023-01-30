package com.ysy3.aop.xml;

import org.springframework.stereotype.Component;

/**
 * 核心业务代码混入了非核心代码
 * 附加代码离散,封装困难,维护困难
 *
 * 解决办法:解耦合;把附加代码抽取出来
 *
 * 困难:要抽取的代码在方法内部,靠以前的把子类中的重复代码抽取到父类中,不行的.(是分段的,非连续的)
 */

@Component
public class CalculatorImpl implements Calculator {
    public int add(int i, int j) {
        int res = i + j;
        System.out.println("这是方法内部: result " + res);
        return res;
    }

    public int sub(int i, int j) {
        int res = i - j;
        System.out.println("这是方法内部: result " + res);
        return res;
    }

    public int mul(int i, int j) {
        int res = i * j;
        System.out.println("这是方法内部: result " + res);
        return res;
    }

    public int div(int i, int j) {
        int res = i / j;
        System.out.println("这是方法内部: result " + res);
        return res;
    }
}
