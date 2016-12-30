package com.codingbat.map2;

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
 * @since 26.11.16
 */
/*
firstSwap(["ab", "ac"]) → ["ac", "ab"]
firstSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"]
firstSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "ai", "aj", "bx", "by"]
*/
@RunWith(Parameterized.class)
public class FirstSwapTest {

    @Parameterized.Parameter
    public String[] args;

    @Parameterized.Parameter(value = 1)
    public String[] expectedValue;

    private FirstSwap testObj;

    @Before
    public void setUp() throws Exception {
        testObj = new FirstSwap();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new String[]{"ab", "ac"},
                        new String[]{"ac", "ab"}},
                {new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"},
                        new String[]{"ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"}},
                {new String[]{"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"},
                        new String[]{"ay", "by", "ax", "bx", "ai", "aj", "bx", "by"}},
        });
    }

    @Test
    public void firstSwap() throws Exception {
        final String[] strings = Arrays.copyOf(args, args.length);
        assertThat(testObj.firstSwap(strings), is(expectedValue));
    }

    @Test
    public void firstSwap8() throws Exception {
        final String[] strings = Arrays.copyOf(args, args.length);
        assertThat(testObj.firstSwap8(strings), is(expectedValue));
    }
}