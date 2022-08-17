package com.data.neetcode150.heapsAndPriorityQueue;

import com.data.neetcode150.trees.TreeNode;

import java.util.*;


public class basics {
    public static void main(String[] args) {
        //PriorityQueue<Integer> asc = new PriorityQueue<>((a, b) -> a > b ? -1 : 1);
        PriorityQueue<Integer> asc = new PriorityQueue<>();
        PriorityQueue<Integer> desc = new PriorityQueue<>((a, b) -> a > b ? 1 : -1);
        PriorityQueue<Integer> desc2 = new PriorityQueue<>((a, b) -> b - a);
        Queue<int[]> minheap = new PriorityQueue<>((a,b) -> a[1] - b[1]);

        //also possible to use linkedlist as a queue
        Queue<TreeNode> queue = new LinkedList<>();

        asc.add(10);
        asc.add(20);
        asc.add(30);

        Integer peek1 = asc.peek();
        Map<Double, int[]> map = new HashMap<>();

        desc.add(10);
        desc.add(15);
        desc.add(20);
        desc.offer(30);
        Integer peek = desc.peek();
        desc.poll();
        int size = desc.size();



    }
}
