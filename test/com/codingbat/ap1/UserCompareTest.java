package com.codingbat.ap1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Oleksandr Subbotin
 * @version 1.0
 * @since 31.10.16
 */
/*
userCompare("bb", 1, "zz", 2) → -1
userCompare("bb", 1, "aa", 2) → 1
userCompare("bb", 1, "bb", 1) → 0
*/
public class UserCompareTest {
    UserCompare testObj;
    String message, aName, bName;
    int aId, bId, expectedValue;

    @Before
    public void setUp() throws Exception {
        testObj = new UserCompare();
        message = "Expected value is: ";
    }

    @Test
    public void userCompare() throws Exception {
        aName = "bb";
        aId = 1;
        bName = "zz";
        bId = 2;
        expectedValue = -1;
        assertEquals(message + expectedValue,
                expectedValue,
                testObj.userCompare(aName, aId, bName, bId));

        aName = "bb";
        aId = 1;
        bName = "aa";
        bId = 2;
        expectedValue = 1;
        assertEquals(message + expectedValue,
                expectedValue,
                testObj.userCompare(aName, aId, bName, bId));

        aName = "bb";
        aId = 1;
        bName = "bb";
        bId = 1;
        expectedValue = 0;
        assertEquals(message + expectedValue,
                expectedValue,
                testObj.userCompare(aName, aId, bName, bId));
    }
}