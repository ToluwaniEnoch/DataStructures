package com.data.neetcode150.heapsAndPriorityQueue;

import java.util.PriorityQueue;

class KthLargest {

    final PriorityQueue<Integer> pq = new PriorityQueue<>();
    final int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        for(int num : nums) add(num);
    }

    public int add(int val) {
        if(pq.size() < k) pq.offer(val);
        else if(val > pq.peek() ){
            pq.poll();
            pq.add(val);
        }
        return pq.peek();

    }
}
