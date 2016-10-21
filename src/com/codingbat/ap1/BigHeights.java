package com.codingbat.ap1;

/**
 * Created on 21.10.16.
 */
/*
(A variation on the sumHeights problem.) We have an array of heights, representing the altitude along a walking trail.
Given start/end indexes into the array, return the number of "big" steps for a walk starting at the start index and
 ending at the end index. We'll say that step is big if it is 5 or more up or down. The start end end index will
 both be valid indexes into the array with start <= end.
*/
public class BigHeights {
    public int bigHeights(int[] heights, int start, int end) {
        int counter = 0;
        for (; start < end; start++) {
            if (Math.abs(heights[start] - heights[start + 1]) >= 5) {
                counter++;
            }
        }
        return counter;
    }
}
