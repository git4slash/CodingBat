package com.codingbat.ap1;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * @author Oleksandr Subbotin
 * @version 1.0
 * @since 21.11.16
 */
/*
scoresClump([3, 4, 5]) → true
scoresClump([3, 4, 6]) → false
scoresClump([1, 3, 5, 5]) → true
scoresClump([3, 3, 7, 7, 9]) → true
scoresClump([3, 3, 6, 7, 9]) → false
*/
@RunWith(Parameterized.class)
public class ScoresClumpTest {

    @Parameter(value = 0)
    public int[] scores;

    @Parameter(value = 1)
    public boolean expectedValue;

    private ScoresClump testObj;

    @Before
    public void setUp() throws Exception {
        testObj = new ScoresClump();
    }

    @Parameters(name = "{index}: scoresClump({0}) is {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{3, 4, 5},        true},
                {new int[]{3, 4, 6},        false},
                {new int[]{1, 3, 5, 5},     true},
                {new int[]{3, 3, 6, 7, 9},  false},
                {new int[]{3, 3, 7, 7, 9},  true}
        });
    }

    @Test
    public void testScoresClump() throws Exception {
        assertThat(testObj.scoresClump(scores), is(expectedValue));
    }

    @Test
    public void testScoresClump8() throws Exception {
        assertThat(testObj.scoresClump8(scores), is(expectedValue));
    }
}