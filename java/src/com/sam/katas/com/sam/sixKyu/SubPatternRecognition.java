package com.sam.sixKyu;

/**
 * https://www.codewars.com/kata/5a49f074b3bfa89b4c00002b/solutions/java
 * 
 * In this kata you need to build a function to return either true/True or false/False if a string can be seen as the repetition of a simpler/shorter subpattern or not.

For example:

hasSubpattern("a") === false; //no repeated pattern
hasSubpattern("aaaa") === true; //created repeating "a"
hasSubpattern("abcd") === false; //no repeated pattern
hasSubpattern("abababab") === true; //created repeating "ab"
hasSubpattern("ababababa") === false; //cannot be entirely reproduced repeating a pattern
Strings will never be empty and can be composed of any character (just consider upper- and lowercase letters as different entities) and can be pretty long (keep an eye on performances!).
 * 
 * 
 * @author s.keshmiri
 *
 */

public class SubPatternRecognition {
	
	public static void main(String[] args) {
		System.out.println(SubPatternRecognition.hasSubPattern("basketask"));
	}
	
	public static boolean hasSubPattern(String str) {
		if (str.length() < 2) {
			return false;
		}
		
		return ((str + str).indexOf(str, 1) != str.length());
	}

}
