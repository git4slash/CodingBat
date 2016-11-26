package com.codingbat.map2;

import com.codingbat.TestMapHelper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

import static com.codingbat.TestMapHelper.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

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

    @Parameterized.Parameter
    public String[] strings;

    @Parameterized.Parameter(value = 1)
    public Map<String, String> expectedValue;

    private Pairs testObj;

    @Before
    public void setUp() throws Exception {
        testObj = new Pairs();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new String []{"code", "bug"},                  parseMap("\"b\": \"g\", \"c\": \"e\"",
                                                                            TestMapHelper::splitKVString)},
                {new String []{"man", "moon", "main"},          parseMap("\"m\": \"n\"",
                                                                            TestMapHelper::splitKVString)},
                {new String []{"man", "moon", "good", "night"}, parseMap("\"g\": \"d\", \"n\": \"t\", \"m\": \"n\"",
                                                                            TestMapHelper::splitKVString)}
        });
    }

    @Test
    public void pairs() throws Exception {
        assertThat(testObj.pairs(strings), is(expectedValue));
    }

}