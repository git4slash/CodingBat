package com.codingbat.map2;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

import static com.codingbat.Helpers.parseMap;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * @author Oleksandr Subbotin
 * @version 1.0
 * @since 01.12.16
 */
/*
wordLen(["a", "bb", "a", "bb"]) → {"a": 1, "bb": 2}
wordLen(["this", "and", "that", "and"]) → {"that": 4, "this": 4, "and": 3}
wordLen(["code", "code", "code", "bug"]) → {"bug": 3, "code": 4}
*/
@RunWith(Parameterized.class)
public class WordLenTest {

    @Parameterized.Parameter
    public String[] strings;

    @Parameterized.Parameter(value = 1)
    public Map<String, Integer> expectedValue;

    private WordLen testObj;

    @Before
    public void setUp() throws Exception {
        testObj = new WordLen();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new String[]{"a", "bb", "a", "bb"},
                        parseMap("\"a\": 1, \"bb\": 2", Integer::parseInt)},
                {new String[]{"this", "and", "that", "and"},
                        parseMap("\"that\": 4, \"this\": 4, \"and\": 3", Integer::parseInt)},
                {new String[]{"code", "code", "code", "bug"},
                        parseMap("\"bug\": 3, \"code\": 4", Integer::parseInt)},
        });
    }

    @Test
    public void wordLen() throws Exception {
        assertThat(testObj.wordLen(strings), is(expectedValue));
    }

    @Test
    public void wordLen8() throws Exception {
        assertThat(testObj.wordLen8(strings), is(expectedValue));
    }
}