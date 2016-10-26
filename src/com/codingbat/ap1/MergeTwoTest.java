package com.codingbat.ap1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author Oleksandr Subbotin
 * @version 1.0
 * @since 26.10.16
 */
/*
mergeTwo(["a", "c", "z"], ["b", "f", "z"], 3) → ["a", "b", "c"]
mergeTwo(["a", "c", "z"], ["c", "f", "z"], 3) → ["a", "c", "f"]
mergeTwo(["f", "g", "z"], ["c", "f", "g"], 3) → ["c", "f", "g"]
*/
public class MergeTwoTest {
    MergeTwo testObj;
    String message;
    String[] arrA, arrB, arrExpected;
    int linesToCopy;

    @Before
    public void setUp() throws Exception {
        testObj = new MergeTwo();
        message = "Expected arr is:\n";
    }

    @Test
    public void mergeTwo() throws Exception {
        arrA = new String[]{"a", "c", "z"};
        arrB = new String[]{"c", "f", "z"};
        linesToCopy = 3;
        arrExpected = new String[]{"a", "c", "f"};
        assertArrayEquals(message + arrExpected,
                            arrExpected,
                            testObj.mergeTwo(arrA, arrB, linesToCopy));

        arrA = new String[]{"a", "c", "z"};
        arrB = new String[]{"b", "f", "z"};
        linesToCopy = 3;
        arrExpected = new String[]{"a", "b", "c"};
        assertArrayEquals(message + arrExpected,
                            arrExpected,
                            testObj.mergeTwo(arrA, arrB, linesToCopy));

        arrA = new String[]{"f", "g", "z"};
        arrB = new String[]{"c", "f", "g"};
        linesToCopy = 3;
        arrExpected = new String[]{"c", "f", "g"};
        assertArrayEquals(message + arrExpected,
                            arrExpected,
                            testObj.mergeTwo(arrA, arrB, linesToCopy));
    }

}