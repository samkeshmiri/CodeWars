package com.sam.sixKyu;

import java.util.*;

public class SortTheOdd {
	public static void main(String[] args) {
		SortTheOdd.sortArray(new int[]{ 5, 3, 2, 8, 1, 4 });
	}
	
	public static int[] sortArray(int[] array) {
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			if ((array[i] % 2) != 0) {
				arr.add(array[i]);
			}
		}
		Collections.sort(arr);
		for (int s = 0; s < array.length; s++) {
			if ((array[s] % 2) == 0) {
				arr.add(s, array[s]);
			}
		}
		
		int[] result = new int[arr.size()];
		
		for (int i = 0; i < arr.size(); i++) {
			result[i] = arr.get(i);
			System.out.println(result[i]);
		}
		
		return result;
	}
}
