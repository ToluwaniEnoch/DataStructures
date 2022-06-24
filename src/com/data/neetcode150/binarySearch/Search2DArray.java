package com.data.neetcode150.binarySearch;

public class Search2DArray {
    public static void main(String[] args) {
        int[][] nums = {{1,2,3},{6,7,8},{12,14,15}};
        System.out.println(searchArray(nums, 3));
    }

    private static boolean searchArray(int[][] nums, int target) {
        int rowStart = 0;
        int rowEnd = nums.length - 1;

        while(rowStart <= rowEnd){
            int mid = (rowStart + rowEnd)/2;

            if(nums[mid][0] == target) return true;

            if(nums[mid][0] <= target && nums[mid][nums[mid].length -1] >= target){
                int left = 0;
                int right = nums[mid].length-1;
                while(left <= right){
                    int m = (left + right)/2;
                    if(nums[mid][m] == target) return true;

                    if(nums[mid][m] < target){
                        left = m+1;
                    }else{
                        right = m-1;
                    }
                }
                return false;
            }else if(nums[mid][0] > target){
                rowEnd = mid-1;
            }else{
                rowStart = mid+1;
            }
        }
        return false;
    }
}
