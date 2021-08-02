package com.sam.sixKyu;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://www.codewars.com/kata/523f5d21c841566fde000009/java
 * 
 * Your goal in this kata is to implement a difference function, 
 * which subtracts one list from another and returns the result.
 * It should remove all values from list a, which are present in list b keeping their order.
 * @author s.keshmiri
 */
public class ArrayDiff {
	
	public static void main(String[] args) {
		arrayDiff(new int [] {1,1,1,1,1,1,2}, new int[] {1});
	}
	
	  public static int[] arrayDiff(int[] a, int[] b) {
		  List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
		  List<Integer> listb = Arrays.stream(b).boxed().collect(Collectors.toList());
		  
		  listA.removeAll(listb);
		  return listA.stream().mapToInt(i->i).toArray();
	  }
	  
	  

}
