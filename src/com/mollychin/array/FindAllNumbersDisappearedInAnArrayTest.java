package com.mollychin.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 * Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
 */
public class FindAllNumbersDisappearedInAnArrayTest {

    public static void main(String[] args) {
        List<Integer> integers = get(new int[]{1, 2, 2, 4});
        System.out.println(integers);
    }

    public static List<Integer> get(int[] target) {
        List<Integer> ret = new ArrayList<Integer>();

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
}
