package com.data.functionalProgramming.functionalInterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {
        System.out.println(isPhoneNumberValidPredicate.test("07099999999"));
        System.out.println(isPhoneNumberValidPredicate.test("070999999"));
        System.out.println(isPhoneNumberValidPredicate.test("08099999909"));

        System.out.println(isPhoneNumberValidPredicate
                .and(containsNumber3)
                .test("07093399999"));

        System.out.println(isPhoneNumberValidPredicate
                .or(containsNumber3)
                .test("07090999999"));

    }

    static Predicate<String> isPhoneNumberValidPredicate =
            phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 =
            phoneNumber -> phoneNumber.contains("3");
    static boolean isPhoneNumberValid (String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }
}
