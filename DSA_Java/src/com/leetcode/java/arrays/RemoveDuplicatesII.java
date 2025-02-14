package com.leetcode.java.arrays;

import java.util.ArrayList;

public class RemoveDuplicatesII {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0)
        {
            return 0;
        }
        int index  = 1;
        for (int i = 1; i<nums.length; i++)
        {
            if (nums[i - 1] != nums[i])
            {
                nums[index] = nums[i];
                index += 1;
            }
        }
        return index;
    }
}

