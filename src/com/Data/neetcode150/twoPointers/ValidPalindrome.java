package com.Data.neetcode150.twoPointers;


public class ValidPalindrome {
    public static boolean isPalindromeV2(String s){
        StringBuilder content = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                content.append(s.charAt(i));
            }
        }
        content = new StringBuilder(content.toString().toLowerCase().replace(" ",""));
        String value = content.toString();

        String reverse = content.reverse().toString();
        System.out.println(reverse);
        System.out.println(value);

        if(value.equals(reverse)){
            return true;
        }
        return false;


    }

    public static boolean isPalindrome(String s) {
        if(s.equals(" ")) return true;
        String lower = s.toLowerCase();
        String mushedUpWord = "";

        for(int i=0; i<lower.length(); i++){
            if(Character.isLetterOrDigit(lower.charAt(i))){
                mushedUpWord += lower.charAt(i);
            }
        }

        String reversedWord = "";
        for(int i=mushedUpWord.length()-1; i>=0; i--){
            reversedWord += mushedUpWord.charAt(i);
        }

        if(mushedUpWord.equals(reversedWord)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindromeV2("race a car"));
    }
}
