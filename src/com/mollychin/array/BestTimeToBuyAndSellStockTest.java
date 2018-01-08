package com.mollychin.array;

import java.util.Arrays;

/**
 * Say you have an array for which the ith element is the price of a given stock on day i. If you
 * were only permitted to complete at most one transaction (ie, buy one and sell one share of the
 * stock), design an algorithm to find the maximum profit.
 */
public class BestTimeToBuyAndSellStockTest {

  public static void main(String[] args) {
    int bestProfit2 = getBestProfit2(new int[]{2, 3, 4, 1});
    int  bestProfit1 = getBestProfit1(new int [] {2,3,4,1});
    System.out.println(bestProfit1+"   "+bestProfit2);
  }

  public static int getBestProfit1(int[] prices) {
    Arrays.sort(prices);
    int buy = Integer.MAX_VALUE;
    int result = 0;
    for (int price : prices) {
      buy = Math.min(buy, price);
      result = Math.max(result, price - buy);
    }
    return result;
  }

  public static int getBestProfit2(int[] prices) {
    int total = 0;
    for (int i = 0; i < prices.length - 1; i++) {
      if (prices[i + 1] > prices[i]) {
        total += prices[i + 1] - prices[i];
      }
    }
    return total;
  }
}
