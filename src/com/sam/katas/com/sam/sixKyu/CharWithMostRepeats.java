package com.sam.sixKyu;

public class CharWithMostRepeats {
	
	public static void main(String[] args) {
		longestRepetition("aaaabb");
		longestRepetition("bbbaaabaaaa");
		longestRepetition("aaaabaaaaqbqqqqqbttttzzzzzzzxxxt");
	}
	
	public static Object[] longestRepetition(String s) {
		int count = 0;
		int tempCount = 0;
		char[] arr = s.toCharArray();
		StringBuilder mostRepeatedChar = new StringBuilder();
		StringBuilder currentChar = new StringBuilder();
		
		
		if (s.length()==0) {
			return new Object[] {"",0};
		} else {
			mostRepeatedChar.append(arr[0]);
			currentChar.append(arr[0]);
			count = 0;
			tempCount = 0;
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] == currentChar.charAt(0)) {
					tempCount++;
					if (tempCount > count) {
						mostRepeatedChar.deleteCharAt(0);
						mostRepeatedChar.append(arr[i]);
						count = tempCount;
					}
				} else {
					currentChar.deleteCharAt(0); 
					currentChar.append(arr[i]);
					tempCount = 1;
				}
			}
			System.out.print(mostRepeatedChar.toString() + ", " + count);
			
			return new Object[] {mostRepeatedChar.toString(), count};
		}
	}

}
