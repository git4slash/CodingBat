package com.codingbat.array2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Oleksandr Subbotin
 * @version 1.0
 * @since 19.12.16
 */
//shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
//shiftLeft([1, 2]) → [2, 1]
//shiftLeft([1]) → [1]
@RunWith(Parameterized.class)
public class ShiftLeftTest {
    @Parameterized.Parameter
    public int[] nums;

    @Parameterized.Parameter(value = 1)
    public int[] expectedValue;

    private ShiftLeft testObj;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{6, 2, 5, 3}, new int[]{2, 5, 3, 6}},
                {new int[]{1, 2}, new int[]{2, 1}},
                {new int[]{1}, new int[]{1}},
                {new int[]{}, new int[]{}},
        });
    }

    @Test
    public void shiftLeft() throws Exception {
        testObj = new ShiftLeft();
        int[] result = testObj.shiftLeft(nums);
        assertThat(result, is(expectedValue));
    }

    @Test
    public void shiftLeft8() throws Exception {
        testObj = new ShiftLeft();
        int[] result = testObj.shiftLeft8(nums);
        assertThat(result, is(expectedValue));
    }
}