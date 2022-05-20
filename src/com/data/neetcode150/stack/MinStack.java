package com.data.neetcode150.stack;

import java.util.Stack;

public class MinStack {
    public static void main(String[] args) {

    }

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int val) {
        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }
        stack.push(val);
    }

    public void pop() {
        if(minStack.peek().equals(stack.peek())){
            minStack.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
