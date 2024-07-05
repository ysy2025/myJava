package com.ysy.design.patterns.factory.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OrderPizza2 {

    // 定义一个pizza
    Pizza pizza = null;


    // 通过构造器来调用setFactory;这里的 工厂类 是外部传入的
    public OrderPizza2() {

        String orderType = "";

        // 设置工厂对象
        do{
            // 首先制造一个pizza
            orderType = getType();
            pizza = SimpleFactory2.CreatePizza2(orderType);

            if(pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();

            }else{
                System.out.println("失败了!");
                break;
            }


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
