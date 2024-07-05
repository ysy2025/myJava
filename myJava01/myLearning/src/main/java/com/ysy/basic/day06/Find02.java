package com.ysy.basic.day06;

import java.util.Arrays;

/*
二分法
查找数组需要有序

 */
public class Find02 {
    public static void main(String[] args) {
        // 初始化
        int[] arr1 = new int[]{-98,12,234,123,456,234,767,1234,45,123,34,12343,-123};
        System.out.println("排序前" + Arrays.toString(arr1));

        int dest1 = 45;

        //数组排序
        Arrays.sort(arr1);

        System.out.println("排序后" + Arrays.toString(arr1));


        int index = SplitFind(arr1, dest1);
        System.out.println("location of " + dest1 + "in arr1 is " + index);

    }

    private static int SplitFind(int[] arr1, int dest1) {

        /*
        二分法
        确定head和tail

        如果head和tail差距太小,不用二分
         */
        int head = 0;
        int tail = arr1.length - 1;

        int result = -1;
        // head & tail 数组太小不用二分
        if (tail - head <= 1) {
            //head
            if (arr1[head] == dest1) return head;
            if (arr1[tail] == dest1) return tail;
            result = -1;
        }

        //tail 和 head 差距大于1,也就是数组足够二分
        while (tail - head > 1) {
            //数组边界情况,直接返回-1
            if ((arr1[head] > dest1) | (arr1[tail] < dest1)) {
                System.out.println("sorry but min of array is bigger than dest or max of array is less than dest.");
                result = -1;
                break;
            }
            // 数组边界情况直接返回 head or tail
            else if ((arr1[head] == dest1) | (arr1[tail] == dest1)) {
                if (arr1[head] == dest1) {
                    System.out.println("11111111111   location of " + dest1 + "is " + head);
                    result = head;
                    break;
                }
                if (arr1[tail] == dest1) {
                    System.out.println("22222222222    location of " + dest1 + "is " + tail);
                    result = tail;
                    break;
                }
            } else {
                int mid = (head + tail) / 2;
                System.out.println("the mid is " + mid);
                if (arr1[mid] == dest1) {
                    result = mid;
                    System.out.println("33333 location of " + dest1 + "is " + mid);
                    break;
                }
                else if (arr1[mid] > dest1) {
                    tail = mid;
                } else if (arr1[mid] < dest1) {
                    head = mid;
                }
            }
        }
        return result;
    }

}
