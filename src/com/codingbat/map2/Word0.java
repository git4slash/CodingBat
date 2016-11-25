package com.codingbat.map2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Oleksandr Subbotin
 * @version 1.0
 * @since 23.11.16
 */
/*Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array,
 always with the value 0. For example the string "hello" makes the pair "hello":0. We'll do more complicated counting
 later, but for this problem the value is simply 0.
 word0(["c", "b", "a"]) → {"b": 0, "c": 0, "a": 0}
*/
public class Word0 {

    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> result = new HashMap<String, Integer>(strings.length);
        for (String line : strings)
            result.put(line, 0);
        return result;
    }
}
