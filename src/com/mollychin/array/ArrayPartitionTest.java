package com.mollychin.array;

import java.util.Arrays;

/**
 * Given an array of 2n integers, your task is to group these integers into n pairs of integer, say
 * (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large
 * as possible.
 */
public class ArrayPartitionTest {

  public static void main(String[] args) {
    int i = arrayPairSum(new int[]{1, 2, 3, 4});
    System.out.println(i);
  }
  public static int arrayPairSum(int[] nums) {
    Arrays.sort(nums);//排序之后第奇数个之和是sum
    int i = 0;
    int sum = 0;
    while (i < nums.length) {
      sum = sum + nums[i];
      i = i + 2;
    }
    return sum;
  }
}
