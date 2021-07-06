package com.techelevator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class Lucky13Test {
    Lucky13 l13 = null;

    @Before
    public void setUp() {
        l13 = new Lucky13();
    }
    @After
    public void tearDown() {
        l13 = null;
    }
    @Test
    public void returnTrueIfArrayContainsNo1sAndNo3s() {
        Assert.assertEquals("Incorrect, answer should be true.", l13.getLucky(new int[] {0, 2, 4}), true);
        Assert.assertEquals("Incorrect, answer should be false.", l13.getLucky(new int[] {1, 2, 3}), false);
        Assert.assertEquals("Incorrect, answer should be false.", l13.getLucky(new int[] {1, 2, 4}), false);


    }


}
