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
scoreUp(["a", "a", "b", "b"], ["a", "c", "b", "c"]) → 6
scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "c"]) → 11
scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "b"]) → 16*/
public class ScoreUpTest {
    ScoreUp testObj;
    String message;
    String[] key, answers;
    int expected;

    @Before
    public void setUp() throws Exception {
        testObj = new ScoreUp();
        message = "Expected value: ";
        key = new String[]{"a", "a", "b", "b"};
    }

    @Test
    public void scoreUp() throws Exception {
        answers = new String[]{"a", "c", "b", "c"};
        expected = 6;
        assertEquals(message + expected,
                expected,
                testObj.scoreUp(key, answers));

        answers = new String[]{"a", "a", "b", "c"};
        expected = 11;
        assertEquals(message + expected,
                expected,
                testObj.scoreUp(key, answers));

        answers = new String[]{"a", "a", "b", "b"};
        expected = 16;
        assertEquals(message + expected,
                expected,
                testObj.scoreUp(key, answers));
    }

}