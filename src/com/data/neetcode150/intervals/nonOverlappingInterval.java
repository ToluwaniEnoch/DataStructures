package com.data.neetcode150.intervals;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class nonOverlappingInterval {
    public static void main(String[] args) {
        int[][] intervals = {{1,2}, {2,3}, {3,4}, {1,3} };
        System.out.println(eraseOverlapIntervals(intervals));
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', map.getOrDefault('a', 0) + 1);
    }

    public static int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length <2) return 0;

        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));

        int result = 0;
        int[] first = intervals[0];

        for(int k=1; k<intervals.length; k++){
            if(first[1] > intervals[k][0] ){
                result += 1;
                if(first[1] > intervals[k][1]){
                    first = intervals[k];
                }
            }else{
                first = intervals[k];
            }
        }

        return result;
    }
}
