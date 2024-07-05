package com.basic.day04;

/*
嵌套循环
内外层循环

break
continue
带label的
 */

public class Cycle03 {
    public static void main(String[] args) {
        System.out.println("zhangsan");

        label: for(int i = 1; i < 4; i++){
            for (int j = 1; j < 10; j++){
                if(j % 4 == 0){
//                    break;
                    continue label;
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
