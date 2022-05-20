package com.data.neetcode150.linkedList;

public class LinkedListCycle {
    public static void main(String[] args) {
        ListNode head = new ListNode();
        System.out.println(hasCycle(head));
    }

    private static boolean hasCycle(ListNode head) {
        boolean result = false;
        ListNode fast = head;
        ListNode slow = head;

        while(fast !=null && fast.next !=null){

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }

        return result;
    }
}
