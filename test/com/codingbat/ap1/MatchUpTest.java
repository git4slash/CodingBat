package com.codingbat.ap1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created  on 21.10.16.
 */
/*
matchUp(["aa", "bb", "cc"], ["aaa", "xx", "bb"]) → 1
matchUp(["aa", "bb", "cc"], ["aaa", "b", "bb"]) → 2
matchUp(["aa", "bb", "cc"], ["", "", "ccc"]) → 1
*/
public class MatchUpTest {
    MatchUp testObj;
    String message;
    int expectedValue;
    String[] strings1, strings2;

    @Before
    public void setUp() throws Exception {
        testObj = new MatchUp();
        message = "Expected value is: ";
    }

    @Test
    public void matchUp() throws Exception {
        expectedValue = 1;
        strings1 = new String[]{"aa", "bb", "cc"};
        strings2 = new String[]{"aaa", "xx", "bb"};
        assertEquals(message + expectedValue,
                    expectedValue,
                    testObj.matchUp(strings1, strings2));

        strings2 = new String[]{"", "", "ccc"};
        assertEquals(message + expectedValue,
                    expectedValue,
                    testObj.matchUp(strings1, strings2));

        expectedValue = 2;
        strings2 = new String[]{"aaa", "b", "bb"};
        assertEquals(message + expectedValue,
                    expectedValue,
                    testObj.matchUp(strings1, strings2));
    }

}