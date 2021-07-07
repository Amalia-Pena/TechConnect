package com.techelevator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class NonStartTest {
    NonStartTest nst = null;

    @Before
    public void setUp() {  // This has to happen for every single new test
        nst = new NonStartTest(); // Creation of Object
    }
    @After
    public void tearDown() {
        nst = null;
    }

    @Test
    public void given2StringsReturnTheirConcatenation() {
//        Assert.assertEquals("Incorrect.", nst.getPartialString("Hello", "There"), "ellohere");
    }
    }


