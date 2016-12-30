package com.codingbat.array2;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Oleksandr Subbotin
 * @version 1.0
 * @since 11.12.16
 */
/*
withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
withoutTen([10, 2, 10]) → [2, 0, 0]
withoutTen([1, 99, 10]) → [1, 99, 0]
*/
@RunWith(Parameterized.class)
public class WithoutTenTest {
    @Parameterized.Parameter
    public int[] nums;

    @Parameterized.Parameter(value = 1)
    public int[] expectedValue;

    private WithoutTen testObj;

    @Before
    public void setUp() throws Exception {
        testObj = new WithoutTen();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 10, 10, 2}, new int[]{1, 2, 0, 0}},
                {new int[]{10, 2, 10}, new int[]{2, 0, 0}},
                {new int[]{1, 99, 10}, new int[]{1, 99, 0}},
        });
    }

    @Test
    public void withoutTen8() throws Exception {
        assertThat(testObj.withoutTen8(nums.clone()), is(expectedValue));
    }

    @Test
    public void withoutTen() throws Exception {
        assertThat(testObj.withoutTen(nums), is(expectedValue));
    }

}