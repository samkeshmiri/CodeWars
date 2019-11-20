package com.sam.sixKyu;

import java.util.stream.IntStream;

/**
 * https://www.codewars.com/kata/526571aae218b8ee490006f4/solutions/java
 * 
 * Write a function that takes an integer as input, and returns the number of bits that are equal to one in the binary representation of that number. You can guarantee that input is non-negative.
 * Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case
 * 
 * @author s.keshmiri
 *
 */

public class BitCounting {
	
	public static int countBits(int n) {
		String binary = Integer.toBinaryString(n);
		
		String[] arr = binary.split("");
		int[] bitArr = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			bitArr[i] = Integer.parseInt(arr[i]);
		}
		
		return IntStream.of(bitArr).sum();
	}
}