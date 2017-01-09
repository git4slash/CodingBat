package com.codingbat;

import java.util.Arrays;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

/**
 * @author Oleksandr Subbotin
 * @version 1.7
 * @since 23.11.16
 */
public class Helpers {

    public static <T> T[] swap(T[] input, Function<T, ?> keyMapper, BinaryOperator<Integer> indexesMerger) {
        IntStream.range(0, input.length)
                .boxed()
                .collect(toMap(i -> keyMapper.apply(input[i]), Function.identity(), indexesMerger));
        return input;
    }

    public static <V> Map<String, V> parseMap(String line, Function<String, V> valueParser) {
        line.replaceAll("\"", "");
        return Pattern.compile(", ")
                .splitAsStream(line)
                .map(s -> s.split(": "))
                .collect(Collectors.toMap(arr -> arr[0], arr -> valueParser.apply(arr[1])));
    }
}