package com.data.dynamicProgramming;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class gridTraveller {
    public static void main(String[] args) {
//        System.out.println(gridTravellerWithMemoization(1,1));
//        System.out.println(gridTravellerWithMemoization(2,3));
//        System.out.println(gridTravellerWithMemoization(3,2));
//        System.out.println(gridTravellerWithMemoization(3,3));
//        System.out.println(gridTravellerWithMemoization(18, 18));

        System.out.println(gridTravellerWithTabulization(3,2));
        System.out.println(gridTravellerWithTabulization(18,18));
    }
    public static long gridTravellerWithMemoization(int row, int col){
        Map<String, Long> memo = new HashMap<>();
        return gridTravel(row, col, memo);
    }

    private static long gridTravel(int row, int col, Map<String, Long> memo) {
        String key = row + "," + col;
        if(memo.containsKey(key)) return memo.get(key);
        if(row == 0 || col == 0) return 0;
        if(row == 1 && col == 1) return 1;

        long res = gridTravel(row - 1, col, memo) + gridTravel(row, col - 1, memo);
        memo.put(key, res);
        return memo.get(key);

    }

    public static long gridTravellerWithTabulization(int row, int col){
        long[][] table = new long[row+1][col+1];
        table[1][1] = 1;
        for(int i=0; i<= row; i++){
            for(int j=0; j<= col; j++){
                if(i+1 <= row) table[i+1][j] += table[i][j];
                if(j+1 <= col) table[i][j+1] += table[i][j];
            }
        }

        return table[row][col];
    }
}
