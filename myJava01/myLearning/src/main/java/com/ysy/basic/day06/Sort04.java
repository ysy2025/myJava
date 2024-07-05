package com.ysy.basic.day06;

/*
快排

 */
import java.util.Arrays;

public class Sort04 {
    public static void main(String[] args) {
        int [] arr = new int[]{34,12,23,435,56,123,1,231};
        System.out.println(Arrays.toString(arr));
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int left, int right) {
        int middle;
        if (left < right){
            middle = partition(arr, left, right);
            quickSort(arr, left, middle - 1);
            quickSort(arr, middle + 1, right);
        }

    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        while(left < right){
            while(left<right && arr[right] >= pivot)
                right--;
            arr[left] = arr[right];
            while(left < right && arr[left]<= pivot)
                left++;
            arr[right] = arr[left];
        }
        arr[left] = pivot;
        return left;
    }

}