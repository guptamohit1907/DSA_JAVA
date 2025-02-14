package com.leetcode.java.dsacode;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }
    static String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        String [] words = s.split("\\s+");
        for (int i = words.length - 1; i >=0 ; i--) {
            res.append(words[i]).append(" ");
        }
        return res.toString();
    }
}
