package com.mollychin.array;

/**
 * Given a binary array, find the maximum number of consecutive 1s in this array. Example 1: Input:
 * [1,1,0,1,1,1] Output: 3 Explanation: The first two digits or the last three digits are
 * consecutive 1s. The maximum number of consecutive 1s is 3. Note: The input array will only
 * contain 0 and 1. The length of input array is a positive integer and will not exceed 10,000
 */
public class MaxConsecutiveOnesTest {

  public static void main(String[] args) {
    int maxConsecutiveOnes = getMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 1, 0, 1, 1});
    System.out.println(maxConsecutiveOnes);
  }

  public static int getMaxConsecutiveOnes(int[] target) {
    int maxHere = 0, max = 0;
    for (int n : target) {
      max = Math.max(max, maxHere = n == 0 ? 0 : maxHere + 1);
    }
    return max;
  }
}
