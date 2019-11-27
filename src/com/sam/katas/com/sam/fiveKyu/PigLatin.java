package com.sam.fiveKyu;

/**
 * https://www.codewars.com/kata/simple-pig-latin/java
 * 
 * Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
 * 
 * EXAMPLES
 * pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
 * pigIt('Hello world !');     // elloHay orldway !
 * 
 * @author s.keshmiri
 *
 */

public class PigLatin {

	public static void main(String[] args) {
		System.out.println(PigLatin.pigIt("Pig latin is cool !"));
	}

	public static String pigIt(String str) {
		String[] arr = str.split(" ");
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > 1 && arr[i].matches("[a-zA-Z]+")) {
				String word = arr[i].substring(1, arr[i].length()) + arr[i].charAt(0) + "ay ";
				sb.append(word);
			} else if (arr[i].length() == 1 && arr[i].matches("[a-zA-Z]+")) {
				sb.append(arr[i]+ "ay ");
			} else {
				sb.append(arr[i] + " ");
			}
		}
		return sb.toString().stripTrailing();
	}
}
