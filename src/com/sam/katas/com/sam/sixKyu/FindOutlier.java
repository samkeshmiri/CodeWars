package com.sam.sixKyu;

public class FindOutlier {
	
	public static void main(String[] args) {
		System.out.println(find(new int[] {2,6,8,-10,3}));
		System.out.println(find(new int[] {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781}));
		System.out.println(find(new int[] {2, -6, 8, -10, -3}));
		System.out.println(find(new int[] {1, 1, -1, 1, 1, -44, 7, 7, 7}));
	}

	public static int find(int[] integers) {
		int firstThree = Math.abs(integers[0] % 2) + Math.abs(integers[1] % 2) + Math.abs(integers[2] % 2);
		int rem = firstThree < 2 ? 1 : 0;

		for (int i = 0; i < integers.length; i++) {
			if (Math.abs(integers[i]) % 2 == rem)
				return integers[i];
		}
		
		return 0;
	}
	
}
