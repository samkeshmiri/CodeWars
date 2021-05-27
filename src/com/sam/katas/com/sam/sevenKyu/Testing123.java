package com.sam.sevenKyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Testing123 {

	public static void main(String[] args) {
		Testing123.number(Arrays.asList("a", "b", "c"));
	}

	public static List<String> number(List<String> lines) {
		List<String> result = new ArrayList<>();

		for (int i = 0; i < lines.size(); i++) {
			String s = Integer.toString(i+1);
			result.add(s + ": " + lines.get(i));
		}

		System.out.println(result);
		return result;
	}
	
}
