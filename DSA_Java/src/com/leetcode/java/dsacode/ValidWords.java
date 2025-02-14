package com.leetcode.java.dsacode;

public class ValidWords {
    public static void main(String[] args) {
        String sentence = "cat and  dog";
        System.out.println(countValidWords(sentence));
    }
    public static   int countValidWords(String sentence) {
        int res = 0;
        String[] str = sentence.split(" ");
        for (int i = 0; i < str.length; i++) {
            char chars[] = str[i].toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == '!' || chars[j] == '-' || chars[j] == '.' || chars[j] == '!'
                        || chars[j] == '!' ||  chars[j] == '!' || chars[j] == '!'   ){

                }
            }
        }
        return  res;
    }
}
