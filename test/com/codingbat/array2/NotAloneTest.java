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
 * @since 08.01.17
 */
/*notAlone([1, 2, 3], 2) → [1, 3, 3]
notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]
notAlone([3, 4], 3) → [3, 4]*/
@RunWith(Parameterized.class)
public class NotAloneTest {
    @Parameterized.Parameter
    public int[] nums;

    @Parameterized.Parameter(value = 1)
    public int val;

    @Parameterized.Parameter(value = 2)
    public int[] expectedValue;

    private NotAlone testObj;

    @Before
    public void setUp() throws Exception {
        testObj = new NotAlone();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 2, 3}, 2, new int[]{1, 3, 3}},
                {new int[]{1, 2, 3, 2, 5, 2}, 2, new int[]{1, 3, 3, 5, 5, 2}},
                {new int[]{3, 4}, 3, new int[]{3, 4}},
                {new int[]{1, 1, 1, 2}, 1, new int[]{1, 1, 1, 2}},
        });
    }

    @Test
    public void notAloneTest() throws Exception {
        assertThat(testObj.notAlone(nums, val), is(expectedValue));
    }

    @Test
    public void notAloneTest9() throws Exception {
        assertThat(testObj.notAlone9(nums, val), is(expectedValue));
    }
}