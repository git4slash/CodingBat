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
 * @since 30.11.16
 */
/*
allSwap(["ab", "ac"]) → ["ac", "ab"]
allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]
*/
@RunWith(Parameterized.class)
public class AllSwapTest {
    @Parameterized.Parameter
    public String[] args;

    @Parameterized.Parameter(value = 1)
    public String[] expectedValue;

    private AllSwap testObj;

    @Before
    public void setUp() throws Exception {
        testObj = new AllSwap();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new String[]{"ab", "ac"},
                        new String[]{"ac", "ab"}},
                {new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"},
                        new String[]{"ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"}},
                {new String[]{"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"},
                        new String[]{"ay", "by", "ax", "bx", "aj", "ai", "by", "bx"}},
        });
    }

    @Test
    public void allSwap8() throws Exception {
        final String[] strings = Arrays.copyOf(args, args.length);
        assertThat(testObj.allSwap8(strings), is(expectedValue));
    }

    @Test
    public void allSwap() throws Exception {
        final String[] strings = Arrays.copyOf(args, args.length);
        assertThat(testObj.allSwap(strings), is(expectedValue));
    }
}