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
 * @since 05.01.17
 */
/*only14([1, 4, 1, 4]) → true
only14([1, 4, 2, 4]) → false
only14([1, 1]) → true*/
@RunWith(Parameterized.class)
public class Only14Test {
    @Parameterized.Parameter
    public int[] nums;

    @Parameterized.Parameter(value = 1)
    public boolean expectedVaue;

    private Only14 testObj;

    @Before
    public void setUp() throws Exception {
        testObj = new Only14();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 4, 1, 4}, true},
                {new int[]{1, 4, 2, 4}, false},
                {new int[]{1, 1}, true}
        });
    }

    @Test
    public void only14() throws Exception {
        assertThat(testObj.only14(nums), is(expectedVaue));
    }

    @Test
    public void only14J9() throws Exception {
        assertThat(testObj.only14J9(nums), is(expectedVaue));
    }
}