package com.codingbat.ap1;

/**
 * @author Oleksandr Subbotin
 * @version 1.0
 * @since 26.10.16
 */
/*Start with two arrays of strings, A and B, each with its elements in alphabetical order and without duplicates.
Return a new array containing the first N elements from the two arrays. The result array should be in alphabetical
order and without duplicates. A and B will both have a length which is N or more. The best "linear" solution makes
a single pass over A and B, taking advantage of the fact that they are in alphabetical order, copying elements
directly to the new array.*/
public class MergeTwo {
    public String[] mergeTwo(String[] a, String[] b, int n) {
        final String[] result = new String[n];
        for (int i = 0, j = 0, k = 0; i < a.length && j < b.length && k < n; k++) {
            final int compareResult = a[i].compareTo(b[j]);
            if (compareResult == 0) {            //words are equals
                result[k] = a[i];
                i++;
                j++;
            } else if (compareResult < 0) {
                result[k] = a[i];
                i++;
            } else if (compareResult > 0) {
                result[k] = b[j];
                j++;
            }
        }
        return result;
    }
}
