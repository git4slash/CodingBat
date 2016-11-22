package com.codingbat.ap1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author Oleksandr Subbotin
 * @version 1.0
 * @since 22.11.16
 */
/*We'll say that a positive int n is "endy" if it is in the range 0..10 or 90..100 (inclusive). Given an array of
positive ints, return a new array of length "count" containing the first endy numbers from the original array.
Decompose out a separate isEndy(int n) method to test if a number is endy. The original array will contain at least
"count" endy numbers.*/
public class CopyEndy {

    public int[] copyEndy8(int[] nums, int count) {
        return IntStream.of(nums)
                .filter(CopyEndy::isEndy)
                .limit(count)
                .toArray();
    }

    public int[] copyEndy(int[] nums, int count) {
        int[] result = new int[count];
        for (int i = 0, j = 0; i < nums.length && j < count; i++) {
            if (isEndy(nums[i])) {
                result[j] = nums[i];
                j++;
            }
        }
        return result;
    }

    private static boolean isEndy(int n) {
        return     (0  <= n && n <= 10)
                || (90 <= n && n <= 100);
    }

}
