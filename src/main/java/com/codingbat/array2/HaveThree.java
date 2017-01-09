package com.codingbat.array2;

import java.util.stream.IntStream;

/**
 * @author Oleksandr Subbotin
 * @version 1.0
 * @since 16.12.16
 */
/*Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each
other.*/
public class HaveThree {
    private final int TARGET_VALUE = 3;

    private boolean isMatch(int value) {
        return TARGET_VALUE == value;
    }

    private final int APPEARS_TIMES = 3;

    public boolean haveThree8(int[] nums) {
        return APPEARS_TIMES == IntStream.range(0, nums.length)
                .filter(i -> isMatch(nums[i])               // current element matches target
                        && !(  (i != nums.length - 1)       // current element is not last (while next check give IoBexc)
                                && isMatch(nums[i + 1]))    // and no target values next to each
                ).count();
    }

    public boolean haveThree(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
                if (isMatch(nums[i]) &&
                        !((i != nums.length - 1) && isMatch(nums[i + 1])))
                    counter++;
        }
        return APPEARS_TIMES == counter;
    }
}
