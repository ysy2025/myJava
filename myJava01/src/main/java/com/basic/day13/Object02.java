package com.basic.day13;

/*
==和equals的区别
==,既可以比较基本类型也可以比较引用类型-基本类型比较值(数据类型不一定要相同),引用类型比较内存地址
equals,java.lang.Object,如果该方法没有被重写,默认也是==;
我们可以看到,String等类型的equals方法被重写了,而且String类常用,久而久之,形成了equals是比较值的错误观点

具体要看自定义类中有没有重写equals方法来判断
通常情况下,重写equals,会比较类中相应属性是否都相等


equals是一个方法;而非运算符
不能使用在基本数据类型上
继承性,是针对引用数据类型的(包装类会延伸说明的)
引用数据类型时
Object中的
    public boolean equals(Object obj) {
        return (this == obj);
    }
equals方法等同于 ==
String,Date,file,包装类等,都重写了equals方法,比较的不是引用地址是否相同,而是实体内容是否相同



 */
public class Object02 {

    public static void main(String[] args) {
//        String a = "zhangsan";
//        String b = a;
////        System.out.println(a==b);
//
//        int aa = 10;
//        int bb = 10;
//        double cc = 10.0;
////        System.out.println(aa == cc);
//
//        boolean aaa = true;
//        int bbb = 1;
////        System.out.println(aaa == true);
//
//        char ac = 10;
//        System.out.println(ac);
//
//        System.out.println(ac == 10);

        Customer customer = new Customer();

        Customer customer1 = new Customer();

        System.out.println(customer == customer1);
        System.out.println(customer.equals(customer1));

        String str1 = new String("zhangsan");
        String str2 = new String("zhangsan");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        String as = "zhangsan";
        String at = "zhangsan";
        System.out.println(as == at);
    }
}
