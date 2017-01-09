package com.codingbat.array2;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

/**
 * @author Oleksandr Subbotin
 * @version 1.0
 * @since 09.01.17
 */
/*We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array, at least
one of the pair is that value. Return true if the given value is everywhere in the array.*/
public class IsEverywhere {
    public boolean isEverywhereJ8(int[] nums, int val) {
        return IntStream.range(1, nums.length)
                .allMatch(i -> isOneFromAdjacentPairEqual(nums[i - 1], nums[i], val));
    }

    public boolean isEverywhere(int[] nums, int val) {
        for (int i = 1; i < nums.length; i++)
            if (!isOneFromAdjacentPairEqual(nums[i - 1], nums[i], val))
                return false;
        return true;
    }

    private boolean isOneFromAdjacentPairEqual(int element1, int element2, int value) {
        return element1 == value || element2 == value;
    }
}
