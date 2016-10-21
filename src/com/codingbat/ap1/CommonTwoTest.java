package com.codingbat.ap1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created  on 13.10.16.
 */
/*
CommonTwo(["a", "c", "x"], ["b", "c", "d", "x"]) → 2
CommonTwo(["a", "c", "x"], ["a", "b", "c", "x", "z"]) → 3
CommonTwo(["a", "b", "c"], ["a", "b", "c"]) → 3
commonTwo(["a", "a", "b", "b", "c"], ["a", "b", "c"]) → 3
commonTwo(["a", "a", "b", "b", "c"], ["b", "b", "b"]) → 1
*/
public class CommonTwoTest {

    CommonTwo testObj;
    int expectedValue;
    String[] testArr1, testArr2;

    @Before
    public void setUp() throws Exception {
        testObj = new CommonTwo();
    }

    @Test
    public void testCommonTwo() {
        expectedValue = 2;
        testArr1 = new String[]{"a", "c", "x"};
        testArr2 = new String[]{"b", "c", "d", "x"};
        assertEquals("Number of equal strings: " + expectedValue,
                    expectedValue,
                    testObj.commonTwo(testArr1, testArr2));

        expectedValue = 3;
        testArr1 = new String[]{"a", "c", "x"};
        testArr2 = new String[]{"a", "b", "c", "x", "z"};
        assertEquals("Number of equal strings: " + expectedValue,
                    expectedValue,
                    testObj.commonTwo(testArr1, testArr2));

        expectedValue = 3;
        testArr1 = new String[]{"a", "b", "c"};
        testArr2 = new String[]{"a", "b", "c"};
        assertEquals("Number of equal strings: " + expectedValue,
                    expectedValue,
                    testObj.commonTwo(testArr1, testArr2));

        expectedValue = 3;
        testArr1 = new String[]{"a", "a", "b", "b", "c"};
        testArr2 = new String[]{"a", "b", "c"};
        assertEquals("Number of equal strings: " + expectedValue,
                    expectedValue,
                    testObj.commonTwo(testArr1, testArr2));

        expectedValue = 1;
        testArr1 = new String[]{"a", "a", "b", "b", "c"};
        testArr2 = new String[]{"b", "b", "b"};
        assertEquals("Number of equal strings: " + expectedValue,
                    expectedValue,
                    testObj.commonTwo(testArr1, testArr2));
    }
}