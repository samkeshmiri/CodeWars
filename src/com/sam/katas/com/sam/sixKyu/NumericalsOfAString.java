package com.sam.sixKyu;

import java.util.HashMap;
import java.util.Map;


/**
 * https://www.codewars.com/kata/5b4070144d7d8bbfe7000001/solutions/java
 * 
 * For each symbol in the string if it's the first character occurence, replace it with a '1', else replace it with the amount of times you've already seen it...

But will your code be performant enough?

Examples:
input   =  "Hello, World!"
result  =  "1112111121311"

input   =  "aaaaaaaaaaaa"
result  =  "123456789101112"
There might be some non-ascii characters in the string.

Note: there will be no int domain overflow (character occurences will be less than 2 billion).
 * 
 * @author s.keshmiri
 *
 */

public class NumericalsOfAString {
	
	public static void main(String[] args) {
		NumericalsOfAString.numerical("Hello, World!");
	}
	
	public static String numerical(String s) {
		StringBuilder sb = new StringBuilder("");
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] arr = s.toCharArray();
		
		for(int i = 0; i < arr.length; i++) {
			char key = arr[i];
			if (map.containsKey(key)) {
				map.put(key, map.get(key) + 1);
				sb.append(map.get(key));
			} else {
				
				map.put(key, 1);
				sb.append(map.get(key));
			}
		}
		return sb.toString();
	}
}
