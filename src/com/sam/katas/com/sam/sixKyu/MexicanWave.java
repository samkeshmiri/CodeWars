package com.sam.sixKyu;

import java.util.ArrayList;

public class MexicanWave {
	
	public static void main(String[] args) {
		MexicanWave.wave(" gap ");
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
		System.out.println(x.length);
		return x;
	}
	
	public static String[] removeNulls(String[] array) {
		ArrayList<String> noNulls = new ArrayList<>();
		for (String s : array) {
			if(s != null) noNulls.add(s);
		}
		return noNulls.toArray(new String[0]);
	}
}