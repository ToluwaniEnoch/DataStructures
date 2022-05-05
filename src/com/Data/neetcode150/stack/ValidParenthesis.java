package com.Data.neetcode150.stack;

import java.util.ArrayList;
import java.util.Stack;
import java.util.List;

public class ValidParenthesis {
    public static void main(String[] args) {
       // System.out.println(isValidParenthesis("()[]{}"));
        System.out.println(isValidParenthesis("([}}])"));
       // System.out.println(isValidParenthesis("(]"));
    }

    private static boolean isValidParenthesis(String input) {
        Stack<Character> stack = new Stack();
        if(input.length()<2) return false;
        for(char c : input.toCharArray()){
            if(c == '{' || c== '[' || c == '('){
                stack.push(c);
            }else if(c == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }else if(c == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }else if(c == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }else return false;
        }
        return stack.isEmpty();
    }
}
