package com.codingbat.ap1;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.IntStream;

/**
 * @author Oleksandr Subbotin
 * @version 1.0
 * @since 21.11.16
 */
/*Given an array of scores sorted in increasing order, return true if the array contains 3 adjacent scores that differ
from each other by at most 2, such as with {3, 4, 5} or {3, 5, 5}.*/
public class ScoresClump {
    public boolean scoresClump(int[] scores) {
        for (int i = 2; i < scores.length; i++) {
            if (scores[i] - scores[i - 2] <= 2) return true;
        }
        return false;
    }

    public boolean scoresClump8(int[] scores) {
        return IntStream.range(2, scores.length)
                        .anyMatch(i -> scores[i] - scores[i - 2] <= 2);
    }
}
