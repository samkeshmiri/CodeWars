package com.sam.sevenKyu;

/**
 * https://www.codewars.com/kata/57c1ab3949324c321600013f/solutions/java
 * 
 * Your task is to write a function toLeetSpeak that converts a regular english
 * sentence to Leetspeak.
 * 
 * @author s.keshmiri
 *
 */

public class LeetSpeak {
	static String toLeetSpeak(final String speak) {
		StringBuilder sb = new StringBuilder("");
		char[] arr = speak.toCharArray();

		for (char c : arr)
			switch (c) {
			case 'A':
				sb.append('@');
				break;
			case 'B':
				sb.append('8');
				break;
			case 'C':
				sb.append('(');
				break;
			case 'D':
				sb.append('D');
				break;
			case 'E':
				sb.append('3');
				break;
			case 'F':
				sb.append('F');
				break;
			case 'G':
				sb.append('6');
				break;
			case 'H':
				sb.append('#');
				break;
			case 'I':
				sb.append('!');
				break;
			case 'J':
				sb.append('J');
				break;
			case 'K':
				sb.append('K');
				break;
			case 'L':
				sb.append('1');
				break;
			case 'M':
				sb.append('M');
				break;
			case 'N':
				sb.append('N');
				break;
			case 'O':
				sb.append('0');
				break;
			case 'P':
				sb.append('P');
				break;
			case 'Q':
				sb.append('Q');
				break;
			case 'R':
				sb.append('R');
				break;
			case 'S':
				sb.append('$');
				break;
			case 'T':
				sb.append('7');
				break;
			case 'U':
				sb.append('U');
				break;
			case 'V':
				sb.append('V');
				break;
			case 'W':
				sb.append('W');
				break;
			case 'X':
				sb.append('X');
				break;
			case 'Y':
				sb.append('Y');
				break;
			case 'Z':
				sb.append('2');
				break;
			case ' ':
				sb.append(' ');
				break;
			default:
				sb.append(c);
				break;
			}
		return sb.toString();
	}
}
