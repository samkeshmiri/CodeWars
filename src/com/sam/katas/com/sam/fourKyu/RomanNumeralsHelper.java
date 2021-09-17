package com.sam.fourKyu;
import java.util.TreeMap;

public class RomanNumeralsHelper {
  
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

  
	static TreeMap<String, Integer> map = new TreeMap<>();

	static {
		map.put("I", 1);
		map.put("IV", 4);
		map.put("V", 5);
		map.put("IX", 9);
		map.put("X", 10);
		map.put("XL", 40);
		map.put("L", 50);
		map.put("XC", 90);
		map.put("C", 100);
		map.put("CD", 400);
		map.put("D", 500);
		map.put("CM", 900);
		map.put("M", 1000);
	}

  public static String toRoman(int n) {
    int floor = numberToRoman.floorKey(n);
		if (floor == n) {
			return numberToRoman.get(n);
		}
		return numberToRoman.get(floor) + toRoman(n - floor);
  }
  
  public static int fromRoman(String romanNumeral) {
    
		if (map.containsKey(romanNumeral)) {
			return map.get(romanNumeral);
		}

		int result = 0;
		char[] arr = romanNumeral.toCharArray();
		String t = romanNumeral;

		for (int i = 0; i < arr.length-1; i++) {
			String t1 = romanNumeral.substring(i, i+2);
			if (map.containsKey(t1)) {
				result += map.get(t1);
				t = t.replace(t1, "");
			} 
		}

		for (char c : t.toCharArray()) {
			result += map.get(Character.toString(c));
		}
		
		return result;
  }
}