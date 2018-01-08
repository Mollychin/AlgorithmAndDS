package com.mollychin.array;

/**
 * Given an array of integers that is already sorted in ascending order, find two numbers such that
 * they add up to a specific target number. The function twoSum should return indices of the two
 * numbers such that they add up to the target, where index1 must be less than index2. Please note
 * that your returned answers (both index1 and index2) are not zero-based. You may assume that each
 * input would have exactly one solution and you may not use the same element twice.
 */
public class TwoSumIITest {

  public static void main(String[] args) {

  }

  public int[] twoSum(int[] targetArray, int targetSum) {
    if (targetArray == null || targetArray.length == 0 || targetArray[0] >= targetSum) {
      return null;
    }
    int l = 0, r = targetArray.length - 1;
    while (targetArray[l] + targetArray[r] != targetSum) {
      if (targetArray[l] + targetArray[r] > targetSum) r--;
      else l++;
    }
    return new int[]{l + 1, r + 1};
  }
}
