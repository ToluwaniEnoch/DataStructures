package com.data.neetcode150.arraysAndHashing;

import java.util.HashSet;
import java.util.Set;

class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> numbers = new HashSet<>();

        for(int num : nums){
            if(numbers.contains(num)){
                return true;
            }
            numbers.add(num);
        }
        return false;
    }

    public static void main(String[] args){
        int[] nums = new int[] {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
}
