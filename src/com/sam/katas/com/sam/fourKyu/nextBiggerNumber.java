package com.sam.fourKyu;

import java.util.ArrayList;
import java.util.Collections;

public class nextBiggerNumber {
	// get every possible combination of the number
	// sort the list 
	// print next one up
	
	public static void main(String[] args) {
		nextBiggerNumber.permutate(1234);
	}
	
	
	public static long count(long n){
		long count = 0;
		while(n>0) {
			count++;
			n = n / 10;
		}
		return count;
	}
	
	public static void permutate(long n) {
		long count = count(n);
		long num = n;
		ArrayList<Long> list = new ArrayList<>();
		
		
		while (true) {
			System.out.println(num);
			
			long rem = num % 10; System.out.println("rem: " + rem);
			long dev = num / 10; System.out.println("dev: " + dev);
			num = (long) ((Math.pow(10, count-1)) * rem + dev);
			list.add(num);
			
			if (num == n) {
				break;
			}
		}
		
		Collections.sort(list);
		

		
	}
	
	
	
}