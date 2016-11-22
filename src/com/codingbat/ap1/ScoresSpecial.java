package com.codingbat.ap1;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Oleksandr Subbotin
 * @version 1.0
 * @since 20.11.16
 */
/*Given two arrays, A and B, of non-negative int scores. A "special" score is one which is a multiple of 10, such as
40 or 90. Return the sum of largest special score in A and the largest special score in B. To practice decomposition,
write a separate helper method which finds the largest special score in an array. Write your helper method after your
scoresSpecial() method in the JavaBat text area.*/
public class ScoresSpecial {
    public int scoresSpecial(int[] a, int[] b) {
        int maxScoreA = 0, maxScoreB = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 10 == 0 && a[i] > maxScoreA) {
                maxScoreA = a[i];
            }
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i] % 10 == 0 && b[i] > maxScoreB) {
                maxScoreB = b[i];
            }
        }
        return maxScoreA + maxScoreB;
    }

    public int scoresSpecial8(int[] a, int[] b) {
        return  Arrays.stream(a)
                        .filter(value -> (value % 10 == 0))
                        .reduce(0, (x, y) -> Integer.max(x, y))
                +
                Arrays.stream(b)
                        .filter(value -> (value % 10) == 0)
                        .reduce(0, (x, y) -> Integer.max(x, y));
    }
}
