package com.ysy.annotation.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo05 {
    public static void main(String[] args) throws Exception {

        // get class
        Class c1 = Class.forName("com.ysy.annotation.reflection.User");

        /*
        本质上是调用了无参数构造器
         */
        User u1 = (User) c1.newInstance();

        System.out.println(u1);

        // 通过构造器创建对象;首先获取构造器,然后传入参数
        Constructor constructor = c1.getDeclaredConstructor(String.class, int.class, int.class);

        User u2 =(User) constructor.newInstance("zhangsan", 1, 18);

        System.out.println(u2);

        // 通过反射获取方法来执行
        User u3 =(User) c1.newInstance();
        Method setName = c1.getDeclaredMethod("setName", String.class);
        setName.invoke(u3,"zhangsna");
        System.out.println(u3.getName());

        System.out.println("==========\n");

        // 通过反射操作属性;要注意关闭权限检测
        // 不能直接操作私有属性
        User u4 =(User) c1.newInstance();
        Field name = c1.getDeclaredField("name");
        name.setAccessible(true); // 通过此方法,讲程序的安全检测关闭了
        name.set(u4, "sunwk");
        System.out.println(u4.getName());

    }
}
