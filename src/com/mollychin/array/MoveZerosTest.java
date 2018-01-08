package com.mollychin.array;

/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the
 * relative order of the non-zero elements.
 *
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3,
 * 12, 0, 0].
 *
 * Note: You must do this in-place without making a copy of the array. Minimize the total number of
 * operations.
 */
public class MoveZerosTest {

  public static void main(String[] args) {
    int[] ints = moveZeros(new int[]{4, 0, 0, 1, 2, 3});
    for (int i : ints) {
      System.out.println(i);
    }
  }

  public static int[] moveZeros(int[] target) {
    if (target.length == 0 || target == null) {
      return null;
    }
    int insertPosition = 0;
    for (int i = 0; i < target.length; i++) {
      if (target[i] != 0) {
        target[insertPosition] = target[i];
        insertPosition++;
      }
    }
    while (insertPosition < target.length) {
      target[insertPosition] = 0;
      insertPosition++;
    }
    return target;
  }
}
