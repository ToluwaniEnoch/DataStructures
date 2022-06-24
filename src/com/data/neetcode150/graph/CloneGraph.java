package com.data.neetcode150.graph;

import java.util.*;

public class CloneGraph {
    public static void main(String[] args) {
        GNode node = new GNode(3);
        System.out.println(cloneGraphs(node));
        Map<Integer, List<Integer>> map = new HashMap<>();
    }

    private static GNode cloneGraphs(GNode node) {
        Map<GNode, GNode> map = new HashMap<>();
        Queue<GNode> queue = new LinkedList<>();

        if(node == null) return node;
        GNode head = new GNode(node.val, new ArrayList<>());
        map.put(node, head);

        queue.add(node);
        while(!queue.isEmpty()){
            GNode temp = queue.remove();

            for(GNode n : temp.neighbors){
                if(!map.containsKey(n)){
                    GNode newNode = new GNode(n.val, new ArrayList<>());
                    map.put(n, newNode);
                    queue.add(n);
                }
                map.get(temp).neighbors.add(map.get(n));

            }

        }


        return head;
    }
}
