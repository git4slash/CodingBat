package com.codingbat.ap1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created  on 20.10.16.
 */
/*
* Given an array of strings, return a new List (e.g. an ArrayList) where all the strings of the given length are
* omitted. See wordsWithout() below which is more difficult because it uses arrays.
*/
public class WordsWithoutList {

    public List wordsWithoutList(String[] words, int len) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (word.length() != len) {
                result.add(word);
            }
        }
        return result;
    }
}
