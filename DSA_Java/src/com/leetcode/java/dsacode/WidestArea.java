package com.leetcode.java.dsacode;

import java.util.Arrays;

public class WidestArea {
    public static void main(String[] args) {
        int[][] points = {
                {1,0},
                {1,4},
                {3,1},
                {5,3},
                {8,8},
                {9,0},
        };
        System.out.println(maxWidthOfVerticalArea(points));
    }

    //[7,4],[8,7],[9,7],[9,9]]
    //[[1,0],[1,4],[3,1],[5,3],[8,8],[9,0]]

    static int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, (p1, p2)->(p1[0]-p2[0]));
        int maxWidth = 0, sz = points.length;
        for(int indx = 0; indx < sz-1; indx++){
            int [] point1 = points[indx], point2 = points[indx+1];
            maxWidth = Math.max(maxWidth, point2[0] - point1[0]);
        }
        return maxWidth;
    }
}
