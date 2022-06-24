package com.data.neetcode150.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 12;
        System.out.println(binarySearch(nums, target));
        System.out.println(binarySearch2(nums, target));
    }

    private static int binarySearch2(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = (right + left) / 2;
            if(nums[mid] == target) return mid;

            if(nums[mid] < target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
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
