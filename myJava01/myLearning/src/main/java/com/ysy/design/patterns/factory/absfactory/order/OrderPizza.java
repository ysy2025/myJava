package com.ysy.design.patterns.factory.absfactory.order;

import com.ysy.design.patterns.factory.absfactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OrderPizza {

    AbsFactory absFactory;

    public OrderPizza(AbsFactory absFactory) {
        setFactory(absFactory);
    }

    // 设置工厂
    private void setFactory(AbsFactory factory){
        Pizza pizza = null;

        String orderType = "";

        this.absFactory = factory;

        do{
            orderType = getType();

            // factory 可能是北京的工厂子类,也可能是greek的子类
            pizza = absFactory.createPizza(orderType);

            if (pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
            else {
                System.out.println("failed!");
                break;
            }
        } while (true);
    }

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
