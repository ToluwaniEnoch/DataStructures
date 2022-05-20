package com.data.neetcode150.linkedList;


public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode();
        System.out.println(reverseList(head));
    }

    public static ListNode reverseList(ListNode head){
        ListNode current = head;

        ListNode previous = null;
        ListNode next = null;

        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;

        }
        return previous;
    }

}


