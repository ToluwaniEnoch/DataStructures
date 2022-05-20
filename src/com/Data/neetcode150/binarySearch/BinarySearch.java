package com.Data.neetcode150.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 2;
        System.out.println(binarySearch(nums, target));
    }

    private static int binarySearch(int[] nums, int target) {
        int result = -1;
        int n = nums.length -1;
        int left = 0;

        while(left <= n){
            int mid = (n+left)/2;

            if(nums[mid] == target) return mid;
            else if(nums[mid] < target){
                left = (mid+1);
            }else{
                n = mid -1;
            }
        }


        return result;
    }

}
