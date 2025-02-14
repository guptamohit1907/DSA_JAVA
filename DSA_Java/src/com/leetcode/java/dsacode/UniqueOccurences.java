package com.leetcode.java.dsacode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueOccurences {
    public static void main(String[] args) {
        int [] arr = {1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(arr));
    }

    static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        Set<Integer> freqSet = new HashSet<>(freq.values());
        return freq.size() == freqSet.size();
    }
}
