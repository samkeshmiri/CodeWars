package com.sam.sixKyu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EasyBalanceChecking {
	
	public static void main(String[] args) {
		EasyBalanceChecking.balance("1000.00!=\n125 Market !=:125.45\n126 Hardware =34.95\n127 Video! 7.45\n128 Book :14.32\n129 Gasoline ::16.10");
	}
	
	public static String balance(String book) {
		StringBuilder sb = new StringBuilder("");
		sb.append(book.replaceAll("[^a-zA-Z0-9.]", ""));
		
		sb.insert(0, "Original Balance: ");
		
		Matcher matcher = Pattern.compile("\\d+").matcher(sb);
		matcher.find();
		
		
		return sb.toString();
	}

}
