package com.ysy.annotation.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo04 {

    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("com.ysy.annotation.reflection.User");

//        User user = new User();
//        Class<? extends User> aClass = user.getClass();
        // 包名+类名
        System.out.println(aClass.getName());
        // 类名
        System.out.println(aClass.getSimpleName());

        System.out.println("==================\n");
        // 属性 只能找到public
        Field[] fields = aClass.getFields();
        for (Field f : fields){
            System.out.println(f);
        }

        // 找到全部的属性
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field f : declaredFields){
            System.out.println(f);
        }

        Field name = aClass.getDeclaredField("name");
        System.out.println(name);

        System.out.println("==================\n");

        // 获得类的方法,包括本类和父类的全部public的方法
        Method[] methods = aClass.getMethods();

        // 获得本类的全部方法
        Method[] declaredMethods = aClass.getDeclaredMethods();

        for(Method m:methods){
            System.out.println(m);
        }

        System.out.println("==================\n");

        for(Method m:declaredMethods){
            System.out.println(m);
        }
        System.out.println("==================\n");
        // 获得指定方法
        Method getName = aClass.getMethod("getName", null);
        Method setName = aClass.getMethod("setName", String.class);
        System.out.println(getName);
        System.out.println(setName);

        System.out.println("==================\n 构造器");
        // 获得指定构造器
        Constructor<?>[] constructors = aClass.getConstructors();
        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();

        for (Constructor c:constructors){
            System.out.println(c);
        }

        for (Constructor c:declaredConstructors){
            System.out.println(c);
        }
    }
}
