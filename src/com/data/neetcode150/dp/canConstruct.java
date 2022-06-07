package com.data.neetcode150.dp;

import java.util.HashMap;
import java.util.Map;

public class canConstruct {
    public static void main(String[] args) {
        String[] wordBank = {"ab", "abc", "cd", "def", "abcd"};
        String[] wordBankB = {"e", "eee", "eeeeeeeeee", "eeeee"};
        String[] wordBankC = {"a", "p", "ent", "enter", "ot", "o", "t"};
        System.out.println(canConstructString("abcdef", wordBank));
        System.out.println(canConstructString("enterapotentpot", wordBankC));
        System.out.println(canConstructString("eeeeeeeeeeeeeeeeeeeeeeeeeeeeef", wordBankB));
    }

    private static boolean canConstructString(String target, String[] wordBank) {
        Map<String, Boolean> map = new HashMap<>();

        return getStatus(target, wordBank, map);
    }
    private static boolean getStatus(String target, String[] wordBank, Map<String, Boolean> map){
        if(target.equals("")) return true;

        for(String word : wordBank){
            if(map.containsKey(word)) return map.get(word);
            if(target.startsWith(word)){
                String suffix = target.substring(word.length());
                map.put(word, true);
                if(getStatus(suffix, wordBank, map)) return true;
            }
            map.put(word, false);
        }

        return false;
    }
}
