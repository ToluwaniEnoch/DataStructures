package com.data;

import com.data.neetcode150.arraysAndHashing.ValidAnagram;
import org.apache.commons.lang3.text.WordUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {


//        String newLine = "\n" + "here we are";
//        System.out.println("first one :: " + newLine);
//        System.out.println(newLine.trim());
//        String status = "PICKED";
//        DeliveryStatus deliveryStatus = DeliveryStatus.valueOf(status);

//        Optional<DeliveryStatus> deliveryStatus1 = DeliveryStatus.resolveForPickupStatus(status);
//        System.out.println("resolved for pickup :: " + deliveryStatus1.get().dfsOrderStatus);

//        System.out.println(deliveryStatus.toString());
//        System.out.println(DeliveryStatus.resolveForPickupStatus(status));
//        System.out.println(deliveryStatus.name());
//        System.out.println(deliveryStatus.dfsOrderStatus);
//        System.out.println(DeliveryStatus.resolveForPickupStatus("SHIPPED"));


        //kazeem -> PICKED

//        int[] nums = new int[] {1,2,3,1};
////        boolean b = ContainsDuplicate.containsDuplicate(nums);
////        System.out.println(b);
//
////        String s = "rat";
////        String t = "car";
////        boolean anagram = ValidAnagram.isAnagram(s, t);
////        System.out.println(anagram);
//
//        long now = System.nanoTime();
//        //String s = now.toString();
//        System.out.println(now);
//        //System.out.println(s);

//        List<Integer> integers = List.of(1, 2, 3);
//        List<Integer> integersFromDb = List.of(1, 2);
//
//        List<Integer> collect = integers.stream()
//                .filter(newProducts -> !integersFromDb.contains(newProducts))
//                .collect(Collectors.toList());
//
//        System.out.println(collect);
//        Properties properties = System.getProperties();
//        System.out.println(properties.toString());

//        guessMyNumberGame();
//        System.out.println(getVatRatioValue(BigDecimal.valueOf(1.2225)));
    }

    public static BigDecimal getVatRatioValue(BigDecimal vatValue){
        return vatValue.divide(BigDecimal.valueOf(100), 6, RoundingMode.FLOOR);
    }

//
//    public static int chooseNum(){
//        int max = 10;
//        int min = 0;
//        Random randomNumber = new Random();
//
//        return randomNumber.nextInt(max - min + 1) + min;
//    }
//
//    public static int giveNum() throws IOException {
//        System.out.println("input your guess \n");
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        return Integer.valueOf(reader.readLine());
//    }
//
//    public static void guessMyNumberGame() throws IOException {
//
//        int num = chooseNum();
//        int numOfGuesses = 3;
//
//        do {
//            Integer jummyNumber = giveNum();
//
//            if(jummyNumber.equals(num)) {
//                System.out.println("Congratulations, you got it");
//            } else {
//                System.out.println("Awwww..  you did not get it");
//                numOfGuesses = numOfGuesses - 1;
//            }
//
//        } while (numOfGuesses > 0);
//
//
//    }
//
//    public static void addNumbers(){
//        int number1 = 100;
//        int number2  = 300;
//
//        String sentence1 = "Hi, I'm Jummy. \n";
//        String sentence2 = "I'm getting married next week.";
//
//        System.out.println(sentence1 + sentence2);
//    }
}
 