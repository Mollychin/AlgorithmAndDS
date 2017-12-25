package com.mollychin.week1;

/**
 * Given a list of sorted characters letters containing only lowercase letters, and given a target
 * letter target, find the smallest element in the list that is larger than the given target.
 * Letters also wrap around. For example, if the target is target = 'z' and letters = ['a', 'b'],
 * the answer is 'a'.
 */
public class SmallestLetterGreaterThanGivenOneTest {

  public static void main(String[] args) {
    char f = smallestLetterGreaterThanGivenOne3(new char[]{'a', 'b', 'e', 'g', 'j', 'p', 'w'}, 'f');
    System.out.println(f);
  }

  /**
   * summary:method1. Complexity Analysis. Time Complexity: O(N). Space Complexity: O(1).
   */
  public static char smallestLetterGreaterThanGivenOne1(char[] letters, char target) {
    for (char c : letters) {
      if (c > target) {
        return c;
      }
    }
    return letters[0];
  }

  /**
   * summary:method2: Complexity Analysis. Time Complexity: O(logN), where N is the length of
   * letters. Space Complexity: O(1).
   */
  public static char smallestLetterGreaterThanGivenOne2(char[] letters, char target) {
    int low = 0;
    int high = letters.length;
    while (low < high) {
      int medium = (low + high) / 2;
      if (letters[medium] < target) {
        low = medium + 1;
      } else {
        high = medium;
      }
    }
    return letters[low % letters.length];
  }

  /**
   * summary:method3. The most amazing method I have ever seen. Time Complexity: O(N). where N is
   * the length of letters. We scan every element of the array. Space Complexity: O(1).the maximum
   * size of seen.
   */
  public static char smallestLetterGreaterThanGivenOne3(char[] letters, char target) {
    boolean[] booleans = new boolean[26];
    for (char c : letters) {
      booleans[c - 'a'] = true;
    }
    while (true) {
      target++; //这步很关键
      if (target > 'z') {
        return 'a';
      }
      if (booleans[target - 'a']) {
        return target;
      }
    }
  }
}
