package com.codingbat.map2;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Oleksandr Subbotin
 * @version 1.0
 * @since 30.11.16
 */
/*
wordAppend(["a", "b", "a"]) → "a"
wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
wordAppend(["a", "", "a"]) → "a"
*/
@RunWith(Parameterized.class)
public class WordAppendTest {
    @Parameterized.Parameter
    public String[] strings;

    @Parameterized.Parameter(value = 1)
    public String expectedValue;

    private WordAppend testObj;

    @Before
    public void setUp() throws Exception {
        testObj = new WordAppend();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new String []{"a", "b", "a"}, "a"},
                {new String []{"a", "b", "a", "c", "a", "d", "a"}, "aa"},
                {new String []{"a", "", "a"}, "a"}
        });
    }

    @Test
    public void wordAppend() throws Exception {
        String[] testArr = Arrays.copyOf(strings, strings.length);
        assertThat(testObj.wordAppend(testArr), is(expectedValue));
    }

    @Test
    public void wordAppend8() throws Exception {
        String[] testArr = Arrays.copyOf(strings, strings.length);
        assertThat(testObj.wordAppend8(testArr), is(expectedValue));
    }
}