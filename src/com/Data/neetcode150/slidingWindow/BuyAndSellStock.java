package com.Data.neetcode150.slidingWindow;

public class BuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = new int[] {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        int maxProfit = 0;

        int profit = 0;
        int left = 0;
        int right = 1;

        while(right < prices.length){
            profit = prices[right] - prices[left];
            maxProfit = Math.max(profit, maxProfit);

            if(prices[right] < prices[left]){
                left = right;
            }
            right++;
        }


        return maxProfit;
    }
}
