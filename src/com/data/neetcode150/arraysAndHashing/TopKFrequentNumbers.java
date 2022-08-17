package com.data.neetcode150.arraysAndHashing;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TopKFrequentNumbers {
    public static void main(String[] args) {

    }

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[k];

        for(int num : nums){
            map.merge(num, 1, Integer::sum);
        }

        while(k > 0){
            result[k-1] = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
            map.remove(result[k-1]);
            k--;
        }
        return result;
    }
}
