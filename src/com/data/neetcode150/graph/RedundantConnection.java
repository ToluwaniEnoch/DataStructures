package com.data.neetcode150.graph;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RedundantConnection {
    public static void main(String[] args) {
        int[][] edges = {{1,2},{1,3},{2,3}};
        int[][] edges2 = {{1,2},{2,3},{3,4},{1,4},{1,5}};
        System.out.println(findRedundantConnection(edges));
        System.out.println(findRedundantConnection(edges2));

        int[] nums = {1,2,3,3,2};
        int x1 = nums[0];
        for (int i = 1; i < nums.length; i++) {
            x1 = x1 ^ nums[i];
            System.out.println(x1);

        }
        System.out.println(x1);
    }

    public static int[] findRedundantConnection(int[][] edges) {
        int[] result = new int[]{0,0};
        // using union find
        int[] parent = new int[edges.length + 1];
        for(int i=0; i<parent.length; i++){
            parent[i] = i;
        }

        int[] rank = new int[edges.length + 1];
        Arrays.fill(rank, 1);

        for(int[] edge : edges){
            if (!union(edge[0], edge[1], rank, parent)) result = edge;
        }
        return result;
    }

    private static int find(int n, int[] parent){
        int p = parent[n];
        while(p != parent[p]){
            parent[p] = parent[parent[p]];
            p = parent[p];
        }
        return p;
    }

    private static boolean union(int n1, int n2, int[] rank, int[] parent){
        int p1 = find(n1, parent);
        int p2 = find(n2, parent);

        if(p1 == p2) return false;

        if(rank[p1] > rank[p2]){
            parent[p2] = p1;
            rank[p1] += rank[p1];
        }else{
            parent[p1] = p2;
            rank[p2] += rank[p2];
        }
        return true;

    }
}
