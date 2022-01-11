package com.sam.sixKyu;

/**
 * Given Two integers a , b , find The sum of them , BUT You are not allowed to
 * use the operators + and -
 * 
 * @author s.keshmiri
 *
 * https://www.codewars.com/kata/5a9c35e9ba1bb5c54a0001ac/train/java
 *
 */
public class SumOfTwoIntegers {
	
	public static void main(String[] args) {
		System.out.println(add(23, 17));
	}
	
	public static int add (int x, int y) {
		
		while (x != 0) {
			
			int z = x & y;
			
			x ^= y;
			
			y = z << 1;
			
			if (y == 0) {
				return x;
			}
			
		}
		return 0;
	}

}
