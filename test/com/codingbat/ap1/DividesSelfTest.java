package com.codingbat.ap1;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author Oleksandr Subbotin
 * @version 1.0
 * @since 22.11.16
 */
/*
dividesSelf(128) → true
dividesSelf(12) → true
dividesSelf(120) → false*/

@RunWith(Parameterized.class)
public class DividesSelfTest {
    @Parameterized.Parameter(value = 0)
    public int testArgument;

    @Parameterized.Parameter(value = 1)
    public boolean expectedValue;

    private DividesSelf testObj;

    @Before
    public void setUp() throws Exception {
        testObj = new DividesSelf();
    }

    @Parameterized.Parameters(name = "{index}: testDividesSelf({0}) is {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {128, true},
                {12, true},
                {120, false}
        });
    }

    @Test
    public void testDividesSelf() throws Exception {
        testObj.dividesSelf(testArgument);
    }
}