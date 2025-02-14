package com.leetcode.java.dsacode;

import java.util.*;

public class DifferenceArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3} , nums2 = {2,4,6};
        System.out.println(findDifference(nums1,nums2));
    }

    static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        return Arrays.asList(getElementsOnlyInFirstList(nums1, nums2), getElementsOnlyInFirstList(nums2, nums1));
    }
    static List<Integer> getElementsOnlyInFirstList(int[] nums1, int[] nums2) {
        Set<Integer> onlyInNums1 = new HashSet<> ();
        for (int num : nums1) {
            boolean existInNums2 = false;
            for (int x : nums2) {
                if (x == num) {
                    existInNums2 = true;
                    break;
                }
            }
            if (!existInNums2) {
                onlyInNums1.add(num);
            }
        }
        return new ArrayList<>(onlyInNums1);
    }
}
