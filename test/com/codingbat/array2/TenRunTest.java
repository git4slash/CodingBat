package com.codingbat.array2;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * @author Oleksandr Subbotin
 * @version 1.0
 * @since 30.12.16
 */
/*tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]*/
@RunWith(Parameterized.class)
public class TenRunTest {
    @Parameterized.Parameter
    public int[] nums;

    @Parameterized.Parameter(value = 1)
    public int[] expectedValue;

    private TenRun testObj;

    @Before
    public void setUp() throws Exception {
        testObj = new TenRun();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{2, 10, 3, 4, 20, 5}, new int[]{2, 10, 10, 10, 20, 20}},
                {new int[]{10, 1, 20, 2}, new int[]{10, 10, 20, 20}},
                {new int[]{10, 1, 9, 20}, new int[]{10, 10, 10, 20}},
        });
    }

    @Test
    public void tenRun() throws Exception {
        assertThat(testObj.tenRun(nums), is(expectedValue));
    }

    @Test
    public void tenRun8() throws Exception {
        assertThat(testObj.tenRun8(nums), is(expectedValue));
    }
}