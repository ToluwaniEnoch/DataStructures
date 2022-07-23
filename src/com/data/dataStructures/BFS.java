package com.data.dataStructures;

import com.data.neetcode150.graph.GNode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BFS {
    public static void main(String[] args) {
        runBfs(new GNode());
    }

    private static void runBfs(GNode node) {
        if(node == null) return;

        Queue<GNode> queue = new LinkedList<>();
        Set<GNode> visited = new HashSet<>();
        queue.add(node);

        while(queue.size() != 0){
            GNode poll = queue.poll();
            visited.add(poll);
            System.out.println(poll.val);

            for(GNode neighbour : poll.neighbors){
                if(!visited.contains(neighbour)){
                    queue.add(neighbour);
                }
            }

        }
    }
}
