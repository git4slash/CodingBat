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
/*post4([2, 4, 1, 2]) → [1, 2]
post4([4, 1, 4, 2]) → [2]
post4([4, 4, 1, 2, 3]) → [1, 2, 3]*/
@RunWith(Parameterized.class)
public class Post4Test {
    @Parameterized.Parameter
    public int[] nums;

    @Parameterized.Parameter(value = 1)
    public int[] expectedValue;

    private Post4 testObj;

    @Before
    public void setUp() throws Exception {
        testObj = new Post4();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{2, 4, 1, 2}, new int[]{1, 2}},
                {new int[]{4, 1, 4, 2}, new int[]{2}},
                {new int[]{4, 4, 1, 2, 3}, new int[]{1, 2, 3}},
        });
    }

    @Test
    public void post4() throws Exception {
        assertThat(testObj.post4(nums), is(expectedValue));
    }

    @Test
    public void post4J8() throws Exception {
        assertThat(testObj.post4J8(nums), is(expectedValue));
    }

}