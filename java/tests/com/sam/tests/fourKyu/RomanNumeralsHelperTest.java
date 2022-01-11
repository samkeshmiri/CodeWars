package com.sam.tests.fourKyu;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.sam.fourKyu.RomanNumeralsHelper;

public class RomanNumeralsHelperTest {

    @Test
    public void testToRoman() throws Exception {
        assertEquals("1 converts to 'I'", RomanNumeralsHelper.toRoman(1), "I");
        assertEquals("2 converts to 'II'", RomanNumeralsHelper.toRoman(2), "II");
        assertEquals("1994 converts to ''", RomanNumeralsHelper.toRoman(1994), "MCMXCIV");
    }

    @Test
    public void testFromRoman() throws Exception {
    	assertEquals("'I' converts to 1", RomanNumeralsHelper.fromRoman("I"), 1);
    	assertEquals("'II' converts to 2", RomanNumeralsHelper.fromRoman("II"), 2);
    	assertEquals("'MCMXCIV' converts to 1994", RomanNumeralsHelper.fromRoman("MCMXCIV"), 1994);
    }
}
