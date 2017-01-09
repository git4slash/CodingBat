package com.codingbat.array2;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author Oleksandr Subbotin
 * @version 1.0
 * @since 19.12.16
 */
/*
Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. You may modify and return the
given array, or return a new array.*/
public class ShiftLeft {

    public int[] shiftLeft8(int[] nums) {
        return nums.length == 0 ?
                nums :
                IntStream.concat(Arrays.stream(nums).skip(1), IntStream.of(nums[0])).toArray();
    }

    public int[] shiftLeft(int[] nums) {
        if (nums.length == 0) return nums;
        int[] result = Arrays.copyOf(Arrays.copyOfRange(nums, 1, nums.length), nums.length);
        result[nums.length - 1] = nums[0];
        return result;
    }
}