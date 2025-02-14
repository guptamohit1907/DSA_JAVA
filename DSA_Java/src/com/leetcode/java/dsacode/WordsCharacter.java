package com.leetcode.java.dsacode;

import java.util.ArrayList;
import java.util.List;

public class WordsCharacter {
    public static void main(String[] args) {
        String[] words = {"abc","bcd","aaaa","cbc"};
        char x1 = 'a';
        System.out.println(findWordsContaining(words,x1));
    }

     static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < words.length; i++) {
            char[] chars = words[i].toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == x){
                    res.add(i);
                    break;
                }
            }
        }
        return res;
    }
}
