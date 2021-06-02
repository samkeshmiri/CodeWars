package com.sam.sixKyu;

import java.util.HashMap;
import java.util.Map;

public class TwoSumComplexityN {
	
	public static void main(String[] args) {
		twoSum(new int[] {1,2,3,4,10}, 13); // 2,4
	}
	
	public static int[] twoSum(int[] arr, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(target - arr[i])) {
				System.out.println(map.get(target - arr[i]) + ", " + i);
				return new int[]{map.get(target - arr[i]), i};
			} else {
				map.put(arr[i], i);
			}
		}
		return arr;
	}

}
