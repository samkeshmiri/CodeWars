package com.sam.sixKyu;

import java.util.Arrays;

public class PangramChecker {

	public static void main(String[] args) {
		System.out.println(check("the quick brown fox jumps over the lazy dog"));
	}

	public static boolean check(String sentence) {
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		String[] alphaSplit = alpha.split("");
		String[] cleanedAlpha;
		
		for (int i = 0; i < alphaSplit.length; i++) {
			if (sentence.toLowerCase().contains(alphaSplit[i])) {
				alphaSplit[i] = "";
			}
		}
		
		cleanedAlpha = Arrays.stream(alphaSplit).filter((x -> !x.isEmpty())).toArray(String[]::new);
		
		if (cleanedAlpha.length > 0) {
			return false;
		}
		
		return true;
		
	}

}
