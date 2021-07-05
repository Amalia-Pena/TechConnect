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


        }
}


