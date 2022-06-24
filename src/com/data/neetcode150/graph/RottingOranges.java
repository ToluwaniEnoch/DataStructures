package com.data.neetcode150.graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class RottingOranges {
    public static void main(String[] args) {
        int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
        System.out.println(rottingOrange(grid));
    }

    private static int rottingOrange(int[][] grid) {
        Set<int[]> fresh = new HashSet<>();
        Set<int[]> rotten = new HashSet<>();

        for(int i=0; i<grid.length; i++){
            for (int j=0; j<grid[i].length; j++){
                int cell = grid[i][j];
                if(cell == 1){
                    fresh.add(new int[]{i,j});
                }else if(cell == 2){
                    rotten.add(new int[]{i,j});
                }
            }
        }

        int minutes = 0;
        int[][] directions = new int[][] {{0,1}, {1,0}, {-1,0}, {0,-1}};
        while(fresh.size() > 0){
            Set<int[]> infected = new HashSet<>();

            for(int[] pair : rotten){
                for(int[] direction : directions){
                    int[] newPair = new int[]{pair[0] + direction[0], pair[1] + direction[1]};
                    if(fresh.contains(newPair)){
                        fresh.remove(newPair);
                        infected.add(newPair);
                    }
                }
                if(infected.size() == 0){
                    return -1;
                }
                rotten = infected;
                minutes++;

            }

        }
        return (fresh.size() == 0) ? minutes : -1;


    }
}
