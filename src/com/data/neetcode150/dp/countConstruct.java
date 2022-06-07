package com.data.neetcode150.dp;

import java.util.HashMap;
import java.util.Map;

public class countConstruct {
    public static void main(String[] args) {
        String[] wordBank = {"ab", "abc", "cd", "def", "abcd"};
        String[] wordBankB = {"purp", "p", "ur", "le", "purpl"};
        String[] wordBankC = {"a", "p", "ent", "enter", "ot", "o", "t"};
       // System.out.println(countConstructFreq("abcdef", wordBank));
       // System.out.println(countConstructFreq("enterapotentpot", wordBankC));
        System.out.println(countConstructFreq("purple", wordBankB, new HashMap<>()));    }

    private static int countConstructFreq(String target, String[] wordBank, Map<String, Integer> map) {
        //Map<String, Integer> map = new HashMap<>();
        if(map.containsKey(target)) return map.get(target);
        int result = 0;

        if(target.equals("")) {
            return 1;
        }

        for(String word : wordBank){
//            if(map.containsKey(word)) {
//                result += map.get(word);
//            }
            if(target.startsWith(word)){
                String suffix = target.substring(word.length());
                //map.put(target, 1);
                int numWays = countConstructFreq(suffix, wordBank, map);
                result += numWays;
            }
            //map.put(word, 0);
        }
        map.put(target, result);
        return result;
    }
}
