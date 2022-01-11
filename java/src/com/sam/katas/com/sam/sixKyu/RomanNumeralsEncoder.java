package com.sam.sixKyu;

import java.util.TreeMap;

public class RomanNumeralsEncoder {

	public static void main(String[] args) {
		RomanNumeralsEncoder r = new RomanNumeralsEncoder();
		System.out.println(r.solution(1994)); // MDCLXVI
	}

	static TreeMap<Integer, String> numberToRoman = new TreeMap<>();

	static {
		numberToRoman.put(1, "I");
		numberToRoman.put(4, "IV");
		numberToRoman.put(5, "V");;
		numberToRoman.put(9, "IX");
		numberToRoman.put(10, "X");
		numberToRoman.put(40, "XL");
		numberToRoman.put(50, "L");
		numberToRoman.put(90, "XC");
		numberToRoman.put(100, "C");
		numberToRoman.put(400, "CD");
		numberToRoman.put(500, "D");
		numberToRoman.put(900, "CM");
		numberToRoman.put(1000, "M");
	}

	public String solution(int n) {
		int floor = numberToRoman.floorKey(n);
		if (floor == n) {
			return numberToRoman.get(n);
		}
		return numberToRoman.get(floor) + solution(n - floor);
	}

}
