package com.codingbat.array2;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

/**
 * @author Oleksandr Subbotin
 * @version 1.0
 * @since 08.01.17
 */
/*We'll say that an element in an array is "alone" if there are values before and after it, and those values are
different from it. Return a version of the given array where every instance of the given value which is alone is
replaced by whichever value to its left or right is larger.*/
public class NotAlone {

    public int[] notAlone9(int[] nums, int val) {
        int[] res = Arrays.copyOf(nums, nums.length);
        IntStream.range(1, nums.length - 1)
                .filter(i -> nums[i] == val && nums[i] != nums[i - 1] && nums[i] != nums[i + 1])
                .forEach(i -> res[i] = max(nums[i - 1], nums[i], nums[i + 1]));
        return res;
    }

    public int[] notAlone(int[] nums, int val) {
        int[] res = Arrays.copyOf(nums, nums.length);
        for (int i = 1; i < nums.length - 1; i++) {
            int previous = nums[i - 1];
            int current  = nums[i];
            int next     = nums[i + 1];
            if (current == val && current != previous && current != next)
                res[i] = max(previous, current, next);
        }
        return res;
    }

    private int max(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
}
