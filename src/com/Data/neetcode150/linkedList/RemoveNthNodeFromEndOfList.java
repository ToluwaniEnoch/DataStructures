package com.Data.neetcode150.linkedList;

public class RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        ListNode head = new ListNode();
        int n = 2;
        System.out.println(removeFromEnd(head, n));
    }

    private static ListNode removeFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode left = dummy;
        ListNode right = dummy;

        while(n>0 && right.next !=null){
            right = right.next;
            n--;
        }

        while(right.next != null){
            left = left.next;
            right = right.next;
        }

        left.next = left.next.next;
        return dummy.next;
    }
}
