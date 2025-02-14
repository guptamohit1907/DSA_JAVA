package com.leetcode.java.dsacode;

import java.util.ArrayList;
import java.util.List;

public class CountPairsSum {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(-6);
        nums.add(2);
        nums.add(5);
        nums.add(-2);
        nums.add(-7);
        nums.add(-1);
        nums.add(3);
        int target = -2;
        System.out.println(countPairs(nums,target));
    }

    static int countPairs(List<Integer> nums, int target) {
        int res = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i+1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) < target){
                    res += 1;
                }
            }
        }
        return res;
    }
}
