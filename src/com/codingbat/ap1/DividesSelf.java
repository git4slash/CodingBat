package com.codingbat.ap1;

import java.io.InputStream;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Oleksandr Subbotin
 * @version 1.0
 * @since 22.11.16
 */
/*We'll say that a positive int divides itself if every digit in the number divides into the number evenly. So for
example 128 divides itself since 1, 2, and 8 all divide into 128 evenly. We'll say that 0 does not divide into anything
evenly, so no number with a 0 digit divides itself. Note: use % to get the rightmost digit, and / to discard the
rightmost digit.*/
public class DividesSelf {
    public boolean dividesSelf(int n) {
        for (int tmp = n; tmp >= 1; tmp /= 10){
            final int div = tmp % 10;
            if (div == 0 || n % div != 0) return false;
        }
        return true;
    }
}
