package com.sam.sixKyu;

import java.util.ArrayList;

/**
 * https://www.codewars.com/kata/58f5c63f1e26ecda7e000029
 * 
 * 
 * wave("hello") => []string{"Hello", "hEllo", "heLlo", "helLo", "hellO"}
 * works with spaces and multiple words
 * 
 * @author s.keshmiri
 *
 */

public class MexicanWave {
	
	public static void main(String[] args) {
		MexicanWave.wave("hello");
	}
	
	public static String[] wave(String str) {
		String[] arr = new String[str.length()];
		if (str.equals(null)) return new String[] {};
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				continue;
			} else {
				arr[i] = str.substring(0,i) + str.substring(i,i+1).toUpperCase() + str.substring(i+1);
			}
		}
		
		String[] x = removeNulls(arr);
		return x;
	}
	
	public static String[] removeNulls(String[] array) {
		ArrayList<String> noNulls = new ArrayList<>();
		for (String s : array) {
			if(s != null) noNulls.add(s);
		}
		return noNulls.toArray(new String[0]); // 
	}
}