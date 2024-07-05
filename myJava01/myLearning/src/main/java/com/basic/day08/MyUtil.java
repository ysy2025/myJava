package com.basic.day08;

public class MyUtil {

    //求数组最大值
    public int getMax(int[] arr){
        int result = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length;i++){
            if(arr[i] > result){
                result = arr[i];
            }
        }
        return result;
    }
    //求最小值
    public int getMin(int[] arr){
        int result = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length;i++){
            if(arr[i] < result){
                result = arr[i];
            }
        }
        return result;
    }
    //求和
    public int getSum(int[] arr){
        int result = 0;
        for(int i = 0; i<arr.length;i++){
            result += arr[i];
        }
        return result;
    }
    //平均值
    public double getAve(int[] arr){
        return getSum(arr)/(double)(arr.length);
    }
    //翻转
    public void reverse(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            System.out.println("left is " + left + " right is " + right);
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left ++;
            right --;
            System.out.println("left is " + left + " right is " + right);
        }
    }
    //复制
    public int[] copy(int[] arr){
        return null;
    }
    //遍历
    public void roundRobin(int[] arr){
    }
    //排序
    public void sort(int[] arr){
    }
    // 查找指定元素
    public int getIndex(int[] array, int index){
        return array[index];
    }

}
