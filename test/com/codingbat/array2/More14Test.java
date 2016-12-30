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
 * @since 20.12.16
 */
/*
more14([1, 4, 1]) → true
more14([1, 4, 1, 4]) → false
more14([1, 1]) → true*/
@RunWith(Parameterized.class)
public class More14Test {
    @Parameterized.Parameter
    public int[] nums;

    @Parameterized.Parameter(value = 1)
    public boolean expected;

    private More14 testObj;

    @Before
    public void setUp() throws Exception {
        testObj = new More14();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 4, 1}, true},
                {new int[]{1, 4, 1, 4}, false},
                {new int[]{1, 1}, true},
        });
    }

    @Test
    public void more14() throws Exception {
        assertThat(testObj.more14(nums), is(expected));
    }

    @Test
    public void more8() throws Exception {
        assertThat(testObj.more14_8(nums), is(expected));
    }

}