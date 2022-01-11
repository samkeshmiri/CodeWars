package com.sam.sixKyu;

import java.util.ArrayList;
import java.util.stream.Collectors;

import org.junit.platform.commons.util.StringUtils;

public class EncryptThis {

	public static void main(String[] args) {
		System.out.println(encryptThis("A wise old owl lived in an oak")); //65 119esi 111dl 111lw 108dvei 105n 97n 111ka
	}

	public static String encryptThis(String text) {
		
		if (StringUtils.isBlank(text)) return "";

		ArrayList<String> list = new ArrayList<>(text.split(" ").length);

		for (String s : text.split(" ")) {
			String word = "";
			word += Integer.valueOf(s.charAt(0));
			if (s.length() > 1) {
				String lastLetter = String.valueOf(s.charAt(s.length()-1));
				word += lastLetter;
				if (s.length() > 2) {
					if (s.length() > 3) {
						String middle = s.substring(2,s.length()-1);
						word += middle;
					}
					String firstLetter  = String.valueOf(s.charAt(1));
					word += firstLetter;
				}
			}	
				list.add(word);
		}

		return list.stream().collect(Collectors.joining(" "));
	}

}
