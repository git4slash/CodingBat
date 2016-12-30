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
 * @since 19.12.16
 */
/*
has12([1, 3, 2]) → true
has12([3, 1, 2]) → true
has12([3, 1, 4, 5, 2]) → true
*/
@RunWith(Parameterized.class)
public class Has12Test {
    @Parameterized.Parameter
    public int[] nums;

    @Parameterized.Parameter(value = 1)
    public boolean expectedValue;

    private Has12 testObj;

    @Before
    public void setUp() throws Exception {
        testObj = new Has12();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 3, 2}, true},
                {new int[]{3, 1, 2}, true},
                {new int[]{3, 1, 4, 5, 2}, true},
                {new int[]{2, 1, 4, 1, 6}, false},
                {new int[]{2, 1, 3}, false},
                {new int[]{3, 2, 1}, false},
        });
    }

    @Test
    public void has12() throws Exception {
        assertThat(testObj.has12(nums), is(expectedValue));
    }
}