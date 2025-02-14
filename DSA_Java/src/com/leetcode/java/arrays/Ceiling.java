package com.leetcode.java.arrays;

public class Ceiling {
    public static void main(String[] args) {
        int target = 5;
        int[] arr = {1,3,5,6};
        System.out.println(ceiling(arr,target));
    }

    static int ceiling(int [] arr , int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target < arr[mid]){
                end = mid - 1 ;
            } else  if (target > arr[mid]){
                start = mid + 1;
            } else{
                return  mid;
            }
        }
        return start;
    }
}
