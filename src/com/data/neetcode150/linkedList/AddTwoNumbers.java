package com.data.neetcode150.linkedList;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode first = new ListNode(2);
        first.next = new ListNode(4);
        ListNode second = new ListNode(3);
        second.next = new ListNode(5);
        System.out.println(addnumbers(first, second).val);
    }

    private static ListNode addnumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode current = dummy;

        int carry = 0;

        while(l1 != null || l2 != null || carry > 0){

            int v1 = l1 == null ? 0 : l1.val;
            int v2 = l2 == null ? 0 : l2.val;

            int sum = v1 + v2 + carry;
            carry = sum / 10;
            int remainder = sum % 10;
            current.next = new ListNode(remainder);

            current = current.next;
            if (l1 != null )  l1 = l1.next;
            if (l2 != null )  l2 = l2.next;

        }

        return dummy.next;
    }
}
