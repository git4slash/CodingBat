package com.codingbat.array2;

import org.apache.commons.math3.stat.descriptive.SummaryStatistics;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Oleksandr Subbotin
 * @version 1.0
 * @since 20.12.16
 */
/*Given an array of ints, return true if the number of 1's is greater than the number of 4's*/
public class More14 {
    private final int FIRST_NUM = 1;
    private final int SECOND_NUM = 4;

    boolean isMatch(int num) {
        return FIRST_NUM == num || SECOND_NUM == num;
    }

    public boolean more14_8(int[] nums) {
        Map<Integer, Long> countMap = Arrays.stream(nums)
                        .parallel()
                        .filter(this::isMatch)
                        .boxed()
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        final Long counter1 = countMap.getOrDefault(FIRST_NUM, 0l);
        final Long counter2 = countMap.getOrDefault(SECOND_NUM, 0l);
        System.out.printf("J9 %d : %d %d : %d diff = %d%n",
                FIRST_NUM, counter1, SECOND_NUM, counter2, counter1-counter2);
        return counter1 > counter2;
    }

    public boolean more14(int[] nums) {
        int counterFirst = 0;
        int counterSecond = 0;
        for (int num : nums) {
            switch (num) {
                case FIRST_NUM:
                    counterFirst++;
                    break;
                case SECOND_NUM:
                    counterSecond++;
                    break;
            }
        }
        System.out.printf("J7 %d : %d %d : %d diff = %d%n",
                FIRST_NUM, counterFirst, SECOND_NUM, counterSecond, counterFirst-counterSecond);
        return counterFirst > counterSecond;
    }
}
