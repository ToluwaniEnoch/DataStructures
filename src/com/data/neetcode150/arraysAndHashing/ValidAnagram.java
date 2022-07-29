package com.data.neetcode150.arraysAndHashing;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnAnagram("anagram","nagaram"));
    }
    public static boolean isAnAnagram(String s, String t){
        if(s.length() != t.length()) return false;
        if(s.equals(t)) return true;

        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.merge(c, 1, Integer::sum);
        }

        for(char c : t.toCharArray()){
            if(map.containsKey(c) && map.get(c) > 0){
                int value = map.get(c);
                if(value == 1){
                    map.remove(c);
                }else{
                    map.put(c, value - 1);
                }
            }else{
                return false;
            }
        }
        return map.isEmpty();
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        if(s.equals(t)) return true;

        Map<Character, Integer> sMap = new HashMap();
        Map<Character, Integer> tMap = new HashMap();

        for(int i=0; i<s.length(); i++){
            sMap.merge(s.charAt(i), 1, Integer::sum);
            tMap.merge(t.charAt(i), 1, Integer::sum);
        }

        for(Character c : sMap.keySet()){
            if(!sMap.get(c).equals(tMap.get(c))) return false;
        }


        return true;

    }
}
