package com.data.dynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class canSum {
    public static void main(String[] args) {
        int[] numbers = new int[] {5,3,7,4};
        int[] numbers2 = new int[] {7, 14};
        System.out.println(canSumMemo(numbers, 7));
        System.out.println(canSumMemo(numbers2, 300));

        System.out.println(canSumTable(numbers, 7));
        System.out.println(canSumTable(numbers2, 300));
    }

    public static boolean canSumMemo(int[] numbers, int target){
        Map<Integer, Boolean> memo = new HashMap<>();
        return canSumCheck(numbers, target, memo);
    }

    private static boolean canSumCheck(int[] numbers, int target, Map<Integer, Boolean> memo) {
        if(memo.containsKey(target)) return memo.get(target);
        if(target == 0) return true;
        if(target < 0) return false;

        for(int num : numbers){
            int remainder = target - num;
            boolean canSum = canSumCheck(numbers, remainder, memo);
            memo.put(remainder, canSum);
            if( canSum ) return true;
        }
        return false;
    }

    public static boolean canSumTable(int[] numbers, int target) {
        boolean[] table = new boolean[target+1];
        table[0] = true;

        for(int i=0; i<=target; i++){
            if(table[i] == true) {
                for(int num : numbers){
                    if(i+num <= target) table[i+num] = true;
                }
            }
        }

        return table[target];
    }
}
