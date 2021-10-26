package com.sam.sixKyu;

import java.util.HashMap;
import java.util.Map;

/**
 * Write a function that takes an array of numbers (integers for the tests)
 * and a target number. It should find two different items in the array that,
 * when added together, give the target value. The indices of these items should
 * then be returned in a tuple like so: (index1, index2).
 * 
 * 
 * https://www.codewars.com/kata/52c31f8e6605bcc646000082
 * 
 * @author s.keshmiri
 *
 */
public class TwoSumComplexityN {

	public static void main(String[] args) {
		//twoSum(new int[] { 1, 2, 3, 4, 10 }, 13); // 2,4
		twoSum(new int[] { 1, 2, 3 }, 4);
	}

	public static int[] twoSum(int[] arr, int target) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(target - arr[i])) {
				System.out.println(map.get(target - arr[i]) + ", " + i);
				return new int[] { map.get(target - arr[i]), i };
			} else {
				map.put(arr[i], i);
			}
		}
		return arr;
	}

}
