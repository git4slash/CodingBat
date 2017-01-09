package com.codingbat.array2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Oleksandr Subbotin
 * @version 1.0
 * @since 07.01.17
 */
/*Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky,
so it does not count and numbers that come immediately after a 13 also do not count.*/
public class Sum13 {
    final public int UNLUCKY_NUM = 13;

    private boolean isUnlucky(int num) {
        return UNLUCKY_NUM == num;
    }

    public int sum13(int[] nums) {
        int acc = 0;
        for (int i = 0; i < nums.length; i++) {
            if (isUnlucky(nums[i])) {
                i++;
                continue;
            }
            acc += nums[i];
        }
        return acc;
    }

    public int sum13J9(int[] nums) {
        return IntStream.range(0, nums.length)
                .reduce(0, (acc, i) ->
                        (isUnlucky(nums[i]) || i > 0 && isUnlucky(nums[i - 1])) ?
                                acc :
                                acc + nums[i]);
    }
}
