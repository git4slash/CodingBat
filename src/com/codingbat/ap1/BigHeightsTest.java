package com.codingbat.ap1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created  on 21.10.16.
 */
/*
bigHeights([5, 3, 6, 7, 2], 2, 4) → 1
bigHeights([5, 3, 6, 7, 2], 0, 1) → 0
bigHeights([5, 3, 6, 7, 2], 0, 4) → 1
*/
public class BigHeightsTest {
    BigHeights testObj;
    String message;
    int expectedValue, start, end;
    int[] heghts;

    @Before
    public void setUp() throws Exception {
        testObj = new BigHeights();
        message = "Expected value is: ";
        heghts = new int[]{5, 3, 6, 7, 2};
    }

    @Test
    public void bigHeights() throws Exception {
        expectedValue = 0;
        start = 0;
        end = 1;
        assertEquals(message + expectedValue,
                    expectedValue,
                    testObj.bigHeights(heghts, start, end));

        expectedValue = 1;
        end = 4;
        assertEquals(message + expectedValue,
                    expectedValue,
                    testObj.bigHeights(heghts, start, end));
        start = 2;
        assertEquals(message + expectedValue,
                    expectedValue,
                    testObj.bigHeights(heghts, start, end));
    }

}