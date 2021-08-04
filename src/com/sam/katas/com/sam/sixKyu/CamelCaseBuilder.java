package com.sam.sixKyu;

/**
 * https://www.codewars.com/kata/517abf86da9663f1d2000003 Complete the
 * method/function so that it converts dash/underscore delimited words into
 * camel casing. The first word within the output should be capitalized only if
 * the original word was capitalized (known as Upper Camel Case, also often
 * referred to as Pascal case).
 * 
 * @author s.keshmiri
 *
 */
public class CamelCaseBuilder {

	public static void main(String[] args) {
		System.out.println(toCamelCase("the_stealth-warrior"));
	}

	static String toCamelCase(String s) {
		String[] arr = s.split("[-_]");
		StringBuilder sb = new StringBuilder(arr[0]);

		for (int i = 1; i < arr.length; i++) {
			String camelWord = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
			sb.append(camelWord);
		}

		return sb.toString();
	}

}
