package com.leetcode.java.dsacode;

public class EqualPairs {
    public static void main(String[] args) {
        int[][] grid = {{3,2,1},{1,7,6},{2,7,7}};
        System.out.println(equalPairs(grid));
    }

    static int equalPairs(int[][] grid) {
        int count = 0, n = grid.length;
        for (int r = 0; r < n; ++r) {
            for (int c = 0; c < n; ++c) {
                boolean match = true;
                for (int i = 0; i < n; ++i) {
                    if (grid[r][i] != grid[i][c]) {
                        match = false;
                        break;
                    }
                }
                count += match ? 1 : 0;
            }
        }
        return count;
    }
}
