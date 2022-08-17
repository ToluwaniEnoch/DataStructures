package com.data.neetcode150.graph;

import java.util.*;

public class NetworkDelayTime {
    public static void main(String[] args) {
        int[][] times = new int[][]{{1,2,1},{2,3,2},{1,3,4}};
        System.out.println(networkDelayTime(times, 3, 1));
    }
    public static int networkDelayTime(int[][] times, int n, int k) {
        // using Djistra's algorithm

        Map<Integer, List<int[]>> map = new HashMap<>();
        for(int i=1; i<=n; i++){
            List<int[]> cur = new ArrayList<>();
            map.put(i, cur);
        }
        for(int[] time: times){
            int source = time[0];
            int target = time[1];
            int weight = time[2];
            int[] current = new int[]{target, weight};
            List<int[]> value = map.get(source);
            value.add(current);
            map.put(source, value);
        }

        Set<Integer> visited = new HashSet<>();
        // minheap to sort the pq by weight. returns node with minimum weight
        Queue<int[]> minheap = new PriorityQueue<>((a,b) -> a[1] - b[1]);
        minheap.add(new int[]{k, 0});
        int time = 0;

        while(!minheap.isEmpty()){
            int[] current = minheap.remove();
            if(visited.contains(current[0])) continue;
            visited.add(current[0]);
            time = Math.max(time, current[1]);

            List<int[]> edges = map.get(current[0]);
            for(int[] edge : edges){
                if(!visited.contains(edge[0])){
                    // time/weight for current edge is the time/weight of the previous
                    // plus its own time/weight
                    edge[1] = edge[1] + current[1];
                    minheap.add(edge);
                }
            }

        }
        return visited.size() == n ? time : -1;
    }
}
