package com.mollychin.week1;

/**
 * Given an array of integers that is already sorted in ascending order, find two numbers such that
 * they add up to a specific target number. The function twoSum should return indices of the two
 * numbers such that they add up to the target, where index1 must be less than index2. Please note
 * that your returned answers (both index1 and index2) are not zero-based. You may assume that each
 * input would have exactly one solution and you may not use the same element twice. Input:
 * numbers={2, 7, 11, 15}, target=9 Output: index1=1, index2=2
 */

public class TwoSumUpToGivenNumTest {

  public static void main(String[] args) {
    int[] ints = twoSumUpToGivenNum(new int[]{1, 3, 4, 5, 7}, 9);
    for (int i : ints) {
      System.out.println(i);
    }
  }

  public static int[] twoSumUpToGivenNum(int[] num, int target) {
    int[] indices = new int[2];
    if (num == null || num.length < 2) {
      return indices;
    }
    int left = 0, right = num.length - 1;
    while (left < right) {
      int v = num[left] + num[right];
      if (v == target) {
        indices[0] = left;
        indices[1] = right;
        break;
      } else if (v > target) {
        right--;
      } else {
        left++;
      }
    }
    return indices;
  }
}
