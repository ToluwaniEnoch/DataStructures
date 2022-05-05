package com.Data.dataStructures;

public class Stack {
    public static void main(String[] args) {
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        int i=1;
        while (i<6){
            stack.push(i);
            i++;
        }
        System.out.println("Original stack => " + stack);
        Integer peek = stack.peek();
        System.out.println("peeking at the top element currently " + peek);
        System.out.println("stack remains unchanged after peeking => " + stack);

        Integer pop = stack.pop();
        System.out.println("pop => " + pop);
        System.out.println("stack after popping" + stack);

        int search = stack.search(5);
        int search2 = stack.search(1);
        System.out.println("stack search returns distance from top(last element). -1 when element not found " + search);
        System.out.println("stack search returns distance from top(last element) " + search2);
        System.out.println("stack " + stack);
    }
}
