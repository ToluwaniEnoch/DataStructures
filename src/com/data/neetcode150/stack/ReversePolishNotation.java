package com.data.neetcode150.stack;

import java.util.Stack;

public class ReversePolishNotation {
    public static void main(String[] args) {
        String[] tokens = {"2","1","+","3","*"};
        //String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(evaluateReversePolishNotation(tokens));
        System.out.println(evaluateReversePolishNotation2(tokens));
    }

    private static int evaluateReversePolishNotation2(String[] tokens) {
        if(tokens.length < 3) return 0;
        Stack<Integer> stack = new Stack();

        for(String c : tokens){
            boolean isDigit = false;
            try{
                Integer.parseInt(c);
                isDigit = true;
            }catch(Exception e){

            }

            if(isDigit){
                stack.push(Integer.parseInt(c));
            }else if(c == "+"){
                int first = stack.pop();
                int second = stack.pop();
                stack.push(first + second);
            }else if(c == "*"){
                int first = stack.pop();
                int second = stack.pop();
                stack.push(first * second);
            }else if(c == "-"){
                int first = stack.pop();
                int second = stack.pop();
                stack.push(second - first);
            }else if(c == "/"){
                int first = stack.pop();
                int second = stack.pop();
                stack.push(second / first);
            }
        }
        return stack.pop();
    }

    private static int evaluateReversePolishNotation(String[] tokens) {
        if(tokens.length <3) return 0;
        Stack<String> stack = new Stack<>();

        for(int i=0; i< tokens.length; i++){
            boolean digit = false;
            try{
                Integer.parseInt(tokens[i]);
                digit = true;
            }catch(Exception e){

            }
            //boolean digit = Character.isDigit(tokens[i].charAt(0));
            if(digit){
                stack.push(tokens[i]);
            }else if(tokens[i] == "+"){
                String top = stack.pop();
                String top2 = stack.pop();
                stack.push(String.valueOf(Integer.parseInt(top2) + Integer.parseInt(top)));
            }else if(tokens[i] == "-"){
                String top = stack.pop();
                String top2 = stack.pop();
                stack.push(String.valueOf(Integer.parseInt(top2) - Integer.parseInt(top)));
            }else if(tokens[i] == "*"){
                String top = stack.pop();
                String top2 = stack.pop();
                stack.push(String.valueOf(Integer.parseInt(top2) * Integer.parseInt(top)));
            }else if(tokens[i] == "/"){
                String top = stack.pop();
                String top2 = stack.pop();
                stack.push(String.valueOf(Integer.parseInt(top2) / Integer.parseInt(top)));
            }

        }
        return Integer.parseInt(stack.pop());
    }
}
