package com.exercise.test02;

/*
Java中不能定义基本类型 primitive type 对象;为了能将基本类型视为对象处理,并且能连接相关方法
Java 为每个基本类型都提供了包装类;;
int -> Integer
boolean ->Boolean
这样可以把基本类型转换为对象来处理了

 */
public class PackageClazzDemo {

    public static void main(String[] args) {
//        int a = 7;
//        Integer b = new Integer(7);
//        System.out.println(a == b);
//
//        System.out.println(b.byteValue());
//
//        /*
//        区别很明显
//        这里的a. 提示的方法就很少
//        b. 提示的方法就很多了
//         */
//
//        Integer c = new Integer("45");
//        System.out.println(c.floatValue());
//
//
//        int d = Integer.parseInt("452");
//        System.out.println(d);
//
//        String cs = c.toString();
//        System.out.println(cs);
//
//        System.out.println(Integer.toHexString(16));
//
//        System.out.println(Integer.MAX_VALUE);


//        boolean a = (1==2);
//        System.out.println(a);
//
//        Boolean b = new Boolean(1==2);
//        System.out.println(b.equals(a));

//        byte a = 45;
//        Byte b = new Byte(String.valueOf(45));
//        System.out.println(a);
//        System.out.println(b);
//
//        System.out.println(Byte.MAX_VALUE);
//        System.out.println(Byte.MIN_VALUE);

//        Character a = new Character('a');
//        char b = 'a';
//
//        System.out.println(a == b);
//
//        System.out.println(a.charValue());
//        System.out.println(Character.isUpperCase('a'));
//        int a1 = ('a');
//        System.out.println(a1);
//        System.out.println(Character.isUpperCase(97));
//        System.out.println(Character.getType(97));
//        System.out.println(97>>>16);

        Double v = new Double(1.2);
        double a = 1.2;

        Double v1 = Double.valueOf("1.23");
        System.out.println(v1);




    }
}
