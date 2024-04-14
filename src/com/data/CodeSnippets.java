package com.data;

import com.data.voidInvoices.Payload;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

public class CodeSnippets {
    public static void main(String[] args) {
        testGson();
    }

    public static void testGson(){
//        Payload payload = new Payload("1321312", "VERIFIED");

//        log.info("Gson Payload {} ", new GsonBuilder().setPrettyPrinting().create().toJson(businessRequestDto));

//        new GsonBuilder().setPrettyPrinting().create().toJson()
        ArrayList<String> possibleValues = new ArrayList<>();
        possibleValues.add("ADMIN");
        possibleValues.add("SUPPLIER");
        possibleValues.add("BUYER");
        possibleValues.add(null);


        System.out.println("contains :: " + possibleValues.contains("ADMIN"));

        System.out.println("stream :: " + possibleValues.stream().anyMatch(a -> a.equals("ADMIN")));

    }

    /*
    calculates hypotenuse of a,b while dealing with overflow and underflow
    Math.hypot(a,b);

    sort list
    array.sort((arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));

    sort array
    Arrays.sort(arrayName);

    Arrays.sort(arrayName, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0])));

    Arrays.sort(intervals, Comparator.comparingInt(arr -> arr[0]));

    Return key by max element in map
    String key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();

    Stack
    Stack<Character> stack = new Stack();

    asc is highest no polled(removed)
    PriorityQueue<Integer> asc = new PriorityQueue<>((a, b) -> a > b ? -1 : 1);

    desc is lowest no polled(removed)
    PriorityQueue<Integer> desc = new PriorityQueue<>((a, b) -> a > b ? 1 : -1);
    PriorityQueue<Integer> desc2 = new PriorityQueue<>((a, b) -> b - a);

    */
}
