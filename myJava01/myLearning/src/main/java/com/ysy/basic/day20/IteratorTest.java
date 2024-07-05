package com.ysy.basic.day20;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class IteratorTest {
    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add("abc");
        coll.add(new String("zhangsan"));
        coll.add(true);
        coll.add(new Person("zhang", 22));

        Iterator iterator = coll.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test2(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add("abc");
        coll.add(new String("zhangsan"));
        coll.add(true);
        coll.add(new Person("zhang", 22));

        Iterator iterator = coll.iterator();

        for(Object obj:coll ){
            System.out.println(obj);
        }
    }

    @Test
    public void test3(){
        String[] arr = new String[]{"aa", "bb", "cc"};
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = "zhangsan";
//        }

        for(String str:arr){
            str="zhangsan";
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    @Test
    public void test4(){
        Collection ll = new LinkedList();
    }
}
