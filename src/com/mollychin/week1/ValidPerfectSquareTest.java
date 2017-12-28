package com.mollychin.week1;

/**
 * Given a positive integer num, write a function which returns True if num is a perfect square else
 * False. Note: Do not use any built-in library function such as sqrt.
 */
public class ValidPerfectSquareTest {

  public static void main(String[] args) {
    System.out.println(validPerfectSquare1(12));
  }

  /**
   * method1. 很奇怪，平方数居然是1+3+5+7+9...
   */
  public static boolean validPerfectSquare1(int target) {
    int i = 1;
    while (target > 0) {
      target = target - i;
      i = i + 2;
    }
    return target == 0;
  }

  /**
   * Time Limited Exceeded method compared to method1.
   */
  public static boolean validPerfectSquare3(int target) {
    int i = 1;
    int temp = 1;
    while (temp < target) {
      i = i + 2;
      temp += i;
    }
    return temp == target;
  }

  /**
   * method2.牛顿法.
   */
  public static boolean validPerfectSquare2(int num) {
    long x = num;
    while (x * x > num) {
      x = (x + num / x) >> 1;
    }
    return x * x == num;
  }
}
