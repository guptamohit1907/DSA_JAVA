package com.leetcode.java.dsacode;

import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {1} ;
        System.out.println(singleNumber(nums));
    }

//    static int singleNumber(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            int count = 0;
//            for (int j = 0; j < nums.length; j++) {
//                if(nums[i] == nums[j]){
//                    count += 1;
//                }
//            }
//            if (count == 1){
//                return  nums[i];
//            }
//        }
//        return -1;
//    }

//    static int singleNumber(int[] nums) {
//        HashSet<Integer> set = new HashSet<>();
//        HashSet<Integer> duplicates = new HashSet<>();
//        for (int num : nums) {
//            if (!set.add(num)) {
//                duplicates.add(num);
//            }
//        }
//        set.removeAll(duplicates);
//        for (int num : set) {
//            return num;
//        }
//        return -1;
//    }

    static int singleNumber(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i += 3) {
            if (nums[i] == nums[i + 1]) {
                continue;
            } else {
                return nums[i];
            }
        }

        return nums[nums.length - 1];
    }

}
