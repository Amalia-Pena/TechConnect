package com.techelevator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class CigarPartyTest {
    CigarParty cp = null;

    @Before
    public void setUp() {
        cp = new CigarParty();
    }
    @After
    public void tearDown() {
        cp = null;
    }
    @Test
    public void tellIfPartyIsSuccessfulOrNot() {
        Assert.assertEquals("Incorrect, answer should be false.", cp.haveParty(30, false), false);
        Assert.assertEquals("Incorrect, answer should be true", cp.haveParty(50, false), true);
        Assert.assertEquals("Incorrect, answer should be true.", cp.haveParty(70, true), true);

    }
}
