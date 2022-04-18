package com.basic.day20.collectiontest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合和数组,都是存储多个数据的结构,是java容器
 * 数组在内存存储方面的特点：
 * 数组初始化以后,长度就确定了.
 * 数组声明的类型,就决定了进行元素初始化时的类型
 *
 * 数组在存储数据方面的弊端:
 * 数组初始化以后,长度就不可变了,不便于扩展
 * 数组中提供的属性和方法少,不便于进行添加、删除、插入等操作， 且效率不高.
 * 同时无法直接获取存储元素的个数
 * 数组存储的数据是有序的、可以重复的. ---->存储数据的特点单一
 *
 * Java 集合类可以用于存储数量不等的多个对象,还可用于保存具有映射关系的关联数组.
 */
public class CollectionTest {

    @Test
    public void test1(){
        Collection coll = new ArrayList();

        coll.add("zhangsan");

        for(int i = 0; i < coll.size(); i++){
            System.out.println(coll);
        }

    }
}
