package com.sam.fiveKyu;

import java.util.HashSet;
import java.util.Set;

/*
 * You have a string and you want to find all the possible unique substrings this string has.
 * Specifically, you should be returning the total number of unique substrings.
 * https://www.codewars.com/kata/55a304533d16fd5b0200006b/train/java
 */
public class StringAnalyzer {
    
	public static void main(String[] args) {
		System.out.println(getSubstrings("")); // 9
	}
	
    private static int getSubstrings (String source) {
    	Set<String> set = new HashSet<>();
    	
    	for(int i = 0; i < source.length(); i++) {
    		String word = source.substring(0, source.length()-i);
    		set.add(word);
    		for (int k = 1; k < word.length(); k++) {
    			String subWord = word.substring(k);
    			set.add(subWord);
    		}
    	}
    
    	return set.size();
    }
	

}
