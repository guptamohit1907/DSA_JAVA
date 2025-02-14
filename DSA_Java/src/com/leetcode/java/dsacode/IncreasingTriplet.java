package com.leetcode.java.dsacode;

public class IncreasingTriplet {
    public static void main(String[] args) {
        int[] nums = {20,100,10,12,5,13};
        System.out.println(increasingTriplet(nums));
    }

    static boolean increasingTriplet(int[] nums) {
        int first_num = Integer.MAX_VALUE;
        int second_num = Integer.MAX_VALUE;
        for (int n: nums) {
            if (n <= first_num) {
                first_num = n;
            } else if (n <= second_num) {
                second_num = n;
            } else {
                return true;
            }
        }
        return false;
    }
}
