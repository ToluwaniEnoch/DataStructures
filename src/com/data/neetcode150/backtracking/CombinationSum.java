package com.data.neetcode150.backtracking;

import java.util.*;
import java.util.stream.Collectors;

public class CombinationSum {
    public static void main(String[] args) {
        int[] nums = {2,3,6,7};
        System.out.println(combinationSum(nums, 7));
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target){
        Set<List<Integer>> result = new HashSet<>();
        List<Integer> current = new ArrayList<>();

        Arrays.sort(candidates);
        return findCombinations(candidates, target, 0, 0, result, current);
    }

    private static List<List<Integer>> findCombinations(int[] candidates, int target, int sum, int index, Set<List<Integer>> result,
                                                        List<Integer> current){
        if(sum == target){
            result.add(new ArrayList<>(current));
        }
        if(index >= candidates.length || sum > target) return result.stream().collect(Collectors.toList());

        current.add(candidates[index]);
        findCombinations(candidates, target, sum + candidates[index], index, result, current);

        current.remove(current.size()-1);
        findCombinations(candidates, target, sum, index+1, result, current);

        return result.stream().collect(Collectors.toList());
    }
}
