// https://www.codewars.com/kata/5541f58a944b85ce6d00006a/java

package com.sam.fiveKyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProdFib {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(productFib(714)));	// should return {21, 34, 1}, 
		System.out.println(Arrays.toString(productFib(4895)));	// [2178309, 3524578, 0]
	}

	public static long[] productFib(long prod) {
		List<Long> list = new ArrayList<>();
		long[] array = new long[3];
		Long current = 0L, a = 0L, b = 0L, c  = 0L; // probably not best practice but just testing
		
		list.add(0L);
		list.add(1L);

		if (prod == 0) {
			return array;
		}

		for (int i = 0; current <= prod; i++) {
			list.add(list.get(i) + list.get(i + 1));
			current = list.get(list.size() - 1);
		}

		for (int k = 0; k < list.size() - 1; k++) {
			a = list.get(k);
			b = list.get(k + 1);
			if (list.get(k) * list.get(k + 1) == prod) {
				c = 1L;
				break;
			}
			if (list.get(k) * list.get(k+1) > prod) {
				c = 0L;
				break;
			}
		}

		array[0] = a;
		array[1] = b;
		array[2] = c;
		
		return array;
	}

}
