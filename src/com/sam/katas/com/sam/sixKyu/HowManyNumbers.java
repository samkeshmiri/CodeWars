package com.sam.sixKyu;

import java.util.HashSet;
import java.util.Set;

public class HowManyNumbers {

	public static void main(String[] args) {
		//System.out.println(selNumber(30, 2));
		
		//System.out.println(checkDifference(12357, 2));
		System.out.println(checkIncreasingValue(0));
		System.out.println(checkDifference(12359, 2));
		System.out.println(checkDuplicates(1234567));
	}

	public static int selNumber(int n, int d) {
		int count = 0;
		int[] arr;

		if (n > 12) {
			arr = new int[n];
			for (int i = 1; i <= arr.length; i++) {
				arr[i - 1] = i;
			}
		} else {
			return 0;
		}

		for (int x = 0; x < arr.length; x++) {
			if (checkIncreasingValue(arr[x]) 
					&& checkDifference(arr[x], d) 
					&& checkDuplicates(arr[x])) {
				count++;
			} else {
				continue;
			}
		}
		return count;
	}

	public static boolean checkIncreasingValue(int z) {
		int current = z % 10;
		z = z / 10;

		while (z > 0) {
			if (current <= z % 10) {
				return false;
			}
			current = z % 10;
			z = z / 10;
		}
		return true;
	}

	public static boolean checkDifference(int z, int d) {
        int prev = -1; 
 
        while (z > 0) { 
            int current = z % 10; 
  
            if (prev != -1) { 
                if (Math.abs(current-prev) > d) 
                    return false; 
            } 
            z /= 10; 
            prev = current; 
        } 
		return true;
	}

	public static boolean checkDuplicates(int z) { 
		String integer = String.valueOf(z);
		String[] strArr = integer.split("");
		int[] intArr = new int[strArr.length];
		Set<Integer> set = new HashSet<>();

		for (int w = 0; w < intArr.length; w++) {
			intArr[w] = Integer.parseInt(strArr[w]);
		}

		for (Integer x : intArr) {
			set.add(x);
		}

		if (set.size() != intArr.length) {
			return false;
		}

		return true;
	}

}
