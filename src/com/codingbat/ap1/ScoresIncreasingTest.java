package com.codingbat.ap1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Oleksandr Subbotin
 * @version 1.0
 * @since 25.10.16
 */
/*
scoresIncreasing([1, 3, 4]) → true
scoresIncreasing([1, 3, 2]) → false
scoresIncreasing([1, 1, 4]) → true
*/

public class ScoresIncreasingTest {
    ScoresIncreasing testObj;
    String message;
    int[] scores;
    boolean expected;

    @Before
    public void setUp() throws Exception {
        testObj = new ScoresIncreasing();
        message = "Expected: ";
    }

    @Test
    public void scoresIncreasing() throws Exception {
        scores = new int[]{1, 3, 4};
        expected = true;
        assertTrue(message + expected,
                    testObj.scoresIncreasing(scores));

        scores = new int[]{1, 3, 2};
        expected = false;
        assertFalse(message + expected,
                    testObj.scoresIncreasing(scores));

        scores = new int[]{1, 1, 4};
        expected = true;
        assertTrue(message + expected,
                    testObj.scoresIncreasing(scores));
    }

}