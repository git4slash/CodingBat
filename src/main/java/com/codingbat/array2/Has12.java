package com.codingbat.array2;

import java.util.stream.IntStream;

/**
 * @author Oleksandr Subbotin
 * @version 1.0
 * @since 19.12.16
 */
/*Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.*/
public class Has12 {
    private final int FIRST_DIGIT_TO_FIND = 1;
    private final int SECOND_DIGIT_TO_FIND = 2;
    private boolean isFistFound;

    public boolean has12(int[] nums) {
        isFistFound = false;
        for (int i = 0; i < nums.length; i++) {
            if (isFistFound && SECOND_DIGIT_TO_FIND == nums[i])
                return true;
            else if (FIRST_DIGIT_TO_FIND == nums[i])
                isFistFound = true;
        }
        return false;
    }
}
