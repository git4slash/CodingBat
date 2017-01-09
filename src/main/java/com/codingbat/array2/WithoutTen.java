package com.codingbat.array2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Oleksandr Subbotin
 * @version 1.1
 * @since 11.12.16
 */
/*Return a version of the given array where all the 10's have been removed. The remaining elements should shift left
towards the start of the array as needed, and the empty spaces a the end of the array should be 0. So {1, 10, 10, 2}
yields {1, 2, 0, 0}. You may modify and return the given array or make a new array.*/
public class WithoutTen {
    final int VALUE_TO_REMOVE = 10;

    public static void main(String[] args) {
        new WithoutTen().withoutTen8(new int[]{10, 1, 1, 3, 10});
    }

    public int[] withoutTen8(int[] nums) {
        int[] resultArr = new int[nums.length];
        List<Integer> resList = Arrays.stream(nums)
                .filter(this::isShouldNotBeRemoved)
                .boxed()
                .collect(Collectors.toList());

        IntStream.range(0, resList.size())
                .forEach(i -> resultArr[i] = resList.get(i));

        return resultArr;
    }

    public boolean isShouldNotBeRemoved(int valueToCheck) {
        return VALUE_TO_REMOVE != valueToCheck;
    }

    public int[] withoutTen(int[] nums) {

        int[] resultArr = new int[nums.length];
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (isShouldNotBeRemoved(nums[i]))
                resultArr[j++] = nums[i];
        }
        return resultArr;
    }

}
