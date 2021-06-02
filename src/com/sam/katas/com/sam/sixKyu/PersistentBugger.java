package com.sam.sixKyu;

import java.util.ArrayList;
/**
 * Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence, 
 * which is the number of times you must multiply the digits in num until you reach a single digit.
 * @author s.keshmiri
 *
 */
public class PersistentBugger {
	static int count = 0;
	
	public static void main(String[] args) {
		System.out.println(PersistentBugger.persistence(49581));
		System.out.println(PersistentBugger.persistence(39));
		System.out.println(PersistentBugger.persistence(999)); // 4
	}
	
	public static int persistence(long n) {

		long digit;
		
		if (n <= 9) return 0;
		else digit = multiply(n);
		
		System.out.println(digit);
		
		if (digit <= 9) {
			int temp = count;
			count = 0;
			return temp;
		} else {
			return persistence(digit);
		}
	}
	
	public static long multiply(long n) {
		count++;
		long sum = 1;
		ArrayList<Long> arr = new ArrayList<>();
		
		while (n > 0) {
			arr.add(n%10);
			n/=10;
		}
	 
		for (long l : arr) {
			sum *= l;
		}
		
		return sum;
	}
}
