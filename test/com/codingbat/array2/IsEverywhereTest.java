package com.codingbat.array2;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * @author Oleksandr Subbotin
 * @version 1.0
 * @since 09.01.17
 */
/*isEverywhere([1, 2, 1, 3], 1) → true
isEverywhere([1, 2, 1, 3], 2) → false
isEverywhere([1, 2, 1, 3, 4], 1) → false*/
@RunWith(Parameterized.class)
public class IsEverywhereTest {
    @Parameterized.Parameter
    public int[] nums;

    @Parameterized.Parameter(value = 1)
    public int val;

    @Parameterized.Parameter(value = 2)
    public boolean expectedValue;

    private IsEverywhere testObj;

    @Before
    public void setUp() throws Exception {
        testObj = new IsEverywhere();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 2, 1, 3},    1, true},
                {new int[]{1, 2, 1, 3},    2, false},
                {new int[]{1, 2, 1, 3, 4}, 1, false},
        });
    }

    @Test
    public void isEverywhere() throws Exception {
        assertThat(testObj.isEverywhere(nums, val), is(expectedValue));
    }

    @Test
    public void isEverywhereJ8() throws Exception {
        assertThat(testObj.isEverywhereJ8(nums, val), is(expectedValue));
    }
}