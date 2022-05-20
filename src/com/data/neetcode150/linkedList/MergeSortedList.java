package com.data.neetcode150.linkedList;

public class MergeSortedList {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(2);
        ListNode list2 = new ListNode(3);

        System.out.println(mergeList(list1, list2));
    }

    private static ListNode mergeList(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode result = dummy;


        while(list1 != null && list2 != null){
            if(list1.val <= list2.val ){
                dummy.next = list1;
                list1 = list1.next;
            }else if(list2.val > list1.val){
                dummy.next = list2;
                list2 = list2.next;
            }
            dummy = dummy.next;
        }
        if(list1 != null){
            dummy.next = list1;
        }else{
            dummy.next = list2;
        }
        return result.next;
    }
}
