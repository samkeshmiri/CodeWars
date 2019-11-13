package com.sam.sixKyu;

public class SumOfParts {

	// not my solution (I couldn't get the loop working and it would only add first 3 numbers for some reason
	public static void main(String[] args) {
		sumParts(new int[] { 1,2,3 });
		// answer should be [6, 5, 3, 0]
	}

	public static int[] sumParts(int[] ls) {
		int[] result = new int[ls.length + 1]; // add extra 1 because we sum 0 at the end
		int counter = 0;
		for (int i = ls.length - 1; i >= 0; i--) {
			counter = counter + ls[i];
			result[i] = counter;
		}
		return result;
	}
}
