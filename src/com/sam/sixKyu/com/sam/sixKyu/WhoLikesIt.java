package com.sam.sixKyu;

public class WhoLikesIt {
	
	/**
	 * You probably know the "like" system from Facebook and other pages. People can "like" blog posts, pictures or other items. We want to create the text that should be displayed next to such an item.

		Implement a function likes :: [String] -> String, which must take in input array, containing the names of people who like an item. It must return the display text as shown in the examples:
		
		likes {} // must be "no one likes this"
		likes {"Peter"} // must be "Peter likes this"
		likes {"Jacob", "Alex"} // must be "Jacob and Alex like this"
		likes {"Max", "John", "Mark"} // must be "Max, John and Mark like this"
		likes {"Alex", "Jacob", "Mark", "Max"} // must be "Alex, Jacob and 2 others like this"

	 * https://www.codewars.com/kata/5266876b8f4bf2da9b000362/solutions/java
	 * 
	 * 
	 * @param strings a list of names
	 * @return a string with the names of the first few people who liked it and a count of the rest
	 */

	public static String whoLikesIt(String... strings) {

		String[] arr = new String[strings.length];
		
		if (arr.length == 1) {
			return strings[0] + " likes this";			
		} else if (arr.length == 2) {
			return strings[0] + " and " + strings[1] + " like this";			
		} else if (arr.length == 3) {
			return strings[0] + ", " + strings[1] + " and " + strings[2] + " like this";
		} else if (arr.length > 3) {
			return strings[0] + ", " + strings[1] + " and " + (arr.length-2) + " others like this";
		} else {
			return "no one likes this";
		}
	}
	
	// best solution
	/** 
		public static String whoLikesIt(String... names) {
	        switch (names.length) {
	          case 0: return "no one likes this";
	          case 1: return String.format("%s likes this", names[0]);
	          case 2: return String.format("%s and %s like this", names[0], names[1]);
	          case 3: return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
	          default: return String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
	        }
	    }
	*/
	
}
