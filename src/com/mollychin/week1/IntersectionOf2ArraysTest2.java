package com.mollychin.week1;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Example: Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2]. Note: Each element in the
 * result should appear as many times as it shows in both arrays. The result can be in any order.
 * Follow up: What if the given array is already sorted? How would you optimize your algorithm? What
 * if nums1's size is small compared to nums2's size? Which algorithm is better? What if elements of
 * nums2 are stored on disk, and the memory is limited such that you cannot load all elements into
 * the memory at once?
 */
public class IntersectionOf2ArraysTest2 {

  public static void main(String[] args) {
    int[] intersect = intersectionOf2Arrays1(new int[]{1, 2, 3, 4, 5, 5}, new int[]{1, 2, 2, 5, 5});
    for (int i : intersect) {
      System.out.println(i);
    }
  }

  public static int[] intersectionOf2Arrays1(int[] numbs1, int[] numbs2) {
    HashMap<Integer, Integer> intersectMap = new HashMap<>();
    ArrayList<Integer> intersectList = new ArrayList<>();
    for (int i = 0; i < numbs1.length; i++) {
      if (intersectMap.containsKey(numbs1[i])) {
        intersectMap.put(numbs1[i], intersectMap.get(numbs1[i]) + 1);
      } else {
        intersectMap.put(numbs1[i], 1);
      }
    }
    for (int i = 0; i < numbs2.length; i++) {
      if (intersectMap.containsKey(numbs2[i]) && intersectMap.get(numbs2[i]) > 0) {
        intersectList.add(numbs2[i]);
        intersectMap.put(numbs2[i], intersectMap.get(numbs2[i]) - 1);
      }
    }
    int[] intersectArray = new int[intersectList.size()];
    for (int i = 0; i < intersectList.size(); i++) {
      intersectArray[i] = intersectList.get(i);
    }
    return intersectArray;
  }


}
