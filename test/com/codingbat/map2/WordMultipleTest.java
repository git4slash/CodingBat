package com.codingbat.map2;

import com.codingbat.Helpers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * @author Oleksandr Subbotin
 * @version 1.0
 * @since 01.12.16
 */
/*
wordMultiple(["a", "b", "a", "c", "b"]) → {"b": true, "c": false, "a": true}
wordMultiple(["c", "b", "a"]) → {"b": false, "c": false, "a": false}
wordMultiple(["c", "c", "c", "c"]) → {"c": true}
*/
@RunWith(Parameterized.class)
public class WordMultipleTest {
    @Parameterized.Parameter
    public String[] strings;

    @Parameterized.Parameter(value = 1)
    public Map<String, Boolean> expectedValue;

    private WordMultiple testObj;

    @Before
    public void setUp() throws Exception {
        testObj = new WordMultiple();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new String[]{"a", "b", "a", "c", "b"},
                        Helpers.parseMap("\"b\": true, \"c\": false, \"a\": true", Boolean::new)},
                {new String[]{"c", "b", "a"},
                        Helpers.parseMap("\"b\": false, \"c\": false, \"a\": false", Boolean::new)},
                {new String[]{"c", "c", "c", "c"},
                        Helpers.parseMap("\"c\": true", Boolean::new)},
        });
    }

    @Test
    public void wordMultiple() throws Exception {
        assertThat(testObj.wordMultiple(strings), is(expectedValue));
    }

    @Test
    public void wordMultiple8() throws Exception {
        assertThat(testObj.wordMultiple8(strings), is(expectedValue));
    }

}