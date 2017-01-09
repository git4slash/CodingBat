package com.codingbat.array2;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

/**
 * @author Oleksandr Subbotin
 * @version 1.0
 * @since 08.01.17
 */
/*Given a non-empty array of ints, return a new array containing the elements from the original array that come after
the last 4 in the original array. The original array will contain at least one 4. Note that it is valid in java
to create an array of length 0.*/
public class Post4 {
    public final int NUM_TO_FIND = 4;

    private boolean isMatch(int num) {
        return NUM_TO_FIND == num;
    }

    public int[] post4J8(int[] nums) {
        final IntPredicate numIsMatch = i -> isMatch(nums[i]);
        final int lastNumToFindIdx =
                IntStream.iterate(nums.length - 1, i -> i - 1)
                    .limit(nums.length)
                    .filter(numIsMatch)
                    .findFirst()
                    .orElse(-1);
        if (lastNumToFindIdx < 0)
            return new int[0];
        else
            return Arrays.copyOfRange(nums, lastNumToFindIdx + 1, nums.length);
    }

    public int[] post4(int[] nums) {
        int lastNumToFindIdx = -1;
        for (int i = nums.length - 1; i >= 0 && lastNumToFindIdx < 0; i--) {
            if (isMatch(nums[i]))
                lastNumToFindIdx = i;
        }
        if (lastNumToFindIdx < 0)
            return new int[0];
        else
            return Arrays.copyOfRange(nums, lastNumToFindIdx + 1, nums.length);
    }
}
