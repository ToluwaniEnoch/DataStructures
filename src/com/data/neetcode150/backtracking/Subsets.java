package com.data.neetcode150.backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Subsets {
    static List<List<Integer>> result = new ArrayList<>();
    static int[] numbers;
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        //System.out.println(returnSubsets(nums));
        System.out.println(subsets(nums));
    }

    public static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        permute(0, nums, current, answer);
        return answer;
    }

    public static void permute(int index, int[] nums, List<Integer> current, List<List<Integer>> answer){
        if(index >= nums.length) {
            answer.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[index]);
        permute(index+1, nums, current, answer);
        current.remove(current.size()-1);
        permute(index+1, nums, current, answer);
    }





    public static List<List<Integer>> returnSubsets(int[] nums) {
        //result.clear();
        numbers = nums;
        result.add(new ArrayList<>());
        for(int i=0; i<nums.length; i++){
            recurse(new ArrayList<>(), i);
        }

        return result;
    }

    public static void recurse(List<Integer> current, int nextIndex){
        if(nextIndex > numbers.length) return;

        current.add(numbers[nextIndex]);
        addToAnswer(current);
        for(int i=nextIndex+1; i<numbers.length; i++){
            recurse(new ArrayList<>(current), i);
        }
    }

    private static void addToAnswer(List<Integer> current) {
        result.add(current);

    }
}
