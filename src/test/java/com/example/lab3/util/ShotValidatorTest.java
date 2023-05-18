package com.example.lab3.util;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShotValidatorTest {
    static ShotValidator shotValidator;
    
    @BeforeAll
    public static void init() {
        shotValidator = new ShotValidator();
    }
    
    @Test
    void testFailForStrings() {
    	shotValidator.validateParameters("One","Two","Three");

    	assertFalse(shotValidator.getValid());
        assertEquals("X, Y, R must be float", shotValidator.getMessage());
    }
    
    @Test
    void testFailForNull() {
        shotValidator.validateParameters(null,null, null);

        assertFalse(shotValidator.getValid());
        assertEquals("Please add X, Y and R", shotValidator.getMessage());
    }
}