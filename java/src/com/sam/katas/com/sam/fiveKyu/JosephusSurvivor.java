package com.sam.fiveKyu;

import java.util.ArrayList;
import java.util.List;

public class JosephusSurvivor {
	static int l = 0;
	static List<Integer> list = new ArrayList<>();

	public static void main(String[] args) {
		System.out.println(josephusSurvivor(7, 3));
	}

	public static int josephusSurvivor(final int n, final int k) {
		int x;
		if (n == 1) {
			return 1;
		} else {

			for (int i = 1; i <= n; i++) {
				list.add(i);
			}

			x = survivor(k);
			list.clear();
		}
		return x;

	}

	public static int survivor(int pos) {
		while (list.size() > 1) {
			l = (l + pos - 1) % list.size();
			list.remove(l);
		}
		System.out.println(list);
		return list.get(0);

	}
}