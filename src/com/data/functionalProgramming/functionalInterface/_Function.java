package com.data.functionalProgramming.functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        Integer increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);


        Integer addOneAndMultiplyByTen = incrementByOneFunction
                .andThen(multiplyByTenFunction).apply(5);
        System.out.println(addOneAndMultiplyByTen);

        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4, 23));

    }

    //function accepts one argument and returns one result
    static Function<Integer, Integer> incrementByOneFunction = number -> number +1 ;
    static Function<Integer, Integer> multiplyByTenFunction = number -> number *10 ;

    //bi-function takes 2 arguments and returns one result
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy) ->
                    (numberToIncrementByOne + 1) * numberToMultiplyBy;

}
