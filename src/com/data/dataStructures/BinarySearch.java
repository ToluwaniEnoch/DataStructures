package com.data.dataStructures;

import com.data.neetcode150.linkedList.Node;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,4,5};
        System.out.println(binarySearchAlgo(nums, 7));
    }

    private static int binarySearchAlgo(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;

        while(left<= right){
            int mid = (left + right)/2;
            if(nums[mid] == target) return mid;

            if(target < nums[mid]){
                right = mid -1;
            }else{
                left = mid +1;
            }
        }
        return -1;
    }
}
