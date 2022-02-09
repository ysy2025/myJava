package com.ysy.day04;

/*
无限循环
while(true){} = for(;;)
python的无限循环
https://blog.csdn.net/lnotime/article/details/102497678

 */
import java.util.Scanner;

public class While02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true){
            int i = sc.nextInt();
            sum += i;
            System.out.println(sum);
            if (sum > 10) break;
        }

        for(;;){
            int i = sc.nextInt();
            sum += i;
            System.out.println(sum);
            if(sum > 20) break;
        }
    }
}
