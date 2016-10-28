package com.codingbat.ap1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Oleksandr Subbotin
 * @version 1.0
 * @since 28.10.16
 */
/*
scoresAverage([2, 2, 4, 4]) → 4
scoresAverage([4, 4, 4, 2, 2, 2]) → 4
scoresAverage([3, 4, 5, 1, 2, 3]) → 4
*/
public class ScoresAverageTest {
    ScoresAverage testObj;
    int[] scores;
    int expectedValue;
    String message;

    @Before
    public void setUp() throws Exception {
        testObj = new ScoresAverage();
        message = "Expected value is: ";
    }

    @Test
    public void scoresAverage() throws Exception {
        expectedValue = 4;
        scores = new int[]{2, 2, 4, 4};
        assertEquals(message + expectedValue,
                expectedValue,
                testObj.scoresAverage(scores));

        scores = new int[]{4, 4, 4, 2, 2, 2};
        assertEquals(message + expectedValue,
                expectedValue,
                testObj.scoresAverage(scores));

        scores = new int[]{3, 4, 5, 1, 2, 3};
        assertEquals(message + expectedValue,
                expectedValue,
                testObj.scoresAverage(scores));
    }

}