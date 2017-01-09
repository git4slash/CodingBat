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
 * @since 04.01.17
 */
/*modThree([2, 1, 3, 5]) → true
modThree([2, 1, 2, 5]) → false
modThree([2, 4, 2, 5]) → true*/
@RunWith(Parameterized.class)
public class ModThreeTest {
    @Parameterized.Parameter
    public int[] nums;

    @Parameterized.Parameter(value = 1)
    public boolean expectedValue;

    private ModThree testObj;

    @Before
    public void setUp() throws Exception {
        testObj = new ModThree();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{2, 1, 3, 5}, true},
                {new int[]{2, 1, 2, 5}, false},
                {new int[]{2, 4, 2, 5}, true},
        });
    }

    @Test
    public void modThree() throws Exception {
        assertThat(testObj.modThree(nums), is(expectedValue));
    }

    @Test
    public void modThree8() throws Exception {
        assertThat(testObj.modThree8(nums), is(expectedValue));
    }

}