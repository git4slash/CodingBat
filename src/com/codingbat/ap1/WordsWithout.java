package com.codingbat.ap1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Oleksandr Subbotin
 * @version 1.0
 * @since 31.10.16
 */
/*
Given an array of strings, return a new array without the strings that are equal to the target string. One approach is
to count the occurrences of the target string, make a new array of the correct length, and then copy over the correct
strings.*/
public class WordsWithout {
    public String[] wordsWithout(String[] words, String target) {
        final List<String> result = new ArrayList<String>();
        for (String word : words) {
            if (!word.equals(target)) result.add(word);
        }
        return result.toArray(new String[]{});
    }
}
