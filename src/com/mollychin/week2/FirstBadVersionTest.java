package com.mollychin.week2;

/**
 * You are a product manager and currently leading a team to develop a new product. Unfortunately,
 * the latest version of your product fails the quality check. Since each version is developed based
 * on the previous version, all the versions after a bad version are also bad.
 *
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which
 * causes all the following ones to be bad.
 *
 * You are given an API bool isBadVersion(version) which will return whether version is bad.
 * Implement a function to find the first bad version. You should minimize the number of calls to
 * the API.
 *
 * Credits: Special thanks to @jianchao.li.fighter for adding this problem and creating all test
 * cases.
 */
public class FirstBadVersionTest {

  public static void main(String[] args) {

  }

  /**
   * This method has been written in the old Class definition.
   */
  public static boolean isBadVersion(int target) {
    return true;
  }

  public static int findFirstBadVersion(int n) {
    int start = 1, end = n;
    while (start < end) {
      //int mid = (start+end)/2;, their sum will exceed integer limit when both are very large.
      int mid = start + (end - start) / 2;
      if (!isBadVersion(mid)) {
        start = mid + 1;
      } else {
        end = mid;
      }
    }
    return start;
  }

}
