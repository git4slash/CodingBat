package com.codingbat.ap1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Oleksandr Subbotin
 * @version 1.0
 * @since 26.10.16
 */
/*
wordsCount(["a", "bb", "b", "ccc"], 1) → 2
wordsCount(["a", "bb", "b", "ccc"], 3) → 1
wordsCount(["a", "bb", "b", "ccc"], 4) → 0
*/
public class WordsCountTest {
    WordsCount testObj;
    String message;
    String[] words;
    int expected, length;
    @Before
    public void setUp() throws Exception {
        testObj = new WordsCount();
        message = "Expected value is: ";
    }

    @Test
    public void wordsCount() throws Exception {
        words = new String[]{"a", "bb", "b", "ccc"};
        expected = 2;
        length = 1;
        assertEquals(message + expected,
                            expected,
                            testObj.wordsCount(words, length));

        expected = 1;
        length = 3;
        assertEquals(message + expected,
                            expected,
                            testObj.wordsCount(words, length));

        expected = 0;
        length = 4;
        assertEquals(message + expected,
                            expected,
                            testObj.wordsCount(words, length));
    }
}