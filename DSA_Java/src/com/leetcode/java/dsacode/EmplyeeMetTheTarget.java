package com.leetcode.java.dsacode;

public class EmplyeeMetTheTarget {
    public static void main(String[] args) {
        int[] hours = {5,1,4,2,2};
        int target = 6;
        System.out.println(numberOfEmployeesWhoMetTarget(hours,target));
    }

    public  static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int res = 0;
        for (int i = 0; i < hours.length; i++) {
            if (hours[i] >= target){
                res ++;
            }
        }
        return res;
    }
}
