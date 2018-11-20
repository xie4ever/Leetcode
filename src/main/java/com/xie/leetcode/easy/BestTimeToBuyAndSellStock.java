package com.xie.leetcode.easy;

/**
 * @author xie4ever
 * @date 2018/11/20 18:26
 */
public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        if (prices.length == 1) {
            return 0;
        }
        int maxPrice = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int price = prices[j] - prices[i];
                if (price > maxPrice) {
                    maxPrice = price;
                }
            }
        }
        return maxPrice;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
        System.out.println(bestTimeToBuyAndSellStock.maxProfit(prices));
    }
}
