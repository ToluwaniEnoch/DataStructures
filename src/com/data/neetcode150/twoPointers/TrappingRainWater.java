package com.data.neetcode150.twoPointers;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height = new int[] {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }

    private static int trap(int[] height) {
        //water trapped at any point is the minimum of maxLeft and maxRight at that point minus height of that bar
        if(height == null || height.length == 0) return 0;

        int left = 0; int right = height.length -1;
        int maxLeft = 0; int maxRight = 0;

        int totalAmount = 0;

        while(left < right){
            if(height[left] < height[right]){
                if(height[left] >= maxLeft){
                    maxLeft = height[left];
                }else{
                    totalAmount += maxLeft - height[left];

                }
                left++;

            }else{
                if(height[right] >= maxRight){
                    maxRight = height[right];
                }else{
                    totalAmount += maxRight - height[right];

                }
                right--;
            }
        }
        return totalAmount;
    }
}
