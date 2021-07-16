package com.sam.fiveKyu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Scramblies {
	
	public static void main(String[] args) {
		System.out.println(Scramblies.scramble("cedewaraaossoqqyt", "codewars"));
	}
	
	public static boolean scramble(String str1, String str2) {
		
		if (str2.length() > str1.length()) {
			return false;
		}
		
		char[] charr1 = str1.toCharArray();
		char[] charr2 = str2.toCharArray();
		
		List<Character> list1 = new ArrayList<>();
		List<Character> list2 = new ArrayList<>();
		for (char c : charr1) list1.add(c);
		for (char c : charr2) list2.add(c);
		
		list1.removeAll(new HashSet<Character>(list2));
		
		System.out.println();

		return false;
	}

}
