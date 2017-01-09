package com.codingbat.array2;

import java.util.Arrays;

/**
 * @author Oleksandr Subbotin
 * @version 1.0
 * @since 05.01.17
 */
/*Given an array of ints, return true if every element is a 1 or a 4.*/
public class Only14 {
    public final int FIRST_NUM = 1;
    public final int SECOND_NUM = 4;

    public boolean only14(int[] nums) {
        for (int num : nums) {
            if (!isFit(num)) return false;
        }
        return true;
    }

    private boolean isFit(int num) {
        return FIRST_NUM == num || SECOND_NUM == num;
    }

    public boolean only14J9(int[] nums) {
        return Arrays.stream(nums).allMatch(this::isFit);
    }
}

