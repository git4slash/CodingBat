package com.codingbat.array2;

import java.util.Arrays;

/**
 * @author Oleksandr Subbotin
 * @version 1.0
 * @since 07.01.17
 */
/*Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.*/
public class Sum28 {
    public final int NUM_TO_SUM = 2;
    public final int EXPECTED_SUM = 8;

    private boolean isMatch(int num) {
        return NUM_TO_SUM == num;
    }

    public boolean sum28(int[] nums) {
        int accumulator = 0;
        for (int num : nums) {
            if (isMatch(num))
                accumulator += NUM_TO_SUM;
        }
        return EXPECTED_SUM == accumulator;
    }

    public boolean sum28J9(int[] nums) {
        return EXPECTED_SUM == Arrays.stream(nums)
                .filter(this::isMatch)
                .sum();
    }
}

