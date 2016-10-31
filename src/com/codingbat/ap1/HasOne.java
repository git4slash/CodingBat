package com.codingbat.ap1;

/**
 * @author Oleksandr Subbotin
 * @version 1.0
 * @since 31.10.16
 */
/*Given a positive int n, return true if it contains a 1 digit. Note: use % to get the rightmost digit, and / to
discard the rightmost digit.*/
public class HasOne {
    public boolean hasOne(int n) {
        return hasDigit(n, 1);
    }

    /**
     * Method returns {@code true} if {@code number} contains {@code target},
     * otherwise method returns {@code false}
     *
     * @param number    Positive number, in which to search
     * @param target    Desired number
     */
    public boolean hasDigit(int number, int target) {
        for (;number > 0; number /= 10) {
            if (number % 10 == target) return true;
        }
        return false;
    }
}
