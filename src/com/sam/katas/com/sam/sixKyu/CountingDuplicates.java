package com.sam.sixKyu;

import java.util.HashSet;

/**
 * https://www.codewars.com/kata/counting-duplicates/java
 * 
 * Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string. 
 * The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
 * 
 * 
 * @author s.keshmiri
 *
 */

public class CountingDuplicates {

	public static void main(String[] args) {
		System.out.println(CountingDuplicates.duplicateCount("Indivisibilities"));
	}

	public static int duplicateCount(String text) {
		char[] arr = text.toLowerCase().toCharArray();
		HashSet<Character> set = new HashSet<Character>();
		HashSet<Character> duplicates = new HashSet<>();
		for (char i : arr) {
			if (set.contains(i)) {
				duplicates.add(i);
			} else {
				set.add(i);
			}
		}
		return duplicates.size();
	}
}
