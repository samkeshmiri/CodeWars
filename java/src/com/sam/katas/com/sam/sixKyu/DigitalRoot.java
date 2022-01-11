package com.sam.sixKyu;

import java.util.ArrayList;

/**
 * https://www.codewars.com/kata/541c8630095125aba6000c00/solutions/java
 * 
 * In this kata, you must create a digital root function.

A digital root is the recursive sum of all the digits in a number. Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in this way until a single-digit number is produced. This is only applicable to the natural numbers.

Here's how it works:

digital_root(16)
=> 1 + 6
=> 7

digital_root(942)
=> 9 + 4 + 2
=> 15 ...
=> 1 + 5
=> 6
 * 
 * 
 * 
 * @author s.keshmiri
 *
 */

public class DigitalRoot {
	
	// split numbers
	// add them
	// check if <= 9 
	// else use recursion to split again
	
	public static void main(String[] args) {
		// System.out.println(DigitalRoot.digital_root(123));
		System.out.println(DigitalRoot.digital_root(132189));
	}
	
	public static int digital_root(int n) {
		ArrayList<Integer> array = new ArrayList<>();
		int sum = 0;
		
		while(n > 0) {
			array.add(n%10);
			n /= 10;
		}	
		
		sum = array.stream().mapToInt(Integer::intValue).sum();
		
		if (sum <= 9) return sum;
		else return digital_root(sum);
	}
}
