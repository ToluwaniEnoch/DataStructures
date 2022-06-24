package com.data.neetcode150.graph;

import java.util.HashMap;
import java.util.Map;

public class RedundantConnection {
    public static void main(String[] args) {
      /*  int[][] edges = {{1,2},{1,3},{2,3}};
        int[][] edges2 = {{1,2},{2,3},{3,4},{1,4},{1,5}};
        System.out.println(findRedundantConnection(edges));
        System.out.println(findRedundantConnection(edges2));*/

        int[] nums = {1,2,3,3,2};
        int x1 = nums[0];
        for (int i = 1; i < nums.length; i++) {
            x1 = x1 ^ nums[i];
            System.out.println(x1);

        }
        System.out.println(x1);
    }

    private static int[] findRedundantConnection(int[][] edges) {
       return new int[]{};
    }
}
