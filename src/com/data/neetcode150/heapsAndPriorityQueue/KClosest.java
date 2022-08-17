package com.data.neetcode150.heapsAndPriorityQueue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class KClosest {
    public static void main(String[] args) {
        int[][] points =new int[][] {{3,3},{5,-1},{-2,4}};
        System.out.println(kClosest(points, 2));
    }

    public static int[][] kClosest(int[][] points, int k) {
        if(points.length < 1) return points;
        Map<Double, int[]> map = new HashMap<>();
        int[][] result = new int[k][];

        PriorityQueue<Double> pq = new PriorityQueue();

        for(int[] nums : points){
            int a = nums[0];
            int b = nums[1];
            double res = Math.sqrt(a * a + b * b);
            pq.add(res);
            int[] arr = new int[]{a,b};
            map.put(res, arr);
        }

        int i=0;
        while(i < k){
            result[i] =  map.get(pq.poll());
            k--;

        }

        for(int[] n : result){
            System.out.println("nums are : " + n[0] + " and " + n[1]);
        }
        return result;
    }
}
