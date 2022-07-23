package com.data.dynamicProgramming;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacciWithMemoization(7));
        System.out.println(fibonacciWithMemoization(50));

        System.out.println(fibonaciWithTabulation(7));
        System.out.println(fibonaciWithTabulation(50));
    }
    public static long fibonacciWithMemoization(int n){
        long[] memo = new long[n+1];
        return fibWMemo(n, memo);
    }

    private static long fibWMemo(int n, long[] memo) {
        if(memo[n] != 0) return memo[n];
        if(n <= 2) return 1;
        memo[n] = fibWMemo(n-1, memo) + fibWMemo(n-2, memo);
        return memo[n];
    }

    public static long fibonaciWithTabulation(int n){
        long[] result = new long[n+1];
        result[1] = 1;
        for(int i=0; i<=n-2; i++){
            result[i+1] += result[i];
            result[i+2] += result[i];
        }
        result[n] = result[n] + result[n-1];
        return result[n];
    }
}
