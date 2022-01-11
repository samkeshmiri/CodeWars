package com.sam.fiveKyu;

import java.util.HashMap;
import java.util.Map;


/**
 * Complete the function scramble(str1, str2) that returns true 
 * if a portion of str1 characters can be rearranged to match str2, otherwise returns false.
 * https://www.codewars.com/kata/55c04b4cc56a697bb0000048/train/java
 * @author s.keshmiri
 *
 */
public class Scramblies {

	public static void main(String[] args) {
		System.out.println(Scramblies.scramble("cedewaraaossoqqyt", "codewars"));
		System.out.println(Scramblies.scramble("scriptjavx","javascript"));
	}
	
	public static boolean scramble(String str1, String str2) {
		
		Map<String, Integer> map = new HashMap<>();
		String[] arr = str1.split("");
		String[] word = str2.split("");
		
		for (String s : arr) {
			if(map.get(s) != null) {
				int count = map.get(s);
				count++;
				map.put(s, count);
			} else {
				map.put(s, 1);
			}
		}
		
		for (String s : word) {
			if (map.containsKey(s) && map.get(s) != 0) {
				int count = map.get(s);
				count--;
				map.put(s, count);
			} else {
				return false;
			}
		}
		
		System.out.println(map);

		return true;
	}

}
