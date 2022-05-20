package com.data.neetcode150.slidingWindow;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingChar {
    public static void main(String[] args) {
        String s = "bbbbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    private static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int length = 0;
        int left = 0;
        int right = 0;

        HashSet<Character> hash = new HashSet<>();
        while(right < s.length()){

            if(hash.contains(s.charAt(right))){
                hash.remove(s.charAt(left));
                left++;
            }
            else{
                hash.add(s.charAt(right));
                right++;
            }
            maxLength = Math.max(right - left, maxLength);

        }
        return maxLength;
    }
}
