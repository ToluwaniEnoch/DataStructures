package com.data.neetcode150.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class mergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,4}, {0,2}, {3,5}};
        System.out.println(mergeInterval(intervals));
    }

    private static int[][] mergeInterval(int[][] intervals) {
        if(intervals.length <2) return intervals;

        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
        List<int[]> output = new ArrayList<>();
        int[] current_interval = intervals[0];
        output.add(current_interval);

        //output.sort((arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));

        for(int[] interval : intervals){
            int currentBegin = current_interval[0];
            int currentEnd = current_interval[1];
            int nextBegin = interval[0];
            int nextEnd = interval[1];

            if(currentEnd >= nextBegin){
                current_interval[1] = Math.max(currentEnd, nextEnd);
            }else{
                current_interval = interval;
                output.add(current_interval);
            }
        }

        return output.toArray(new int[output.size()][2]);


    }
}
