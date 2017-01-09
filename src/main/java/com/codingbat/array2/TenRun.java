package com.codingbat.array2;

import java.util.stream.IntStream;

/**
 * @author Oleksandr Subbotin
 * @version 1.0
 * @since 30.12.16
 */
/*For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, until
encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.*/
public class TenRun {
    public final int DIVIDER = 10;

    public int[] tenRun8(int[] nums) {
        int[] result = new int[nums.length];
        IntStream.range(0, nums.length)
                .sequential()
                .forEach(i -> {
                    if (nums[i] % DIVIDER == 0 || !(i > 0 && result[i - 1] % DIVIDER == 0))
                        result[i] = nums[i];
                    else
                        result[i] = result[i - 1];
                });
        return result;
    }

    public int[] tenRun(int[] nums) {
        int tmpNum = 0;
        boolean isFound = false;
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % DIVIDER == 0) {
                tmpNum = nums[i];
                isFound = true;
            }
            result[i] = isFound ? tmpNum : nums[i];
        }
        return result;
    }
}
