package com.ysy.basic.day18.calendar;

import org.junit.Test;

import java.util.Calendar;

/**
 * 日历类
 * 实例化->创建对象
 * 
 */
public class calendar {
    
    @Test
    public void test1(){
//        GregorianCalendar gc = new GregorianCalendar();
        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar.getClass());

        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
    }
}
