package com.sam.fiveKyu;

public class Max {
	
	public static void main(String[] args) {
		System.out.println(sequence(new int[]{-2, -3, 4, -1, -2, 1, 5, -3}));
	}

	public static int sequence(int[] arr) {
		int sumSoFar = 0, maxUpToHere = 0;
		for (int i = 0; i < arr.length; i++) {
			maxUpToHere += arr[i];
			if (maxUpToHere < 0) {
				maxUpToHere = 0;
			}
			if (sumSoFar < maxUpToHere) {
				sumSoFar = maxUpToHere;
			}
		}
		
		return sumSoFar;
	}
}
