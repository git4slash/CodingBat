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
import static org.junit.Assert.assertThat;

/**
 * @author Oleksandr Subbotin
 * @version 1.0
 * @since 20.11.16
 */
/*
scoresSpecial([12, 10, 4], [2, 20, 30]) → 40
scoresSpecial([20, 10, 4], [2, 20, 10]) → 40
scoresSpecial([12, 11, 4], [2, 20, 31]) → 20
*/
@RunWith(Parameterized.class)
public class ScoresSpecialTest {

    @Parameter(value = 0)
    public int[] intsA;

    @Parameter(value = 1)
    public int[] intsB;

    @Parameter(value = 2)
    public int expectedValue;

    private ScoresSpecial testObj;

    @Before
    public void setUp() throws Exception {
        testObj = new ScoresSpecial();
    }

    @Parameters(name = "{index}: testScores({0}, {1}) = {2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                { new int[]{12, 10, 4}, new int[]{2, 20, 30}, 40},
                { new int[]{20, 10, 4}, new int[]{2, 20, 10}, 40},
                { new int[]{12, 11, 4}, new int[]{2, 20, 31}, 20},
        });
    }


    @Test
    public void testScoresSpecial() throws Exception {
        assertThat(testObj.scoresSpecial(intsA, intsB), is(expectedValue));
    }

    @Test
    public void testScoresSpecial8() {
        assertThat(testObj.scoresSpecial8(intsA, intsB), is(expectedValue));
    }

}