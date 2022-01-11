package com.sam.sixKyu;

import java.util.Arrays;

// https://www.codewars.com/kata/556deca17c58da83c00002db/java

public class Xbonacci {
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(tribonacci(new double[] {1,1,2},15)));
	}
	
	public static double[] tribonacci(double[] s, int n) {
		double[] arr = new double[n];
		
		if (n == 0) {
			return new double[0];
		}
		
		if (n < 3) {
			return new double[] {s[0]};
		}
		
		for (int k = 0; k < s.length; k++) {
			arr[k] = s[k];
		}
		
		for (int i = 0; i < n - 3; i++) {
			arr[3 + i] = arr[i] + arr[i+1] + arr[i+2];
		}
				
		return arr;
	}

}
