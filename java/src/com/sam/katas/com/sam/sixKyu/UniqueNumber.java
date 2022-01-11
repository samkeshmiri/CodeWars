package com.sam.sixKyu;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

/*
 * There is an array with some numbers. All numbers are equal except for one. Try to find it.
 * https://www.codewars.com/kata/585d7d5adb20cf33cb000235/train/java
 */
public class UniqueNumber {
	
	public static void main(String[] args) {
		System.out.println(findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }));
	}
	
    public static double findUniq(double arr[]) {
    	Map<Double, Integer> map = new HashMap<>();

    	for (double d : arr) {
    		if (map.containsKey(d)) {
    			map.put(d, map.get(d) + 1);
    		} else {
    			map.put(d, 1);
    		}
    	}
    	
    	for (Entry<Double,Integer> entry : map.entrySet()) {
    		if (Objects.equals(1, entry.getValue())) {
    			return entry.getKey();
    		}
    		
    	}
    	
    	return 0;		
      }

}
