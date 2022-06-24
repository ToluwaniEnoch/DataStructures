package com.data.neetcode150.graph;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MaxAreaIsland {
    public static void main(String[] args) {
        char[][] grid = {{'1','1','0','0','0'},
                        {'1','1','0','0','0'},
                        {'0','0','1','0','0'},
                        {'0','0','0','1','1'}};
        System.out.println(maxArea(grid));
    }

    private static int maxArea(char[][] grid) {
        int maxArea = 0;
        for(int i =0; i< grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == '1' ){
                    maxArea = Math.max(explore(grid, i, j), maxArea);
                }
            }
        }
        return maxArea;
    }

    private static int explore(char[][] grid, int i, int j) {

        boolean rowInbound = i >= 0 && i<grid.length;
        boolean colInbound = j >=0 && j<grid[0].length;

        if(!rowInbound || !colInbound) return 0;
        if(grid[i][j] == '0') {
            return 0;
        }
        int count = 1;
        grid[i][j] = '0';


        count += explore(grid, i+1, j);
        count += explore(grid, i-1, j);
        count += explore(grid, i, j+1);
        count += explore(grid, i, j-1);
        return count;

    }
}
