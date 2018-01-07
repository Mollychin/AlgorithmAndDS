package com.mollychin.week1;

import org.omg.CORBA.INTERNAL;

import java.util.HashMap;

public class MaxConsecutiveOnesTest {
    public static void main(String[] args) {
        int maxConsecutiveOnes = getMaxConsecutiveOnes(new int[]{1, 1, 1, 2, 2, 3});
        System.out.println(maxConsecutiveOnes);
    }

    public static int getMaxConsecutiveOnes(int targetArray[]){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i : targetArray){
            hashMap.put(i,hashMap.getOrDefault(i,0)+1);
        }
        int result=0;
        for (int i:targetArray){
            result = i>result?i:result;
        }
        return result;
    }


    public static int getMaxConsecutiveOnes1(int[] targetArray) {
        int maxHere = 0, max = 0;
        for (int n : targetArray)
            max = Math.max(max, maxHere = n == 0 ? 0 : maxHere + 1);
        return max;
    }
}
