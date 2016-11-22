package com.codingbat.ap1;

/**
 * Created  on 20.10.16.
 */
/*
* Given an array of positive ints, return a new array of length "count" containing the first even numbers from the
* original array. The original array will contain at least "count" even numbers.
*/
public class CopyEvens {
    public int[] copyEvens(int[] nums, int count) {
        int[] result = new int[count];
        for (int i = 0, j = 0; i < count && j < nums.length; j++) {
            if (nums[j] % 2 == 0) {
                result[i] = nums[j];
                i++;
            }
        }
        return result;
    }
}
