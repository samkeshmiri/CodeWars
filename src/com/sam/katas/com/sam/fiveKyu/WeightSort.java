package com.sam.fiveKyu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class WeightSort {
	
	public static String orderWeight(String string) {
		String[] strings = string.split(" ");
		ArrayList<String> strs = new ArrayList<>();
		ArrayList<Integer> nums = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < strings.length; i++) {
			strs.add(strings[i]);
		}
		
		Collections.sort(strs);
		
		Collections.sort(strs, new Comparator<String>(){
		    public int compare(String o1, String o2) {
		    	Integer rank1 = String.valueOf(o1).chars().map(Character::getNumericValue).sum();
				Integer rank2 = String.valueOf(o2).chars().map(Character::getNumericValue).sum();
				
				if (rank1 > rank2) {
					return 1;
				} else if (rank1 == rank2) {
					return 0;
				} else {
					return -1;
				}
				
		    }
		});
				
		for (String x : strs) {
			sb.append(x.toString() + " ");
		}
		
		return sb.toString().stripTrailing();
	}
	
	public static void main(String[] args) {
		System.out.println(orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"));
		// expected:  11 11 2000 10003 22 123 1234000 44444444 9999
	}
}
