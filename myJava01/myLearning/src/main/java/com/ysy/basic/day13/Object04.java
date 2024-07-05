package com.ysy.basic.day13;

import java.util.Date;

/*toString方法
*当我们输出一个对象的引用时,实际上就是调用当前对象的toString()
* Object类中,toString()的定义
*
*  getClass().getName() + "@" + Integer.toHexString(hashCode());
*
* String,Date,File,包装类等,都重写了toString方法,调用toString的时候返回"实体内容"信息
*
* 自定义类,可以重写toString()方法,调用此方法时,返回对象的实体内容
*
 */
public class Object04 {
    public static void main(String[] args) {
        Customer customer = new Customer();
        System.out.println(customer.toString());
        System.out.println(customer);

        String mm = new String("MM");
        System.out.println(mm);

        Date date = new Date(1234123423412L);
        System.out.println(date.toString());
    }
}

