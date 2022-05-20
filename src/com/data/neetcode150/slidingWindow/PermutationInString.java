package com.data.neetcode150.slidingWindow;

import java.util.Hashtable;

public class PermutationInString {
    public static void main(String[] args) {

        //System.out.println(permutationInString("ab", "eidbaoo"));
        System.out.println(permutationInString("adc", "dcda"));
    }

    private static boolean permutationInString(String first, String second) {
        if(first.length() > second.length()) return false;

        Hashtable<Character, Integer> mapOne = new Hashtable<>();
        Hashtable<Character, Integer> mapTwo = new Hashtable<>();

        for(int c = 0; c < first.length(); c++){
            mapOne.merge(first.charAt(c), 1, Integer::sum);
        }

        int n = first.length();
        int left = 0;
        for(int i=0; i < second.length(); i++){

            if(!mapTwo.containsKey(second.charAt(i))){
                mapTwo.put(second.charAt(i), 1);
            }
            else{
                mapTwo.merge(second.charAt(i), 1, Integer::sum);
            }

            if(i-left == n) {
                Integer val = mapTwo.get(second.charAt(left));
                if (val <= 1){
                    mapTwo.remove(second.charAt(left));
                }else{
                    mapTwo.put(second.charAt(left), val - 1);
                }
                left++;
            }

            if(mapOne.equals(mapTwo)){
                return true;
            }
        }

        return false;
    }
}
