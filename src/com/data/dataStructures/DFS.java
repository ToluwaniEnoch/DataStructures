package com.data.dataStructures;

import com.data.neetcode150.graph.GNode;

import java.util.HashSet;
import java.util.Set;

public class DFS {
    public static void main(String[] args) {
        runDfs(new GNode(), new HashSet<GNode>());
    }

    private static void runDfs(GNode node, Set<GNode> visited) {
        if(node == null ) return;

        visited.add(node);
        while(node != null){
            for (GNode neighbor : node.neighbors) {
                if(!visited.contains(neighbor)){
                    System.out.println(neighbor.val);
                    runDfs(neighbor, visited);
                }

            }
        }
    }
}
