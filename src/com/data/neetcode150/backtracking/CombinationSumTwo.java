package com.data.neetcode150.backtracking;
import java.util.*;
import java.util.stream.Collectors;

public class CombinationSumTwo {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        System.out.println(combinationSumTwo(nums, 30));
    }
    public static List<List<Integer>> combinationSumTwo ( int[] candidates, int target){
        Set<List<Integer>> result = new HashSet<>();
        List<Integer> current = new ArrayList<>();
        Arrays.sort(candidates);

        findCombination(candidates, 0, target, result, current, 0);
        return result.stream().collect(Collectors.toList());
    }

    public static void findCombination(int[] candidates, int index, int target, Set<List<Integer>> result,
                                       List<Integer> current, int runningSum){
        if(runningSum == target){
            result.add(new ArrayList<>(current));
            return;
        }

        if(runningSum > target || index > candidates.length-1) return;
        current.add(candidates[index]);
        findCombination(candidates, index+1, target, result, current, runningSum+candidates[index]);
        current.remove(current.size()-1);
        findCombination(candidates, index+1, target, result, current, runningSum);
    }
}
