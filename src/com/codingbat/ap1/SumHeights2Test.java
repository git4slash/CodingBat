package com.codingbat.ap1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created  on 20.10.16.
 */
/*
sumHeights2([5, 3, 6, 7, 2], 2, 4) → 7
sumHeights2([5, 3, 6, 7, 2], 0, 1) → 2
sumHeights2([5, 3, 6, 7, 2], 0, 4) → 15
*/
public class SumHeights2Test {
    SumHeights2 testObj;
    int expectedValue, startIndex, endIndex;
    int[] heights;
    String message;

    @Before
    public void setUp() throws Exception {
        testObj = new SumHeights2();
        message = "Expected sum is: ";
    }

    @Test
    public void sumHeights2() throws Exception {
        heights = new int[]{5, 3, 6, 7, 2};
        startIndex = 2;
        endIndex = 4;
        expectedValue = 7;
        assertEquals(message + expectedValue,
                    expectedValue,
                    testObj.sumHeights2(heights, startIndex, endIndex));

        heights = new int[]{5, 3, 6, 7, 2};
        startIndex = 0;
        endIndex = 4;
        expectedValue = 15;
        assertEquals(message + expectedValue,
                    expectedValue,
                    testObj.sumHeights2(heights, startIndex, endIndex));

        heights = new int[]{5, 3, 6, 7, 2};
        startIndex = 0;
        endIndex = 1;
        expectedValue = 2;
        assertEquals(message + expectedValue,
                    expectedValue,
                    testObj.sumHeights2(heights, startIndex, endIndex));

    }

}