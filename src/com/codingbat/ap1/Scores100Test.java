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
scores100([1, 100, 100]) → true
scores100([1, 100, 99, 100]) → false
scores100([100, 1, 100, 100]) → true
*/
public class Scores100Test {

    Scores100 testObj;
    String message;
    int[] scores;

    @Before
    public void setUp() throws Exception {
        testObj = new Scores100();
        message = "Expected is: ";
    }

    @Test
    public void scores100() throws Exception {
        scores = new int[]{1, 100, 100};
        assertTrue(message + true,
                    testObj.scores100(scores));

        scores = new int[]{1, 100, 99, 100};
        assertFalse(message + false,
                    testObj.scores100(scores));

        scores = new int[]{100, 1, 100, 100};
        assertTrue(message + true,
                    testObj.scores100(scores));
    }

}