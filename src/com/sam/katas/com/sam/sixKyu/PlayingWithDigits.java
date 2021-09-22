package com.sam.sixKyu;

/**
 * https://www.codewars.com/kata/5552101f47fc5178b1000050/java
 * 
 * Given a positive integer n written as abcd... (a, b, c, d... being digits) and a positive integer p
 * we want to find a positive integer k, if it exists, such as the sum of the digits of n taken to the successive powers of p is equal to k * n.
 * 
 * In other words:
 * Is there an integer k such as : (a ^ p + b ^ (p+1) + c ^(p+2) + d ^ (p+3) + ...) = n * k
 * 
 * @author s.keshmiri
 *
 */
public class PlayingWithDigits {
	
	public static void main(String[] args) {
		System.out.println(digPow(3456789, 1));
	}
	
	public static long digPow(int n, int p) {
		
		String numberString = Integer.toString(n);
		int exponent = p;
		long total = 0;
		
		for (int i = 0; i < numberString.length(); i++){
		    char c = numberString.charAt(i);
		    long digit = Long.parseLong(String.valueOf(c));
		    
		    total += Math.pow(digit, exponent);
		    exponent++;
		}
		
//		// for kata to pass had to use 5000000
//		for (int i = 0; i < Integer.MAX_VALUE; i++) {
//			if (i*n == total) {
//				return i;
//			}
//		}
		
		return (total % n == 0 ? total / n : -1);
//		return -1;
	}

}
