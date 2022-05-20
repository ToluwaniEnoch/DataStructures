package com.data.dataStructures;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDS {

    public static void main(String[] args) {
        setPractice();
    }

    public static void setPractice(){
        int[] numbers = {77, 23, 4, 66, 99, 112, 45, 56, 39, 89};
        //Set => no duplicate numbers
        Set<Integer> set = new HashSet<>();
        for(int num : numbers){
            set.add(num);
        }
        System.out.println(set);

        //TreeSet => sorted set
        TreeSet<Integer> treeSet = new TreeSet<>(set);
        System.out.println(treeSet);

        //HashSet => unsorted. Faster than treeSet
        HashSet<Integer> hashSet = new HashSet<>(set);
        System.out.println(hashSet);
    }

}
