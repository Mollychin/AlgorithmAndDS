package com.mollychin.week2;

/**
 * We are playing the Guess Game. The game is as follows:
 *
 * I pick a number from 1 to n. You have to guess which number I picked.
 *
 * Every time you guess wrong, I'll tell you whether the number is higher or lower.
 *
 * You call a pre-defined API guess(int num) which returns 3 possible results (-1, 1, or 0):
 */
public class GuessNumberHigherOrLowerTest {

  public static void main(String[] args) {
    int i = guessNumber(19);
    System.out.println(i);
  }

  public static int guessNumber(int n) {
    return helper(1, n);
  }

  public static int helper(int start, int end) {
    if (start == end) {
      return start;
    }
    int mid = Math.toIntExact(((long) start + (long) end) / 2);
    int r = 0;
    if (guess(mid) == 0) {
      r = mid;
    } else if (guess(mid) == 1) {
      r = helper(mid + 1, end);
    } else if (guess(mid) == -1) {
      r = helper(start, mid - 1);
    }
    return r;
  }
  /**
   * pre_defined API.
   */
  public static int guess(int i) {
    return 0;
  }

}
