package com.data.neetcode150.dp;

import java.util.HashMap;
import java.util.Map;

public class uniquePaths {
    public static void main(String[] args) {
        System.out.println(paths(23,18));
    }
    public static int paths(int m, int n) {
        int[][] memo = new int[m][n];
        return getPaths(m,n,memo);

    }

    public static int getPaths(int m, int n, int[][] memo) {
        if (memo[m-1][n-1] != 0) return memo[m-1][n-1];

        if (m == 0 || n == 0) return 0;
        if (m == 1 && n == 1) return 1;

        memo[m-1][n-1] = getPaths(m-1, n, memo) + getPaths(m, n-1, memo);
        return memo[m-1][n-1];

    }
}
