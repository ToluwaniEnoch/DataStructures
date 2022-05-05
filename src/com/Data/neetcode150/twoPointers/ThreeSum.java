package com.Data.neetcode150.twoPointers;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = new int[] { -1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }

    private static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Set total = new HashSet();
        int length = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i< length -2; i++){
            int target = 0 - nums[i];
            int right = length -1;
            int left = i+1;

            while (left < right){
                int currentSum = nums[left] + nums[right];
                if( currentSum == target){
                    List<Integer> found = new ArrayList<>(List.of(nums[i], nums[left], nums[right]));
                    total.add(found);
                    right--;
                    left++;
                }
                if(currentSum < target){
                    left++;
                }if(currentSum > target){
                    right--;
                }

            }

        }

        result.addAll(total);
        return result;
    }
}
