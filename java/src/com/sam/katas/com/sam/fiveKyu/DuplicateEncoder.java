package com.sam.fiveKyu;

import java.util.HashMap;
import java.util.Map;

// O(N^2) solution
public class DuplicateEncoder {
	
	public static void main(String[] args) {
		System.out.println(encode("Success")); // ")())())"
	}
	
    public static String encode(String battlefield) {
    	
    	StringBuffer result = new StringBuffer();
    	String[] arr = battlefield.toLowerCase().split("");
    	Map<String, Integer> map = new HashMap<>();
    	
    	for (int i = 0; i < arr.length; i++ ) {
    		map.computeIfPresent(arr[i], (k, v) -> v + 1);
    		map.putIfAbsent(arr[i], 1);
    	}    	
    	for (String c : arr) {
    		if (map.get(c) == 1) {
    			result.append("(");
    		} else {
    			result.append(")");
    		}
    	}
    	    	    	
        return result.toString();
      }

}
