package com.data.neetcode150.arraysAndHashing;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {1,2,7,4,8,3};
        System.out.println(getLongestConsecutiveSequence(nums));
    }

    private static int getLongestConsecutiveSequence(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int num : nums){
            numSet.add(num);
        }


        int maxCount = 0;

        for(int num : nums){
            if(!numSet.contains(num-1)){
                int count = 0;
                while(numSet.contains(num)){
                    count += 1;
                    num++;
                }
                maxCount = Math.max(count, maxCount);
            }
        }

        return maxCount;
    }
}
