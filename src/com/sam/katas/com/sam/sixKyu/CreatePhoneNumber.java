package com.sam.sixKyu;

import java.util.Arrays;

public class CreatePhoneNumber {
	
	// https://www.codewars.com/kata/525f50e3b73515a6db000b83
	public static String createPhoneNumber(int[] numbers) {
		String start = "";
		String middle = "";
		String end = "";
		StringBuilder sb = new StringBuilder("");

		int[] startNums = Arrays.copyOfRange(numbers, 0, 3);
		int[] midNums = Arrays.copyOfRange(numbers, 3, 6);
		int[] endNums = Arrays.copyOfRange(numbers, 6, 10);

		for (int i : startNums) {
			start += i;
		}

		for (int i : midNums) {
			middle += i;
		}

		for (int i : endNums) {
			end += i;
		}

		sb.append("(" + start + ") " + middle + "-" + end);
		System.out.println(sb);
		return sb.toString();
	}

}
