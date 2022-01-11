package com.sam.sixKyu;

import java.util.*;

/**
 * https://www.codewars.com/kata/583203e6eb35d7980400002a
 * 
 * Given an array (arr) as an argument complete the function countSmileys that should return the total number of smiling faces.
Rules for a smiling face:
-Each smiley face must contain a valid pair of eyes. Eyes can be marked as : or ;
-A smiley face can have a nose but it does not have to. Valid characters for a nose are - or ~
-Every smiling face must have a smiling mouth that should be marked with either ) or D.
No additional characters are allowed except for those mentioned.
Valid smiley face examples:
:) :D ;-D :~)
Invalid smiley faces:
;( :> :} :]

Example cases:

countSmileys([':)', ';(', ';}', ':-D']);       // should return 2;
countSmileys([';D', ':-(', ':-)', ';~)']);     // should return 3;
countSmileys([';]', ':[', ';*', ':$', ';-D']); // should return 1;

Note: In case of an empty array return 0. You will not be tested with invalid input (input will always be an array). Order of the face (eyes, nose, mouth) elements will always be the same
 * 
 * @author s.keshmiri
 *
 */

public class SmileFaces {

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add(":)");
		arr.add(":D");
		arr.add(";-D");
		arr.add("no");
		
		System.out.println(SmileFaces.countSmileys(arr));
	}

	public static int countSmileys(List<String> arr) {
		int count = 0;
		
		for (int i = 0; i < arr.size(); i++) {
			int pos = 0;
			String word = arr.get(i);
			if (word.length() == 2) {
				if (((word.charAt(pos) == ':' || word.charAt(pos) == ';')) && (word.charAt(pos+1) == ')' || word.charAt(pos+1) == 'D')) {
					count+=1;
				}
			}
			if (word.length() == 3) {
				if (((word.charAt(pos) == ':' || word.charAt(pos) == ';')) 
						&& (word.charAt(pos+1) == '-' || word.charAt(pos+1) == '~')
						&& (word.charAt(pos+2) == ')' || word.charAt(pos+2) == 'D')) {
					count+=1;
				}
			}
		}
		return count;
	}
}