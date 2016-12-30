package com.codingbat.map2;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

import static com.codingbat.Helpers.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Oleksandr Subbotin
 * @version 1.2
 * @since 23.11.16
 */
/*
word0(["a", "b", "a", "b"]) → {"b": 0, "a": 0}
word0(["a", "b", "a", "c", "b"]) → {"b": 0, "c": 0, "a": 0}
word0(["c", "b", "a"]) → {"b": 0, "c": 0, "a": 0}
*/
@RunWith(Parameterized.class)
public class Word0Test {

    @Parameterized.Parameter
    public String[] strings;

    @Parameterized.Parameter(value = 1)
    public Map<String, Integer> expectedValue;

    private Word0 testObj;

    @Before
    public void setUp() throws Exception {
        testObj = new Word0();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new String[]{"a", "b", "a", "b"},      parseMap("\"b\": 0, \"a\": 0",
                                                                Integer::parseInt)},
                {new String[]{"a", "b", "a", "c", "b"}, parseMap("\"b\": 0, \"c\": 0, \"a\": 0",
                                                                Integer::parseInt)},
                {new String[]{"c", "b", "a"},           parseMap("\"b\": 0, \"c\": 0, \"a\": 0",
                                                                Integer::parseInt)}
        });
    }

    @Test
    public void word0() throws Exception {
        assertThat(testObj.word0(strings), is(expectedValue));
    }
    @Test
    public void word08() throws Exception {
        assertThat(testObj.word08(strings), is(expectedValue));
    }
}