package com.sam.sixKyu;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PlayingWithDigitsTest {

	@Test
	public void Test1() {
		assertEquals(1, PlayingWithDigits.digPow(89, 1));
	}

	@Test
	public void Test2() {
		assertEquals(-1, PlayingWithDigits.digPow(92, 1));
	}

	@Test
	public void Test3() {
		assertEquals(51, PlayingWithDigits.digPow(46288, 3));
	}
	
	@Test
	public void Test4() {
		assertEquals(-1, PlayingWithDigits.digPow(3456789, 1));
	}
	
}
