package com.mollychin.week1;

/**
 * Given a sorted array and a target value, return the index if the target is found. If not, return
 * the index where it would be if it were inserted in order. You may assume no duplicates in the
 * array.
 */
public class SearchInsertPositionTest {

  public static void main(String[] args) {
    int index = searchInsertPosition2(new int[]{1, 2, 3, 4, 6, 7}, 5);
    System.out.println(index);
  }

  /**
   * method1.
   */
  public static int searchInsertPosition1(int[] destinationArray, int target) {
    int low = 1;
    int high = destinationArray.length - 1;
    if (low < high) {
      int medium = (low + high) / 2;
      if (destinationArray[medium] > target) {
        high = medium - 1;
      } else if (destinationArray[medium] < target) {
        low = medium + 1;
      }
    }
    return low;
  }

  /**
   * method2.
   */
  public static int searchInsertPosition2(int[] destinationArray, int target) {
    for (int i = 0; i < destinationArray.length; i++) {
      if (destinationArray[i] > target) {
        return i;
      }
    }
    return destinationArray.length;
  }

}
