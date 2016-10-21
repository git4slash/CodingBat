package com.codingbat.ap1;

/*Start with two arrays of strings, a and b, each in alphabetical order, possibly with duplicates.
 Return the count of the number of strings which appear in both arrays. The best "linear" solution makes
 a single pass over both arrays, taking advantage of the fact that they are in alphabetical order.

commonTwo(["a", "c", "x"], ["b", "c", "d", "x"]) → 2
commonTwo(["a", "c", "x"], ["a", "b", "c", "x", "z"]) → 3
commonTwo(["a", "b", "c"], ["a", "b", "c"]) → 3
*/
public class CommonTwo {
    public int commonTwo(String[] a, String[] b) {
        int countIntersections = 0;
        for (int i = 0, j = 0; i < a.length && j < b.length;) {
            while (i + 1 < a.length && a[i].equals(a[i + 1]))
                i++;
            while (j + 1 < b.length && b[j].equals(b[j + 1]))
                j++;
            final int aCompareToB = a[i].compareTo(b[j]);
            if (aCompareToB == 0) {
                countIntersections++;
                i++;
                j++;
                continue;
            } else if (aCompareToB < 0) {
                i++;
                continue;
            } else if (aCompareToB > 0) {
                j++;
                continue;
            }
        }
        return countIntersections;
    }
//    public int commonTwo(String[] a, String[] b) {
//        int result = 0;
//        HashSet<String> setA = new HashSet<>();
//        HashSet<String> setB = new HashSet<>();
//        Collections.addAll(setA, a);
//        Collections.addAll(setB, b);
//        for (String lineA : setA) {
//            for (String lineB : setB) {
//                if (lineA.equals(lineB)) {
//                    result++;
//                    continue;
//                }
//            }
//        }
//        return result;
//    }
}
