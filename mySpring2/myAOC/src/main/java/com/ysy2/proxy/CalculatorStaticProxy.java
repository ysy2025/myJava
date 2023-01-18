package com.ysy2.proxy;

public class CalculatorStaticProxy implements Calculator {

    private CalculatorImpl target;

    public CalculatorStaticProxy(CalculatorImpl target) {
        this.target = target;
    }

    public int add(int i, int j) {
        try {
            System.out.println("日志!! 方法是 add 参数是 " + i +", " + j);
            int res = target.add(i, j);
            System.out.println("日志!! 方法是 add 结果是 " + res);
            return res;
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            return 0;
        }
    }

    public int sub(int i, int j) {
        System.out.println("日志!! 方法是 sub 参数是 " + i +", " + j);
        int res = target.sub(i, j);
        System.out.println("日志!! 方法是 sub 结果是 " + res);
        return res;
    }

    public int mul(int i, int j) {
        System.out.println("日志!! 方法是 mul 参数是 " + i +", " + j);
        int res = target.mul(i, j);
        System.out.println("日志!! 方法是 mul 结果是 " + res);
        return res;
    }

    public int div(int i, int j) {
        System.out.println("日志!! 方法是 div 参数是 " + i +", " + j);
        int res = target.div(i, j);
        System.out.println("日志!! 方法是 div 结果是 " + res);
        return res;
    }
}
