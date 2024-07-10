package com.exercise.test03;

import java.util.*;

/*
collection
两个子类 set  list
set的子类 hashset treeset
list的子类 arraylist linkedlist

还有个map
子类 hashmap treemap

 */
public class CollectionDemo {

    public static void main(String[] args) {
//        // Arraylist
//        ArrayList<String> strings = new ArrayList<>();
//
//        strings.add("zhangsan");
//        strings.add("zhangsan");
//        strings.add("zhangsan");
//
//        System.out.println(strings);
//
//        Iterator<String> iterator = strings.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//
//        System.out.println(strings.contains("haha"));
//        System.out.println(strings.size());
//
//        // list
//        ArrayList<String> strings1 = new ArrayList<>();
//        strings1.add("lisi");
//        strings1.add("lisi1");
//        strings1.add("lisi2");
//        strings1.add("lisi3");
//
//        System.out.println(strings1.size());
//
//        System.out.println(strings1.get(1));
//        strings1.set(2, "hahaha");
//        System.out.println(strings1);

//        // set 集合,没有顺序
//        HashSet<String> hs = new HashSet<>();
//        hs.add("zhagnsan");
//        hs.add("haha");
//        hs.add("asdfa");
//
//        System.out.println(hs);
//        System.out.println(hs);
//
//        System.out.println(hs.contains("znag"));
//
//        TreeSet<String> ts = new TreeSet<>();
//        ts.add("zhangsan");
//        ts.add("lisi");
//        ts.add("wwangwu");
//
//        System.out.println(ts);
//        System.out.println(ts.first());

        /* map 字典类型

        为什么HashMap中key是引用类型而不是基本数据类型？

        最主要的原因是，hashmap中不能存储重复值，因此在存入值的时候，需要用到存储对象的hashcode()和equals()方法进行判断
        而基本数据类型是没有这两个方法的。因此HashMap中key只能是引用类型。
         */
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "zhangsan");
        map.put(2, "lisi");
        map.put(3, "wangwu");

        System.out.println(map);

        System.out.println(map.containsKey(1));
        System.out.println(map.keySet());
        System.out.println(map.values());

        Iterator<Integer> iterator = map.keySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
