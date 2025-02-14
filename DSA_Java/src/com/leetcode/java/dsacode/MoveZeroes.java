package com.leetcode.java.dsacode;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums = {0};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

//    static void moveZeroes(int[] nums) {
//        ArrayList list = new ArrayList<>();
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 0){
//                count += 1;
//            } else {
//                list.add(nums[i]);
//            }
//        }
//        for (int i = 0; i < count ; i++) {
//            list.add(0);
//        }
//        for (int i = 0; i < list.size(); i++) {
//            nums[i] = (int) list.get(i);
//        }
//    }

    static void moveZeroes(int[] nums) {
        ArrayList list = new ArrayList<Integer>();
        int lastNonZeroFoundAt = 0;
        for (int i = 0; i < list.size(); i++) {
            if ((int) list.get(i) != 0) {
                list.set(lastNonZeroFoundAt++,  list.get(i));
            }
        }
        for (int i = lastNonZeroFoundAt; i < list.size(); i++) {
            list.set(i, 0);
        }
        for (int i = 0; i < list.size(); i++) {
            nums[i] = (int) list.get(i);
        }
    }
}
