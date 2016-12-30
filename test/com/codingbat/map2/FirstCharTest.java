package com.codingbat.map2;

import com.codingbat.Helpers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * @author Oleksandr Subbotin
 * @version 1.0
 * @since 09.12.16
 */
/*
firstChar(["salt", "tea", "soda", "toast"]) → {"t": "teatoast", "s": "saltsoda"}
firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"d": "d", "b": "bb", "c": "cccCC", "a": "aaaAA"}
firstChar([]) → {}
*/
@RunWith(Parameterized.class)
public class FirstCharTest {
    @Parameterized.Parameter
    public String[] strings;

    @Parameterized.Parameter(value = 1)
    public Map<String, String> expectedValue;

    private FirstChar testObj;

    @Before
    public void setUp() throws Exception {
        testObj = new FirstChar();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new String[]{"salt", "tea", "soda", "toast"},
                        Helpers.parseMap("\"t\": \"teatoast\", \"s\": \"saltsoda\"", String::new)},
                {new String[]{"aa", "bb", "cc", "aAA", "cCC", "d"},
                        Helpers.parseMap("\"d\": \"d\", \"b\": \"bb\", \"c\": \"cccCC\", \"a\": \"aaaAA\"", String::new)},
                {new String[]{},
                        Helpers.parseMap("", String::new)},
        });
    }

    @Test
    public void firstChar8() throws Exception {
        assertThat(testObj.firstChar8(strings), is(expectedValue));
    }

    @Test
    public void firstChar() throws Exception {
        assertThat(testObj.firstChar(strings), is(expectedValue));
    }

}