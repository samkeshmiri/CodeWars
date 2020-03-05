// https://www.codewars.com/kata/556e0fccc392c527f20000c5/java

package com.sam.sixKyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class XbonacciFriends {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(xbonacci(new double[] { 1, 1 }, 10)));
		System.out.println(Arrays.toString(xbonacci(new double[] {1,0,0,0,0,0,1},10)));
	}

	public static double[] xbonacci(double[] signature, int n) {
		double[] arr = new double[n];
		List<Double> list = new ArrayList<>();
		double temp = 0;
		int length = signature.length;

		if (n == 0) {
			return new double[0];
		}
		
		for (double j : signature) {
			list.add(j);
		}
		
		while (list.size() < n) {
			temp = 0;
			for (int i = length; i > 0; i -= 1) {
				 temp += list.get(list.size()-i);
			}
			list.add(temp);
		}
		
		for(int x = 0; x < n; x++) {
			arr[x] = list.get(x);
		}
		
		return arr;
	}

}
