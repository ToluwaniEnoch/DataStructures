package com.Data.neetcode150.slidingWindow;

public class MaxSumOfSubArray {
    public static void main(String[] args) {
        int[] array = {4,2,1,7,8,1,2,8,1,0};
        System.out.println(calculateMaxSumOfSubArray(array));
    }

    private static int calculateMaxSumOfSubArray(int[] array) {
        if(array.length < 3) return 0;
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i=0; i<array.length - 2; i++){
            currentSum = array[i] + array[i+1] + array[i+2];
            maxSum = Math.max(maxSum, currentSum);
            currentSum -= array[i];
        }
        return maxSum;
    }

}
