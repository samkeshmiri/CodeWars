package com.sam.sixKyu;

import java.util.Arrays;

public class AreSame {

	public static void main(String[] args) {
		int[] a = { 3, 11 };
		int[] b = { 121, 9 };
		System.out.println(comp(a, b));
	}

	public static boolean comp(int[] a, int[] b) {
		if (a == null || b == null)
			return false;
		int[] c = new int[a.length];
		for (int x = 0; x < a.length; x++) {
			a[x] = Math.abs(a[x]);
		}
		Arrays.sort(a);
		Arrays.sort(b);
		for (int i = 0; i < a.length; i++) {
			c[i] = Math.abs(a[i] * a[i]);
		}

		if (Arrays.equals(c, b)) {
			return true;
		}
		return false;
	}

//	
// if (a == null || b == null) return false;
//	int[] c = Arrays.stream(a).map(x -> x * x).toArray();
//	
//
//	Arrays.sort(c);
//	Arrays.sort(b);
//	
//	return Arrays.equals(c, b); 
}
