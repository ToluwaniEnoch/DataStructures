package com.data.neetcode150.linkedList;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer {
    public static void main(String[] args) {
        Node head = new Node(2);
        System.out.println(copyList(head));
    }

    private static Node copyList(Node head) {
        Map<Node, Node> nodeMap = new HashMap();
        nodeMap.put(null, null);

        Node current = head;
        while(current != null){
            Node newNode = new Node(current.val);
            nodeMap.put(current, newNode);
            current = current.next;
        }

        current = head;
        while(current != null){
            Node copy = nodeMap.get(current);
            copy.next = nodeMap.get(current.next);
            copy.random = nodeMap.get(current.random);

            System.out.println(copy.next);

            current = current.next;
        }

        return nodeMap.get(head);
    }
}
