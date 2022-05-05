package com.Data.dataStructures;
import java.util.*;
import java.util.Stack;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseSentence("My name is Neil"));
        System.out.println(reverseSentence("My, name is Neil"));
    }

    private static String reverseSentence(String s) {
        StringBuilder result = new StringBuilder();
        Stack<String> sd = new Stack<>();

        String a = "";
        int counter = 0;
        Map<Integer, Character> position = new HashMap<>();

        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                a += c;
            }else if (c == ' '){
                sd.push(a);
                a = "";

            }else if(c == '.' || c==','){
                counter++;
                position.put(counter, c);
            }
        }
        sd.push(a);

        int count = 0;
        while(!sd.isEmpty()){
            result.append(sd.pop());
            count++;
            if(position.size()>0 &&  position.containsKey(count)){
                result.append(position.get(count));
            }
            result.append(" ");
        }
        return result.toString();
    }
}
