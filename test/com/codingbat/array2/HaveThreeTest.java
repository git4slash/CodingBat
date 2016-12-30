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
 * @since 16.12.16
 */
/*
haveThree([3, 1, 3, 1, 3]) → true
haveThree([3, 1, 3, 3]) → false
haveThree([3, 4, 3, 3, 4]) → false
*/
@RunWith(Parameterized.class)
public class HaveThreeTest {
    @Parameterized.Parameter
    public int[] nums;

    @Parameterized.Parameter(value = 1)
    public boolean expectedValue;

    private HaveThree testObj;

    @Before
    public void setUp() throws Exception {
        testObj = new HaveThree();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{3, 1, 3, 1, 3}, true},
                {new int[]{3, 1, 3, 3}, false},
                {new int[]{3, 4, 3, 3, 4}, false},
                {new int[]{1, 3, 1, 3, 1, 3}, true},
                {new int[]{3, 4, 3, 4, 3, 4, 4}, true}
        });
    }

    @Test
    public void haveThree() throws Exception {
        assertThat(testObj.haveThree(nums), is(expectedValue));
    }

    @Test
    public void haveThree8() throws Exception {
        assertThat(testObj.haveThree8(nums), is(expectedValue));
    }
}