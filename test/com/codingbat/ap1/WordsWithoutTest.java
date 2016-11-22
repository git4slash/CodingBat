package com.codingbat.ap1;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author Oleksandr Subbotin
 * @version 1.0
 * @since 31.10.16
 */
/*
wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]
*/
public class WordsWithoutTest {
    WordsWithout testObj;
    String message, target;
    String[] words, expectedArr;

    @Before
    public void setUp() throws Exception {
        testObj = new WordsWithout();
        message = "Expected arr is:\n";
    }

    @Test
    public void wordsWithout() throws Exception {
        words = new String[]{"a", "b", "c", "a"};
        expectedArr = new String[]{"b", "c"};
        target = "a";
        assertArrayEquals(message + Arrays.toString(expectedArr),
                        expectedArr,
                        testObj.wordsWithout(words, target));

        words = new String[]{"a", "b", "c", "a"};
        expectedArr = new String[]{"a", "c", "a"};
        target = "b";
        assertArrayEquals(message + Arrays.toString(expectedArr),
                        expectedArr,
                        testObj.wordsWithout(words, target));

        words = new String[]{"a", "b", "c", "a"};
        expectedArr = new String[]{"a", "b", "a"};
        target = "c";
        assertArrayEquals(message + Arrays.toString(expectedArr),
                        expectedArr,
                        testObj.wordsWithout(words, target));
    }

}