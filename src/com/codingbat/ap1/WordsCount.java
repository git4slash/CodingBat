package com.codingbat.ap1;

/**
 * @author Oleksandr Subbotin
 * @version 1.0
 * @since 26.10.16
 */
/*Given an array of strings, return the count of the number of strings with the given length.*/
public class WordsCount {
    public int wordsCount(String[] words, int len) {
        int counter = 0;
        for (String word : words) {
            if (word.length() == len) counter++;
        }
        return counter;
    }
}
