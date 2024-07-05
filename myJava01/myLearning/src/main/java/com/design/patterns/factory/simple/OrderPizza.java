package com.design.patterns.factory.simple;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OrderPizza {
    public OrderPizza() {
        //创建pizza
        Pizza pizza = null;

        //希望订购的pizza
        String orderType;

        do{
            orderType = getType();
            System.out.println("right now order type is !!!!!!! + " + orderType);
            if(orderType.equals("greek")){
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            }else if(orderType.equals("chinese")){
                pizza = new ChinesePizza();
                pizza.setName("中国披萨");
            }else{
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while(true);
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