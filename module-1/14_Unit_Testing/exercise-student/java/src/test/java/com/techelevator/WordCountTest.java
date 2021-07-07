package com.techelevator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

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
    public void testMapAndActualAreTheSameSize() {
        String [] testArray = new String[] {"ba", "ba", "black", "sheep"};
        Map<String, Integer> testMap = new HashMap<>();
        testMap.put("ba", 2);
        testMap.put("black", 1);
        testMap.put("sheep", 1);

        int testMapSize = testMap.size();
        int actualSize = wc.getCount(testArray).size();

        Assert.assertEquals(testMapSize, actualSize); // Comparing size of test map and get count to see if they are the same

    }
}

