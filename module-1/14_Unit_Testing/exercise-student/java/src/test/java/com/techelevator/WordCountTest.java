package com.techelevator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.util.Dictionary;

public class WordCountTest {
    WordCount wc = null;

    @Before
    public void setUp() {
        wc = new WordCount();
    }
    @After
    public void tearDown() {
        wc = null;
    }
    @Test
    public void returnWithValueNumberOfTimesThatStringAppears() {
        Assert.assertEquals("Bloop", wc.getCount(new String[] {"ba", "ba", "black", "sheep"}), new Dictionary<String, Integer>());
    }
}

