package com.techelevator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class AnimalGroupNameTest {
    AnimalGroupName agn = null; // Initialize

        @Before
        public void setUp() {  // This has to happen for every single new test
            agn = new AnimalGroupName(); // Creation of Object
        }
        @After
        public void tearDown() {
            agn = null;
        }

        @Test
        public void givenNameOfAnimalReturnNameOfGroupOfAnimal() {  // method name indicating what I am testing
            Assert.assertEquals("Answer should be Tower.", agn.getHerd("giraffe"), "Tower");
            Assert.assertEquals("Answer should be Crash.", agn.getHerd("rhino"), "Crash");
            Assert.assertEquals("Answer should be Herd.", agn.getHerd("elephant"), "Herd");
            Assert.assertEquals("Answer should be Murder.", agn.getHerd("crow"), "Murder");
            Assert.assertEquals("Answer should be Herd.", agn.getHerd("lion"), "Herd");
            Assert.assertEquals("Answer should be Kit.", agn.getHerd("pigeon"), "Kit");
            Assert.assertEquals("Answer should be Pat.", agn.getHerd("flamingo"), "Pat");
            Assert.assertEquals("Answer should be Herd.", agn.getHerd("deer"), "Herd");
            Assert.assertEquals("Answer should be Pack.", agn.getHerd("dog"), "Pack");
            Assert.assertEquals("Answer should be Float.", agn.getHerd("crocodile"), "Float");
        }
}
