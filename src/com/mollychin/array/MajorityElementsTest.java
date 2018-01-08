package com.mollychin.array;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Given an array of size n, find the majority element. The majority element is the element that
 * appears more than ⌊ n/2 ⌋ times.
 *
 * You may assume that the array is non-empty and the majority element always exist in the array.
 */
public class MajorityElementsTest {

  public static void main(String[] args) {
    int majorityElements = getMajorityElements2(new int[]{1, 2, 3, 1, 1});
    System.out.println(majorityElements);
  }

  /**
   * My normal method.
   */
  public static int getMajorityElements1(int[] targetArray) {
    int length = targetArray.length;
    int result = 0;
    int times = 0;
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    for (int i = 0; i < targetArray.length; i++) {
      hashMap.put(targetArray[i], hashMap.getOrDefault(targetArray[i], 0) + 1);
    }
    for (int i : targetArray) {
      if (times < hashMap.get(i)) {
        times = hashMap.get(i);
        result = i;
      }
    }
    return times > length / 2 ? result : 0;
  }

  /**
   * More concise method like follows.
   */
  public static int getMajorityElements2(int[] targetArray) {
    Arrays.sort(targetArray);
    return targetArray[0] == targetArray[targetArray.length / 2] ? targetArray[0] : 0;
  }
}
