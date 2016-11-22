package com.codingbat.ap1;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Oleksandr Subbotin
 * @version 1.0
 * @since 22.11.16
 */
/*Given an array of strings, return a new array containing the first N strings. N will be in the range 1..length.*/
public class WordsFront {

    public String[] wordsFront8(String[] words, int n) {
        return Arrays.stream(words)
                    .limit(n)
                    .toArray(String[]::new);
    }

    public String[] wordsFront(String[] words, int n) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = words[i];
        }
        return result;
    }
}
