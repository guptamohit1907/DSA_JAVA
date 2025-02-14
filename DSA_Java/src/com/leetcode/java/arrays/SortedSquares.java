package com.leetcode.java.arrays;

import java.util.Arrays;

public class SortedSquares {
    public static void main(String[] args) {
        int[] nums = {-7,-3,2,3,11};
        int[] res = sortedSquares(nums);
        Arrays.sort(res, 0, res.length);
        System.out.println(Arrays.toString(res));
    }

    public static int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i] * nums[i];
        }
        return res;
    }
}
