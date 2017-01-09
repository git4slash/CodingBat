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
/*sum28([2, 3, 2, 2, 4, 2]) → true
sum28([2, 3, 2, 2, 4, 2, 2]) → false
sum28([1, 2, 3, 4]) → false*/
@RunWith(Parameterized.class)
public class Sum28Test {
    @Parameterized.Parameter
    public int[] nums;

    @Parameterized.Parameter(value = 1)
    public boolean expectedValue;

    private Sum28 testObj;

    @Before
    public void setUp() throws Exception {
        testObj = new Sum28();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{2, 3, 2, 2, 4, 2}, true},
                {new int[]{2, 3, 2, 2, 4, 2, 2}, false},
                {new int[]{1, 2, 3, 4}, false},
        });
    }

    @Test
    public void sum28() throws Exception {
        assertThat(testObj.sum28(nums), is(expectedValue));
    }

    @Test
    public void sum28J9() throws Exception {
        assertThat(testObj.sum28J9(nums), is(expectedValue));
    }

}