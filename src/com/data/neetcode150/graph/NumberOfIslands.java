package com.data.neetcode150.graph;

import java.util.*;

public class NumberOfIslands {
    public static void main(String[] args) {
        char[][] grid = {{'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};

        char[][] grid2 = {{'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}};
        System.out.println(noOfIsland(grid));
        System.out.println(noOfIsland(grid2));

        List<Integer> num = Arrays.asList(1,3);

        Queue<List<Integer>> queue = new LinkedList<>();
        List<Integer> remove = queue.remove();
        remove.get(0);
    }

    private static int noOfIsland(char[][] grid) {
        Set<List<Integer>> visited = new HashSet<>();
        int islands = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                //dfs tranversal
                if(grid[i][j] == '1' && !visited.contains(Arrays.asList(i,j))){
                    islands++;
                    explore(grid, i, j, visited);
                }

            }
        }
        return islands;
    }

    private static void explore(char[][] grid, int i, int j, Set<List<Integer>> visited) {
        boolean rowInbounds = i >= 0 && i < grid.length;
        boolean colInbounds = j >= 0 && j < grid[0].length;
        if(!rowInbounds || !colInbounds) return;
        if(grid[i][j] == '0') return;

        List<Integer> position = new ArrayList<>();
        position.add(i);
        position.add(j);

        if(visited.contains(position)){
            return;
        }
        visited.add(position);

        explore(grid, i-1, j, visited);
        explore(grid, i, j+1, visited);
        explore(grid, i+1, j, visited);
        explore(grid, i, j-1, visited);
    }
}
