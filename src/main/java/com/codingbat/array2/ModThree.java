package com.codingbat.array2;

import java.util.stream.IntStream;

/**
 * @author Oleksandr Subbotin
 * @version 1.0
 * @since 04.01.17
 */
/*Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.*/
public class ModThree {
    private int counter;
    private boolean isCountingEven;

    private boolean isEven(int num){
        return num % 2 == 0;
    }

    public boolean modThree(int[] nums) {
        counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (isEven(nums[i])) {
                if (!isCountingEven) {
                    counter = 1;
                    isCountingEven = true;
                } else {
                    counter++;
                }
            } else {
                if (isCountingEven) {
                    counter = 1;
                    isCountingEven = false;
                } else {
                    counter++;
                }
            }
            if (counter == 3) return true;
        }
        return false;
    }

    public boolean modThree8(int[] nums) {
        return IntStream.range(0, nums.length - 2)
                .sequential()
                .map(i -> (isEven(nums[i]) && isEven(nums[i + 1]) && isEven(nums[i + 2]))
                        || (!isEven(nums[i]) && !isEven(nums[i + 1]) && !isEven(nums[i + 2]))
                        ? 1 : 0)
                .anyMatch(i -> i == 1);
    }
}
