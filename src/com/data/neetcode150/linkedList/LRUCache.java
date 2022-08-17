package com.data.neetcode150.linkedList;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    private int cap;
    private Node left;
    private Node right;
    private Map<Integer, Node> map;

    /*public LRUCache(int capacity) {
        this.cap = capacity;
        map = new HashMap<>();

        this.left = new Node(0, 0);
        this.right = new Node(0, 0);

        left.next = right;
        right.previous = left;
        right.next = null;
        left.previous = null;
    }

    public int get(int key) {
        if(map.containsKey(key)) {
            Node node = map.get(key);
            //mark node as LRU
            remove(node);
            insert(node);
            return node.value;
        }
        else{return -1; }
    }

    public static void insert(Node node){
        Node previousNode = this.right.previous;

        node.next = this.right;
        node.previous = previousNode;
    }

    public static void remove(Node node){
        Node nextNode = node.next;
        Node previousNode = node.previous;

        previousNode.next = nextNode;
        nextNode.previous = previous;
    }

    public void put(int key, int value) {
        if(map.contains(key)){
            map.remove(key);
        }
        Node node = new Node(key, value);
        remove(node);
        insert(node);
        map.put(key, node);

        if(map.size() > this.cap){
            Node toRemove = left.next;
            remove(toRemove);
            map.remove(toRemove.key);
        }
    }*/
}

//class Node{
//    Node next;
//    Node previous;
//    int key;
//    int value;
//
//    public Node(int key, int value){
//        this.key = key;
//        this.value = value;
//    }
//}
