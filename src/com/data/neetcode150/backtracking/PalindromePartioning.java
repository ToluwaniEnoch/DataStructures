package com.data.neetcode150.backtracking;
import java.util.ArrayList;
import java.util.List;
public class PalindromePartioning {
    public static void main(String[] args) {
        System.out.println("hello".substring(0,0));

    }

    /*public static List<List<String>> partition(String s){
        List<List<String>> result = new ArrayList<>();
        List<String> current = new ArrayList<>();

        for(int i=0; i<s.length(); i++){
            createPartition(s, current, result, 0, 1);
        }

    }*/

    public static void createPartition(String s, List<String> current, List<List<String>> result, int index, int length){


        s.substring(index, index+length);
    }
}
