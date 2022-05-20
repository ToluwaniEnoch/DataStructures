package com.data;

import com.data.neetcode150.arraysAndHashing.ValidAnagram;

public class Main {

    public static void main(String[] args) {
//        int[] nums = new int[] {1,2,3,1};
//        boolean b = ContainsDuplicate.containsDuplicate(nums);
//        System.out.println(b);

        String s = "rat";
        String t = "car";
        boolean anagram = ValidAnagram.isAnagram(s, t);
        System.out.println(anagram);
    }
}
