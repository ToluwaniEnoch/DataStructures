package com.data.dataStructures;

import java.util.HashSet;
import java.util.Set;

public class CountPlaceholders {
    public static void main(String[] args) {
        String content = "Hello {0}, welcome to our app. Your details have been saved as {10} {120}. Have a good day.";
        countPlaceHoldersInString(content);
    }

    public static void countPlaceHoldersInString(String content){
        Set<Integer> set = new HashSet<>();

        for(int i=0; i< content.length(); i++){
            if(content.charAt(i) == '{'){
                for(int j=i; j<content.length(); j++){
                    if(content.charAt(j) == '}'){
                        String substring = content.substring(i + 1, j);
                        set.add(Integer.valueOf(substring));
                        break;
                    }
                }
            }
        }

        System.out.println(set);
        System.out.println(set.size());
    }
}
