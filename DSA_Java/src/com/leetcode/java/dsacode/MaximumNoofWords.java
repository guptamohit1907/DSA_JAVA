package com.leetcode.java.dsacode;

public class MaximumNoofWords {
    public static void main(String[] args) {
        String[] sentences = {"please wait", "continue to fight", "continue to win"};
        System.out.println(mostWordsFound(sentences));
    }
    public static int mostWordsFound(String[] sentences) {
        int res = 0;
        for (int i = 0; i < sentences.length; i++) {
            String[] str = sentences[i].split(" ");
            if (res < str.length){
                res = str.length;
            }
        }
        return  res;
    }
}
