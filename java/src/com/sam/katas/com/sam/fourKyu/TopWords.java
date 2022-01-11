package com.sam.fourKyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.junit.platform.commons.util.StringUtils;

/**
 * Write a function that, given a string of text (possibly with punctuation and
 * line-breaks), returns an array of the top-3 most occurring words, in
 * descending order of the number of occurrences.
 *
 *
 * https://www.codewars.com/kata/51e056fe544cf36c410000fb/train/java
 * 
 * @author s.keshmiri
 *
 */
public class TopWords {

	@SuppressWarnings("serial")
	public static List<String> top3(String s) {

		if (s.length() == 0)
			return new ArrayList<String>();

		String[] list = s.toLowerCase().split("[^\\w'a-zA-Z]+|_");

		Map<String, Integer> map = new HashMap<>();

		Predicate<String> symbols = Pattern.compile("('\\w+)|(\\w+'\\w+)|(\\w+')|(\\w+)").asPredicate();

		// remove white spaces and symbols
		list = Arrays.stream(list).filter(word -> (StringUtils.isNotBlank(word) && symbols.test(word)))
				.toArray(String[]::new);

		Pattern wordApostrophePattern = Pattern.compile("('\\w+)|(\\w+'\\w+)|(\\w+')|(\\w+)");
		for (String word : list) {
			Matcher apostMatcher = wordApostrophePattern.matcher(word);
			if (apostMatcher.find()) {
				map.merge(word, 1, Integer::sum);
			} else {
				continue;
			}
		}

		LinkedHashMap<String, Integer> sortedMap = map.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		Set<String> entries = sortedMap.keySet();
		String[] arr = entries.toArray(String[]::new);

		if (sortedMap.size() == 1) {
			return new ArrayList<>() {
				{
					add(arr[0]);
				}
			};
		}

		if (sortedMap.size() == 2) {
			return new ArrayList<>() {
				{
					add(arr[0]);
					add(arr[1]);
				}
			};
		}

		if (sortedMap.size() >= 3) {
			return new ArrayList<>() {
				{
					add(arr[0]);
					add(arr[1]);
					add(arr[2]);
				}
			};
		}

		return new ArrayList<String>();
	}

}
