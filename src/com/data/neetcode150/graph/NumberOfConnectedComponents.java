package com.data.neetcode150.graph;

import java.util.Arrays;

public class NumberOfConnectedComponents {
    public static void main(String[] args) {

    }

    public static int numberOfConnectedComponentsInGraph(int n, int[][] edges){
        int result = n;
        // using union find
        int[] parent = new int[edges.length + 1];
        for(int i=0; i<parent.length; i++){
            parent[i] = i;
        }

        int[] rank = new int[edges.length + 1];
        Arrays.fill(rank, 1);

        for(int[] edge : edges){
            if (!union(edge[0], edge[1], rank, parent)) result--;
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
