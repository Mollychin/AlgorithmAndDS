package com.mollychin.week1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Given two arrays, write a function to compute their intersection. Example: Given nums1 = [1, 2,
 * 2, 1], nums2 = [2, 2], return [2]. Note: Each element in the result must be unique. The result
 * can be in any order.
 */
public class IntersectionOf2ArraysTest {

  public static void main(String[] args) {
    int[] intersectArray = intersectionOf2Arrays3(new int[]{1, 2, 3, 4, 5}, new int[]{2, 3});
    for (int i = 0; i < intersectArray.length; i++) {
      System.out.println(intersectArray[i]);
    }
  }

  /**
   * Set:unique. method1.Time Complexity:O(N)
   */
  public static int[] intersectionOf2Arrays1(int[] numbs1, int[] numbs2) {
    Set<Integer> set = new HashSet<>();
    Set<Integer> intersectSet = new HashSet<>();
    for (int i = 0; i < numbs1.length; i++) {
      set.add(numbs1[i]);
    }
    for (int i = 0; i < numbs2.length; i++) {
      if (set.contains(numbs2[i])) {
        intersectSet.add(numbs2[i]);
      }
    }
    int[] result = new int[intersectSet.size()];
    int i = 0;
    for (Integer num : intersectSet) {
      result[i++] = num;
    }
    return result;
  }

  /**
   * Time complexity: O(nlogn).
   */
  public static int[] intersectionOf2Arrays2(int[] numbs1, int[] numbs2) {
    HashSet<Integer> intersectSet = new HashSet<>();
    Arrays.sort(numbs1);
    Arrays.sort(numbs2);
    int i = 0;
    int j = 0;
    while (i < numbs1.length && j < numbs2.length) {
      if (numbs1[i] > numbs2[j]) {
        j++;
      } else if (numbs1[i] < numbs2[j]) {
        i++;
      } else {
        intersectSet.add(numbs1[i]);
        /**
         * next two steps values.
         */
        i++;
        j++;
      }
    }
    int[] intersectArray = new int[intersectSet.size()];
    int k = 0;
    for (Integer integer : intersectSet) {
      intersectArray[k++] = integer;
    }
    return intersectArray;
  }

  /**
   * binary research.Time complexity: O(nlogn)
   */
  public static int[] intersectionOf2Arrays3(int[] numbs1, int[] numbs2) {
    Set<Integer> set = new HashSet<>();
    Arrays.sort(numbs2);
    for (Integer num : numbs1) {
      if (binarySearch(numbs2, num)) {
        set.add(num);
      }
    }
    int i = 0;
    int[] result = new int[set.size()];
    for (Integer num : set) {
      result[i++] = num;
    }
    return result;
  }

  public static  boolean binarySearch(int[] nums, int target) {
    int low = 0;
    int high = nums.length - 1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (nums[mid] == target) {
        return true;
      }
      if (nums[mid] > target) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return false;
  }
}
