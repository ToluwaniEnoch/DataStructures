package com.Data.neetcode150.twoPointers;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int [] height = new int[] {1,2,4,3};
        System.out.println(maxArea(height));
    }

    private static int maxArea(int[] height) {
        int result = 0;
        int left = 0;
        int right = height.length-1;

        while(left < right){
            int area = Math.min(height[left], height[right]) * (right - left);
            result = Math.max(result, area);

            if(height[left] < height[right]){
                left++;
            } else{
                right--;
            }
        }

        return result;
    }
}
