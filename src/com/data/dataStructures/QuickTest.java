package com.data.dataStructures;

import com.data.neetcode150.linkedList.ListNode;
import org.apache.commons.lang3.text.WordUtils;

import java.util.*;

public class QuickTest {
    public static void main(String[] args) {

        String s = WordUtils.capitalizeFully("DUDU-OSUN");
        System.out.println(s);

//        Queue<Integer> queue = new PriorityQueue<>();
//        queue.poll();
////        int[] nums = {1,2,3};
////        System.out.println(permute(nums));
//        //Map<Integer, int[]> = new HashMap<>();
//        //Map<Integer, Integer> map = new HashMap<>();
//        Set<Integer> set = new HashSet<>();
//        set.contains(1);
//        set.clear();
//        set.size();
//        Map<String, Integer> map = new HashMap<>();
//
//        map.put("q", 1);
//        map.put("3", 4);
//
//        Set<Map.Entry<String, Integer>> entries = map.entrySet();
//        map.containsKey("");
//        Collection<Integer> values = map.values();
//        String a = "";
//
//
//        char c = '0';
//        Character.isWhitespace(c);
//        Character.isLetterOrDigit(c);
//        int numericValue = Character.getNumericValue(c);
//        //
////        PriorityQueue<Double> priorityQueue = new PriorityQueue<Double>();
//        //tryHere();
//        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
//        String[] banned = {"hit"};
//        mostCommonWord(paragraph, banned);
//
//        Map<Integer, ListNode> nodeMap = new HashMap<>();
//
//        String key1 = Collections.min(map.entrySet(), Map.Entry.comparingByValue()).getKey();
//
//        //Return key by max element in map
//        String key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
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

