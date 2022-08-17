package com.data.neetcode150.binarySearch;

public class SearchRotatedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(searchArray(nums, target));
    }

    private static int searchArray(int[] nums, int target) {
        int n = nums.length;
        int left =0;

        int right = (n+left)/2;
        if(nums[right] == target) return right;

        while(left <= right){
            if(target < nums[left] || target > nums[right]){
                left = right + 1;
                right = n-1;
            }
            if(nums[right] == target){
                return right;
            }

        }
        return -1;
    }
}
