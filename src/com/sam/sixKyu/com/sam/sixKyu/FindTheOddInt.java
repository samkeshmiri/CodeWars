package com.sam.sixKyu;

import java.util.HashMap;

public class FindTheOddInt {
	
	public static void main(String[] args) {
		findIt(new int[]{20,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5});
	}
	
	public static int findIt(int[] a) {
		int odd = 0;
		
		HashMap<Integer, Integer> intCountMap = new HashMap<>();
		
		for (int i : a) {
			if (intCountMap.containsKey(i)) {
				intCountMap.put(i, intCountMap.get(i)+1);
			} else { 
				intCountMap.put(i, 1);
			}
		}
		
		intCountMap.entrySet().forEach(entry->{
		    System.out.println(entry.getKey() + " " + entry.getValue());  
		 });
		
		for (int key : intCountMap.keySet()) {
			if (intCountMap.get(key) % 2 != 0) {
				return key;
			}
		}	
		return odd;
	}
}
