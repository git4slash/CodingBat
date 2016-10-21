package com.codingbat.ap1;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created on 20.10.16.
 */
/*
wordsWithoutList(["a", "bb", "b", "ccc"], 1) → ["bb", "ccc"]
wordsWithoutList(["a", "bb", "b", "ccc"], 3) → ["a", "bb", "b"]
wordsWithoutList(["a", "bb", "b", "ccc"], 4) → ["a", "bb", "b", "ccc"]
*/
public class WordsWithoutListTest {

    WordsWithoutList testObj;
    String[] words;
    int lineLengthToOmit;
    List<String> expectedList;

    @Before
    public void setUp() throws Exception {
        testObj = new WordsWithoutList();
    }

    @Test
    public void wordsWithoutList() throws Exception {
        words = new String[]{"a", "bb", "b", "ccc"};
        expectedList = Arrays.asList("bb", "ccc");
        lineLengthToOmit = 1;
        assertTrue(testObj.wordsWithoutList(words, lineLengthToOmit).equals(expectedList));

        words = new String[]{"a", "bb", "b", "ccc"};
        expectedList = Arrays.asList("a", "bb", "b");
        lineLengthToOmit = 3;
        assertTrue(testObj.wordsWithoutList(words, lineLengthToOmit).equals(expectedList));

        words = new String[]{"a", "bb", "b", "ccc"};
        expectedList = Arrays.asList("a", "bb", "b", "ccc");
        lineLengthToOmit = 4;
        assertTrue(testObj.wordsWithoutList(words, lineLengthToOmit).equals(expectedList));
    }
}