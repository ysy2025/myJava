package com.ysy.basic.day13;

/*重写equals方法
 *自定义的类,通常是比较实体内容是否相同;那么就需要重写equals方法
 *
 * equals
 * 对称性x.equals(y) y.equals(x)
 * 自反性x.equals(x)
 * 传递性a.equals(b),b.equals(c)->a.equals(c)
 * 一致性
 * x.equals(null), 永远false
 * x.equals(不同类型), 永远false
 *
 * 字符串,是在常量池中,新建一个string时,会在常量池中查,有相同的就直接引用
 */
public class Object03 {
    public static void main(String[] args) {
        Customer customer = new Customer();

        Customer customer1 = new Customer();

        System.out.println(customer == customer1);
        System.out.println(customer.equals(customer1));
    }

}
