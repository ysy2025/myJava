package com.ysy.basic.day21;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

public class LambdaTest {
    @Test
    public void test(){

        Runnable r = () -> System.out.println("zhangsan");
        r.run();

        Consumer<String> c = (String s) -> {
            System.out.println(s);
        };

        c.accept("zhangsan");
    }

    @Test
    public void test02(){
        Consumer<String> c = (s) -> {
            System.out.println(s);
        };

        c.accept("zhangsan");
    }

    @Test
    public void test03(){
        Consumer<String> c = s -> {System.out.println(s);};

        c.accept("zhangsan");
    }

    @Test
    public void test04(){
        Comparator<Integer> c1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };

        int compare = c1.compare(10, 100);
        System.out.println(compare);
    }
}
