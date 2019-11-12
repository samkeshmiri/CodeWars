package com.sam.sixkyu;

public class YourOrderPlease {
	
	// https://www.codewars.com/kata/55c45be3b2079eccff00010f

	public static String order(String words) {
		String[] sl = words.split(" ");
		String result = new String("");

		if (words.equals(""))
			return "";

		for (int i = 0; i < 10; i++) {
			for (String str : sl) {
				if (str.contains(Integer.toString(i))) {
					result += str + " "; // add space in between words
					System.out.println(result);
				}
			}
		}
		result = result.substring(0, result.length() - 1); // to remove extra space inbetween words
		return result;
	}

}
