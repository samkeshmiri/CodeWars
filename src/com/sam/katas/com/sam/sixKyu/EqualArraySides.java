package com.sam.sixKyu;
import java.util.Arrays;

/**
 * https://www.codewars.com/kata/5679aa472b8f57fb8c000047/train/java
 * You are going to be given an array of integers. 
 * Your job is to take that array and find an index N,
 * where the sum of the integers to the left of N is equal to the sum of the integers to the right of N. 
 * If there is no index that would make this happen, return -1.
 * 
 * e.g. 1,2,3,4,3,2,1 would return 3 (index at which left side of it is equal to right side of it).
 * 
 * @author s.keshmiri
 *
 */
public class EqualArraySides {

	public static int findEvenIndex(int[] arr) {
		
		if (arr.length == 0) {
			return 0;
		}
		
		for (int i = 0; i < arr.length; i++) {
			int left = Arrays.stream(arr, 0, i).sum();
			int right = Arrays.stream(arr, i + 1, arr.length).sum();

			if (left == right) {
				return i;
			}

		}
		
		return -1;
	}
}
