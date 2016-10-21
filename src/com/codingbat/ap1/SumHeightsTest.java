package com.codingbat.ap1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created  on 21.10.16.
 */
/*
sumHeights([5, 3, 6, 7, 2], 2, 4) → 6
sumHeights([5, 3, 6, 7, 2], 0, 1) → 2
sumHeights([5, 3, 6, 7, 2], 0, 4) → 11
*/
public class SumHeightsTest {
    SumHeights testObj;
    String message;
    int expectedValue, startIndex, endIndex;
    int[] heghtsToTest;

    @Before
    public void setUp() throws Exception {
        testObj = new SumHeights();
        message = "Expected value is: ";
    }

    @Test
    public void sumHeights() throws Exception {
        expectedValue = 6;
        heghtsToTest = new int[]{5, 3, 6, 7, 2};
        startIndex = 2;
        endIndex = 4;
        assertEquals(message + expectedValue,
                    expectedValue,
                    testObj.sumHeights(heghtsToTest, startIndex, endIndex));

        expectedValue = 2;
        startIndex = 0;
        endIndex = 1;
        assertEquals(message + expectedValue,
                    expectedValue,
                    testObj.sumHeights(heghtsToTest, startIndex, endIndex));

        expectedValue = 11;
        startIndex = 0;
        endIndex = 4;
        assertEquals(message + expectedValue,
                    expectedValue,
                    testObj.sumHeights(heghtsToTest, startIndex, endIndex));

    }

}