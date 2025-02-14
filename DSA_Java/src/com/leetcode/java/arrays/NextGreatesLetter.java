package com.leetcode.java.arrays;

public class NextGreatesLetter {
    public static void main(String[] args) {
        char target = 'c';
        char[] arr = {'c','f','j'};
        System.out.println(nextGreatestLetter(arr,target));
    }

    static char nextGreatestLetter(char [] arr , char target){
        int start = 0;
        int end = arr.length - 1;
        int N = arr.length;

        while (start < end){
            int mid = start + (end - start) / 2;
            if (target < arr[mid]){
                end = mid - 1 ;
            } else  if (target > arr[mid]){
                start = mid + 1;
            }
        }
        return arr[start % N] ;
    }
}
