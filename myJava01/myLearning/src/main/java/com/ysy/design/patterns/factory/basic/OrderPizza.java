package com.ysy.design.patterns.factory.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OrderPizza {

    // 简单的入门模式
//    public OrderPizza() {
//        //创建pizza
//        Pizza pizza = null;
//
//        //希望订购的pizza
//        String orderType;
//
//        do{
//            orderType = getType();
//            System.out.println("right now order type is !!!!!!! + " + orderType);
//            if(orderType.equals("greek")){
//                pizza = new GreekPizza();
//                pizza.setName("希腊披萨");
//            }else if(orderType.equals("chinese")){
//                pizza = new ChinesePizza();
//                pizza.setName("中国披萨");
//            }else{
//                break;
//            }
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        }while(true);
//    }

    /*
    接下来利用工厂模式构造pizza
    这里需要两个材料:1,工厂对象;2,pizza类型,返回一个对象->pizza

    因此需要声明工厂对象;声明pizza;type在方法中获得
     */

    // 定义一个简单工厂对象

    SimpleFactory sf;
    // 定义pizza

    Pizza pizza = null;

    // 通过构造器来调用setFactory;这里的 工厂类 是外部传入的
    public OrderPizza(SimpleFactory sf) {
        setFactory(sf);
    }

    public void setFactory(SimpleFactory sf){
        String orderType = "";

        // 设置工厂对象
        this.sf = sf;

        do{
            // 首先制造一个pizza
            orderType = getType();
            pizza = sf.CreatePizza(orderType);

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
