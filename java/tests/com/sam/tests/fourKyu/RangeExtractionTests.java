package com.sam.tests.fourKyu;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.sam.fourKyu.RangeExtraction;

class RangeExtractionTests {

	@Test
	public void test_BasicTests() {
		assertEquals("-6,-3-1,3-5,7-11,14,15,17-20", RangeExtraction
				.rangeExtraction(new int[] { -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20 }));

		assertEquals("-3--1,2,10,15,16,18-20",
				RangeExtraction.rangeExtraction(new int[] { -3, -2, -1, 2, 10, 15, 16, 18, 19, 20 }));

		assertEquals("-12,-9,-7,-5,-3,-2,0-3,5,8,9,12-22,25,28,29,32,34,37",
				RangeExtraction.rangeExtraction(new int[] { -12, -9, -7, -5, -3, -2, 0, 1, 2, 3, 5, 8, 9, 12, 13, 14,
						15, 16, 17, 18, 19, 20, 21, 22, 25, 28, 29, 32, 34, 37 }));

	}

	@Test
	public void testNoRanges() {
		assertEquals("-16,-13,-10,-7,-5,-3,-1,0,3,5,6,8,10,13,14,16,19,22,23,25,26,29,31,34,35",
				RangeExtraction.rangeExtraction(new int[] { -16, -13, -10, -7, -5, -3, -1, 0, 3, 5, 6, 8, 10, 13, 14,
						16, 19, 22, 23, 25, 26, 29, 31, 34, 35 }));
	}

	@Test
	public void testRandom() {
		assertEquals("-40,-38,-36,-34,-32--30,-27,-24,-23,-20,-18,-15,-12,-10,-8,-6,-5,-3,0,3,4,6",
				RangeExtraction.rangeExtraction(new int[] { -40, -38, -36, -34, -32, -31, -30, -27, -24, -23, -20, -18,
						-15, -12, -10, -8, -6, -5, -3, 0, 3, 4, 6 }));
	}

}
