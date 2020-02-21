package com.sam.fourKyu;

import java.util.SortedSet;
import java.util.TreeSet;

public class DoubleLinear {
	
	public static void main(String[] args) {
		long start = System.nanoTime();
		System.out.println(dblLinear2(60000));
		long elapsedTime = System.nanoTime() - start;
		System.out.println(elapsedTime);
	}
	
	public static int dblLinear(int n) {
		TreeSet<Integer> set = new TreeSet<>();
		set.add(1);
		
		for (int i = 0; i < n; i++) {
			int x = set.pollFirst();
			set.add(2 * x + 1);
			set.add(3 * x + 1);
		}
		
		return set.pollFirst();
	}
	
    public static int dblLinear2(int n) {
        if (n == 0) return 1;
        SortedSet<Integer> u = new TreeSet<>();
        u.add(1);
        for(int i=0; i<n; i++) {
            int x = u.first();
            u.add(x*2+1);
            u.add(x*3+1);
            u.remove(x);
        }
        return u.first();
    }

}
