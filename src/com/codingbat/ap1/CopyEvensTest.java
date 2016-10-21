package com.codingbat.ap1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created  on 20.10.16.
 */
/*
copyEvens([3, 2, 4, 5, 8], 2) → [2, 4]
copyEvens([3, 2, 4, 5, 8], 3) → [2, 4, 8]
copyEvens([6, 1, 2, 4, 5, 8], 3) → [6, 2, 4]
*/
public class CopyEvensTest {
    CopyEvens testObj;
    int[] expectedArr, nums;
    String message = "Expected arr contains: ";

    @Before
    public void setUp() throws Exception {
        testObj = new CopyEvens();

    }

    @Test
    public void testCopyEvens() {
        expectedArr = new int[] {2, 4};
        nums = new int[] {3, 2, 4, 5, 8};
        assertArrayEquals(message + expectedArr.toString(),
                        expectedArr,
                        testObj.copyEvens(nums, expectedArr.length));

        expectedArr = new int[] {2, 4, 8};
        nums = new int[] {3, 2, 4, 5, 8};
        assertArrayEquals(message + expectedArr.toString(),
                        expectedArr,
                        testObj.copyEvens(nums, expectedArr.length));

        expectedArr = new int[] {6, 2, 4};
        nums = new int[] {6, 1, 2, 4, 5, 8};
        assertArrayEquals(message + expectedArr.toString(),
                        expectedArr,
                        testObj.copyEvens(nums, expectedArr.length));
    }
}