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
import static org.junit.Assert.*;

/**
 * @author Oleksandr Subbotin
 * @version 1.0
 * @since 09.12.16
 */
/*
wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
wordCount(["c", "c", "c", "c"]) → {"c": 4}
*/
@RunWith(Parameterized.class)
public class WordCountTest {
    @Parameterized.Parameter
    public String[] strings;

    @Parameterized.Parameter(value = 1)
    public Map<String, Integer> expectedValue;

    private WordCount testObj;

    @Before
    public void setUp() throws Exception {
        testObj = new WordCount();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new String[]{"a", "b", "a", "c", "b"},
                        parseMap("\"b\": 2, \"c\": 1, \"a\": 2", Integer::valueOf)},
                {new String[]{"c", "b", "a"},
                        parseMap("\"b\": 1, \"c\": 1, \"a\": 1", Integer::valueOf)},
                {new String[]{"c", "c", "c", "c"},
                        parseMap("\"c\": 4", Integer::valueOf)},
        });
    }

    @Test
    public void wordCount() throws Exception {
        assertThat(testObj.wordCount(strings), is(expectedValue));
    }

    @Test
    public void wordCount8() throws Exception {
        assertThat(testObj.wordCount8(strings), is(expectedValue));
    }
}