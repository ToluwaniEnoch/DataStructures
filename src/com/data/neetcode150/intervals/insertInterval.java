package com.data.neetcode150.intervals;

import java.util.ArrayList;
import java.util.List;

public class insertInterval {
    public static void main(String[] args) {
        int[][] intervals = {{1,3}, {6,9}};
        int[] newInterval = {2,5};
        System.out.println(insert(intervals, newInterval));
    }
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> combined = new ArrayList<>();
        for(int[] interval : intervals){
            combined.add(interval);
        }
        combined.add(newInterval);

        combined.sort((arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));

        List<int[]> result = new ArrayList<>();
        int[] first = combined.get(0);
        result.add(first);

        for(int[] num : combined){
            int currentBegin = first[0];
            int currentEnd = first[1];
            int nextBegin = num[0];
            int nextEnd = num[1];

            if(currentEnd >= nextBegin){
                first[1] = Math.max(currentEnd, nextEnd);
            }else{
                first = num;
                result.add(first);
            }
        }


        return result.toArray(new int[result.size()][2]);
    }
}
