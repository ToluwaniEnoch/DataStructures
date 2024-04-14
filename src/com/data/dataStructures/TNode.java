package com.data.dataStructures;

import com.data.neetcode150.graph.GNode;

import java.util.ArrayList;
import java.util.List;

public class TNode {
    Integer key;
    List<TNode> neighbors;
    List<Integer> distances;

    public TNode() {
        key = 0;
        neighbors = new ArrayList<TNode>();
    }
    public TNode(int _val) {
        key = _val;
        neighbors = new ArrayList<TNode>();
    }
    public TNode(int _val, ArrayList<TNode> _neighbors) {
        key = _val;
        neighbors = _neighbors;
    }
}
