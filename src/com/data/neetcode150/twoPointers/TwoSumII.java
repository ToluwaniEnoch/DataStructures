package com.data.neetcode150.twoPointers;

public class TwoSumII {
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int right = numbers.length - 1;
        int left = 0;

        while(left < right){
            int sum = numbers[left] + numbers[right];
            //System.out.println(left + " "+ right);
            if(sum == target){
                result[0] = left+1;
                result[1] = right+1;
                return result;
            }else if(target<sum){
                right--;
            }else{
                left++;
            }

        }

        return result;
    }

    public static void main(String[] args) {
        int[]  numbers = new int[] {2,3,4};
        int target = 6;
        int[] twoSum = twoSum(numbers, target);
        System.out.println(twoSum);
    }
}
