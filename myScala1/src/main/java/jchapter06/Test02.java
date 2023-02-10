package jchapter06;

import org.junit.Test;

import java.util.HashSet;

public class Test02 {

    @Test
    public void test1(){
        int[] arr = new int[100000];
        System.out.println(arr.length);
        for(int i = 0;i < arr.length;i++){
            arr[i] = i + 1;
        }
        long start = System.currentTimeMillis();
        for(int j = 1; j<=100000;j++){
            int temp = j;
            if(temp%10000 == 0){
                System.out.println(temp);
            }
            for(int i = 0;i < arr.length;i++){
                if(temp == arr[i]){
                    break;
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("time： " + (end - start)); //time： 823
    }

    //算法复杂度为 O(1)
    @Test
    public void test2(){
        HashSet<Integer> set = new HashSet<Integer>(100000);
        for(int i = 0;i < 100000;i++){
            set.add(i + 1);
        }
        long start = System.currentTimeMillis();
        for(int j = 1; j<=100000;j++) {
            int temp = j;
            if(temp%10000 == 0){
                System.out.println(temp);
            }
            boolean contains = set.contains(temp);
        }
        long end = System.currentTimeMillis();
        System.out.println("time： " + (end - start)); //time： 5
    }

}
