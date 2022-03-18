package com.basic.day06;

/*
搜索
线性查找

二分法
 */
public class Find01 {
    public static void main(String[] args) {
        System.out.println("zhangsan");
        String[] arr1 = new String[]{"aa", "bb", "cc", "dd"};
        String dest = "cc";

        int index = findDest(arr1, dest);

        System.out.println("we found dest which located in " + index + " and content is " + arr1[index]);

    }

    private static int findDest(String[] arr1, String dest) {
        int rValue = 0;
                for(int i = 0; i < arr1.length; i++){
            if (arr1[i] == dest){
                System.out.println("we found dest cc!");
                rValue = i;
            }
        }
                return rValue;
    }

}
