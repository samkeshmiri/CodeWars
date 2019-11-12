package com.sam.sixkyu;

import java.util.*;

// https://www.codewars.com/kata/514b92a657cdc65150000006
public class Multiplesof3Or5 {

	public int solution(int number) {
		List<Integer> arr = new ArrayList<>();

		for (int i = 0; i < number; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				arr.add(i);
			}
		}

		int sum = 0;

		for (int d : arr) {
			sum += d;
		}

		return sum;
	}
}
