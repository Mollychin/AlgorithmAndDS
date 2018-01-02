package com.mollychin.week2;

/**
 * You have a total of n coins that you want to form in a staircase shape, where every k-th row must
 * have exactly k coins. Given n, find the total number of full staircase rows that can be formed. n
 * is a non-negative integer and fits within the range of a 32-bit signed integer.
 */
public class ArrangingCoinsTest {

  public static void main(String[] args) {
    int i = arrangeCoins2(5);
    System.out.println(i);
  }

  /**
   * a math method.
   */
  public static int arrangeCoins1(int n) {
    return (int) ((-1 + Math.sqrt(1 + 8 * (long) n)) / 2);
  }

  /**
   * Coins increase by 1 in every row beginning from 1. keep on subtracting same number of coins
   * from the ‘n’ until it goes negative.
   */
  public static int arrangeCoins2(int n) {
    if (n < 1) {
      return 0;
    }
    for (int i = 1; ; i++) {
      n -= i;
      if (n < 0) {
        return i - 1;
      }
    }
  }
}
