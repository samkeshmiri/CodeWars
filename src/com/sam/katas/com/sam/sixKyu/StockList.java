package com.sam.sixKyu;
import java.util.HashMap;

public class StockList {

	public static void main(String[] args) {
		System.out.println(
				StockList.stockSummary(new String[] { "ABAR 200", "ABRA 100", "CDXE 500", "BKWR 250","ASSS 900", "BTSQ 890", "DRTY 600" },
						new String[] { "A", "B" }));
	}

	public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (String s : lstOf1stLetter) {
			map.put(s, 0);
		}
		
		for (int i = 0; i < lstOfArt.length; i++) {
			String[] item = lstOfArt[i].split(" ");
			String letter = Character.toString(item[0].charAt(0));
			Integer amount = Integer.parseInt(item[1]);
			if (map.containsKey(letter)) {
				int books = Integer.parseInt(item[1]);
				Integer total = Integer.valueOf(map.get(letter));
				map.put(letter, total + books);
			}
		}

		StringBuilder sb = new StringBuilder();

		map.entrySet().forEach(entry -> {
			sb.append("(" + entry.getKey() + " : " + entry.getValue() + ")" + " - ");
		});

		return sb.delete(sb.length() - 3, sb.length()).toString();
	}

}
