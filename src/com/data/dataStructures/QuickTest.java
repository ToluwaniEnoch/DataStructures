package com.data.dataStructures;

import java.util.*;

public class QuickTest {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(permute(nums));
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        for(int i = 0; i< nums.length; i++){
            current.add(nums[i]);
            generate(nums, result, new ArrayList<>(current), i);
        }
        return result;
    }

    public static void generate(int[] nums, List<List<Integer>> result, List<Integer> current, int index){
        var temp = new ArrayList<>(current);

        for(int i = 0; i< nums.length; i++){

            if(i != index){
                temp.add(nums[i]);
            }
        }
        result.add(new ArrayList<>(temp));
        generate(nums, result, new ArrayList<>(current), index);
    }

}
