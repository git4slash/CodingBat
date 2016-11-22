package com.codingbat.ap1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Oleksandr Subbotin
 * @version 1.0
 * @since 31.10.16
 */
/*
hasOne(10) → true
hasOne(22) → false
hasOne(220) → false
*/
public class HasOneTest {
    HasOne testObj;
    StringBuilder message;
    int anInt;
    boolean isHasOne;

    @Before
    public void setUp() throws Exception {
        testObj = new HasOne();
    }

    @Test
    public void hasOne() throws Exception {
        message = new StringBuilder()
                .append(anInt)
                .append(isHasOne ? " contains one!" : " does not contain one!");
        anInt = 10;
        isHasOne = true;
        assertEquals(message.toString(),
                isHasOne,
                testObj.hasOne(anInt));

        message = new StringBuilder()
                .append(anInt)
                .append(isHasOne ? " contains one!" : " does not contain one!");
        anInt = 22;
        isHasOne = false;
        assertEquals(message.toString(),
                isHasOne,
                testObj.hasOne(anInt));

        message = new StringBuilder()
                .append(anInt)
                .append(isHasOne ? " contains one!" : " does not contain one!");
        anInt = 220;
        isHasOne = false;
        assertEquals(message.toString(),
                isHasOne,
                testObj.hasOne(anInt));
    }

}