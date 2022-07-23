package com.data.dataStructures;

import java.util.*;

public class QuickTest {
    public static void main(String[] args) {
//        int[] nums = {1,2,3};
//        System.out.println(permute(nums));
        //Map<Integer, int[]> = new HashMap<>();
        //Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        set.clear();
        set.size();
        Map<String, List<String>> map = new HashMap<>();

//
//        PriorityQueue<Double> priorityQueue = new PriorityQueue<Double>();
        //tryHere();
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        mostCommonWord(paragraph, banned);
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        for(int i = 0; i< nums.length; i++){
            current.add(nums[i]);
            //generate(nums, result, new ArrayList<>(current), i);
        }
        return result;
    }

    public static void tryHere(){
        String paragraph = "ABCD";
        paragraph = paragraph.toLowerCase();
        System.out.println(paragraph);
    }

    public static void mostCommonWord(String paragraph, String[] banned) {
    }

}
/*
Return key by max element in map
Collections.max(map.entrySet(), map.Entry.comparingByValue()).getKey();
 */
