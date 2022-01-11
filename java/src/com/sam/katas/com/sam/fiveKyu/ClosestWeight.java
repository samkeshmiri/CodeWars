package com.sam.fiveKyu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;

/**
 * https://www.codewars.com/kata/5868b2de442e3fb2bb000119/train/java
 * 
 * [number-weight, index in strng of the corresponding number, original corresponding number in strng]
 * @author s.keshmiri
 *
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
public class ClosestWeight {
	
	public static void main(String[] args) {
		String s = "456899 50 11992 176 272293 163 389128 96 290193 85 52";
		closest(s);
	}
    
	public static int[][] closest(String strng) {
    	if (strng.isEmpty()) {
    		return new int[0][0];
    	}
    	
    	HashMap<Integer, List<Integer>> map = createWeightedMap(strng);
    	HashMap<Integer, List<Integer>> sortedMap = sortByValue(map);
    	
    	Iterator it = sortedMap.entrySet().iterator();
    	Iterator it2 = sortedMap.entrySet().iterator();
    	prepareSecondIterator(it2);
    	
    	int smallestDistance = 231231241;
    	Entry<Integer, List<Integer>> resA = null;
    	Entry<Integer, List<Integer>> resB = null;

    	while(it.hasNext()) {
    		while(it2.hasNext()) {
    			try {
    				Map.Entry<Integer, List<Integer>> distanceA = (Map.Entry<Integer, List<Integer>>) it.next();
					Map.Entry<Integer, List<Integer>> distanceB = (Map.Entry<Integer, List<Integer>>) it2.next();
					int currentDistance = distanceB.getValue().get(0) - distanceA.getValue().get(0);
					
					if (currentDistance < smallestDistance) { 
						smallestDistance = currentDistance;
						resA = distanceA;
						resB = distanceB;
					}
    			} catch (NoSuchElementException e) {
    			}
    		}
    		break;
    	}

    	int[][] result = prepareResult(resA, resB);
    	
    	return result;
    }

	private static int[][] prepareResult(Entry<Integer, List<Integer>> resA, Entry<Integer, List<Integer>> resB) {
		int[][] result = new int[2][3];
    	result[0][0] = resA.getValue().get(0);
    	result[0][1] = resA.getKey();
    	result[0][2] = resA.getValue().get(1);
    	
    	result[1][0] = resB.getValue().get(0);
    	result[1][1] = resB.getKey();
    	result[1][2] = resB.getValue().get(1);
		return result;
	}

	private static void prepareSecondIterator(Iterator it2) {
		Entry<Integer, List<Integer>> temp = (Entry<Integer, List<Integer>>) it2.next();
	}

	private static HashMap<Integer, List<Integer>> createWeightedMap(String strng) {
		String[] arr = strng.split(" ");
    	HashMap<Integer, List<Integer>> map = new HashMap<>();

    	for (int i = 0; i < arr.length; i++) {
    		String[] nums = arr[i].split("");
    		int weight = 0;
    		for (String x : nums) {
    			weight += Integer.valueOf(x);
    		}
    		List<Integer> list = new ArrayList<>();
    		list.add(weight);
    		list.add(Integer.valueOf(arr[i]));
    		map.put(i, list);
    	}
    	
    	sortByValue(map);
    	
		return map;
	}
    
    public static HashMap<Integer, List<Integer>> sortByValue(HashMap<Integer, List<Integer>> hashMap) {
        // Create a list from elements of HashMap
        List<Map.Entry<Integer, List<Integer>>> list =
               new LinkedList<Map.Entry<Integer, List<Integer>>> (hashMap.entrySet());
 
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Integer, List<Integer>>>() {
			@Override
			public int compare(Entry<Integer, List<Integer>> o1, Entry<Integer, List<Integer>> o2) {
				
				return o1.getValue().get(0).compareTo(o2.getValue().get(0));
			}
        });
         
        // put data from sorted list to hashmap
        HashMap<Integer, List<Integer>> temp = new LinkedHashMap<Integer, List<Integer>>();
        for (Map.Entry<Integer, List<Integer>> entry : list) {
            temp.put(entry.getKey(), entry.getValue());
        }
        return temp;
    }

}
