package com.codingbat.ap1;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * @author Oleksandr Subbotin
 * @version 1.0
 * @since 22.11.16
 */
/*
copyEndy([9, 11, 90, 22, 6], 2) → [9, 90]
copyEndy([9, 11, 90, 22, 6], 3) → [9, 90, 6]
copyEndy([12, 1, 1, 13, 0, 20], 2) → [1, 1]
*/
@RunWith(Parameterized.class)
public class CopyEndyTest {
    @Parameterized.Parameter
    public int[] nums;

    @Parameterized.Parameter(value = 1)
    public int count;

    @Parameterized.Parameter(value = 2)
    public int[] expectedValue;

    private CopyEndy testObj;

    @Before
    public void setUp() throws Exception {
        testObj = new CopyEndy();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{9, 11, 90, 22, 6}, 2, new int[]{9, 90}},
                {new int[]{9, 11, 90, 22, 6}, 3, new int[]{9, 90, 6}},
                {new int[]{12, 1, 1, 13, 0, 20}, 2, new int[]{1, 1}},
        });
    }

    @Test
    public void test_copyEndy() {
        assertThat(testObj.copyEndy(nums, count), is(expectedValue));
    }

    @Test
    public void test_copyEndy8() {
        assertThat(testObj.copyEndy8(nums,count), is(expectedValue));
    }
}