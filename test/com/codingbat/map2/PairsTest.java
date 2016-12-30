package com.codingbat.map2;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

import static com.codingbat.Helpers.parseMap;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.runners.Parameterized.Parameter;
import static org.junit.runners.Parameterized.Parameters;

/**
 * @author Oleksandr Subbotin
 * @version 1.0
 * @since 25.11.16
 */
/*
pairs(["code", "bug"]) → {"b": "g", "c": "e"}
pairs(["man", "moon", "main"]) → {"m": "n"}
pairs(["man", "moon", "good", "night"]) → {"g": "d", "n": "t", "m": "n"}*/
@RunWith(Parameterized.class)
public class PairsTest {

    @Parameter
    public String[] strings;

    @Parameter(value = 1)
    public Map<String, String> expectedValue;

    private Pairs testObj;

    @Before
    public void setUp() throws Exception {
        testObj = new Pairs();
    }

    @Parameters(name = "{index}: ")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new String []{"code", "bug"},
                        parseMap("\"b\": \"g\", \"c\": \"e\"", String::new)},
                {new String []{"man", "moon", "main"},
                        parseMap("\"m\": \"n\"", String::new)},
                {new String []{"man", "moon", "good", "night"},
                        parseMap("\"g\": \"d\", \"n\": \"t\", \"m\": \"n\"", String::new)}
        });
    }

    @Test
    public void pairs() throws Exception {
        assertThat(testObj.pairs(strings), is(expectedValue));
    }

    @Test
    public void pairs8() throws Exception {
        assertThat(testObj.pairs8(strings), is(expectedValue));
    }

}