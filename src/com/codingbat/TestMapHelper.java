package com.codingbat;

import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @author Oleksandr Subbotin
 * @version 1.4
 * @since 23.11.16
 */
/*
word0(["a", "b", "a", "b"]) → {"b": 0, "a": 0}
pairs(["man", "moon", "main"]) → {"m": "n"}
*/
public class TestMapHelper {

    public static <V> Map<String, V> parseMap(String line, Function<String, SimpleImmutableEntry<String, V>> kVParser) {
        return Pattern.compile(", ")
                .splitAsStream(line)
                .map(kVParser)
                .collect(Collectors.toMap(SimpleImmutableEntry::getKey, SimpleImmutableEntry::getValue));
    }

    public static SimpleImmutableEntry<String, String> splitKVString(String line) {
        line = line.replaceAll("\"", "");
        final int idx = line.indexOf(":");
        final String key = idx > 0 ? line.substring(0, idx) : line;
        final String value = idx > 0 && line.length() > idx + 1
                                ? line.substring(idx + 1).replaceAll(" ", "")
                                : "";
        return new SimpleImmutableEntry<>(key, value);
    }

    public static SimpleImmutableEntry<String, Integer> splitKVInt(String line) {
        final SimpleImmutableEntry<String, String> entry = splitKVString(line);
        return new SimpleImmutableEntry<>(entry.getKey(),
                            Integer.parseInt(entry.getValue()));
    }
}