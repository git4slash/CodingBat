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
 * @since 07.01.17
 */
/*sum13([1, 2, 2, 1]) → 6
sum13([1, 1]) → 2
sum13([1, 2, 2, 1, 13]) → 6*/
@RunWith(Parameterized.class)
public class Sum13Test {
    @Parameterized.Parameter
    public int[] nums;

    @Parameterized.Parameter(value = 1)
    public int expectedValue;

    private Sum13 testObj;

    @Before
    public void setUp() throws Exception {
        testObj = new Sum13();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 2, 2, 1}, 6},
                {new int[]{1, 1}, 2},
                {new int[]{1, 2, 2, 1, 13}, 6},
                {new int[]{13, 1, 2, 13, 2, 1, 13}, 3},
                {new int[]{1, 2, 13, 2, 1, 13}, 4},
        });
    }

    @Test
    public void sum13() throws Exception {
        assertThat(testObj.sum13(nums), is(expectedValue));
    }

    @Test
    public void sum13J9() throws Exception {
        assertThat(testObj.sum13J9(nums), is(expectedValue));
    }
}