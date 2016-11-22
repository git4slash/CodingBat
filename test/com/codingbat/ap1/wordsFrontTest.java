package com.codingbat.ap1;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * @author Oleksandr Subbotin
 * @version 1.0
 * @since 22.11.16
 */
/*
wordsFront(["a", "b", "c", "d"], 1) → ["a"]
wordsFront(["a", "b", "c", "d"], 2) → ["a", "b"]
wordsFront(["a", "b", "c", "d"], 3) → ["a", "b", "c"]*/
@RunWith(Parameterized.class)
public class wordsFrontTest {

    @Parameterized.Parameter
    public String[] words;

    @Parameterized.Parameter(value = 1)
    public int n;

    @Parameterized.Parameter(value = 2)
    public String[] expectedValue;

    private static WordsFront testObj = new WordsFront();

    private static String errMessage = "Arrays are not equal!";

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new String[]{"a", "b", "c", "d"}, 1, new String[]{"a"}},
                {new String[]{"a", "b", "c", "d"}, 2, new String[]{"a", "b"}},
                {new String[]{"a", "b", "c", "d"}, 3, new String[]{"a", "b", "c"}},
        });
    }
    @Test
    public void wordsFront() throws Exception {
        assertThat(errMessage,
                testObj.wordsFront(words, n),
                is(expectedValue));
    }
    @Test
    public void wordsFront8() throws Exception {
        assertThat(errMessage,
                testObj.wordsFront8(words, n),
                is(expectedValue));
    }

}