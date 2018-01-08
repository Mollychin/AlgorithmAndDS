package com.mollychin.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and
 * others appear once.
 *
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 *
 * Could you do it without extra space and in O(n) runtime? You may assume the returned list does
 * not count as extra space.
 */
public class FindAllNumbersDisappearedInAnArrayTest {

  public static void main(String[] args) {
    List<Integer> disappearedNumbers = getDisappearedNumbers2(new int[]{1, 2, 3, 5, 6, 9, 10});
    System.out.println(disappearedNumbers.toString());
  }

  public static List<Integer> getDisappearedNumbers1(int[] target) {
    List<Integer> ret = new ArrayList<>();
    for (int i = 0; i < target.length; i++) {
      int val = Math.abs(target[i]) - 1;
      if (target[val] > 0) {
        target[val] = -target[val];
      }
    }
    for (int i = 0; i < target.length; i++) {
      if (target[i] > 0) {
        ret.add(i + 1);
      }
    }
    return ret;
  }

  public static List<Integer> getDisappearedNumbers2(int[] nums) {
    List<Integer> res = new ArrayList<>();
    int n = nums.length;
    for (int i = 0; i < nums.length; i ++) nums[(nums[i]-1) % n] += n;
    for (int i = 0; i < nums.length; i ++) if (nums[i] <= n) res.add(i+1);
    return res;
  }
}