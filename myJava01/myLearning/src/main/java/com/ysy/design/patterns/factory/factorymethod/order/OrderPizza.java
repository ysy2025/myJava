package com.ysy.design.patterns.factory.factorymethod.order;

import com.ysy.design.patterns.factory.factorymethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public abstract class OrderPizza {
    //构造器,来调用create方法
    public OrderPizza() {
        //创建pizza
        Pizza pizza = null;

        //希望订购的pizza
        String orderType;

        do{
            orderType = getType();
            System.out.println("right now order type is !!!!!!! + " + orderType);

            pizza = createPizza(orderType);

            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while(true);

    }

    // 定义一个抽象方法, 让各个工厂子类自己实现
    abstract Pizza createPizza(String orderType);



    //gettype,通过console动态获取客户希望订购的pizza
    private String getType(){
        try{
            BufferedReader strInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type is : ");
            String str = strInput.readLine();
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!   input is " + str);
            return str;
        }catch(Exception e){
            e.printStackTrace();
            return "";
        }
    }
}
