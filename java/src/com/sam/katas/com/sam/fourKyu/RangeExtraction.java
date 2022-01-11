package com.sam.fourKyu;

/**
 * https://www.codewars.com/kata/51ba717bb08c1cd60f00002f/java A format for
 * expressing an ordered list of integers is to use a comma separated list of
 * either
 * 
 * individual integers or a range of integers denoted by the starting integer
 * separated from the end integer in the range by a dash, '-'. The range
 * includes all integers in the interval including both endpoints. It is not
 * considered a range unless it spans at least 3 numbers. For example
 * "12,13,15-17" Complete the solution so that it takes a list of integers in
 * increasing order and returns a correctly formatted string in the range
 * format.
 * 
 * 
 * @author s.keshmiri
 *
 */
public class RangeExtraction {

	public static String rangeExtraction(int[] is) {

		StringBuilder sb = new StringBuilder();
		int start = is[0], current = is[0], end = is[1], distance = 1;

		for (int i = 0; i <= is.length - 2; i++) {

			if (end - current == 1) {
				distance++;
				current = is[i + 1];
				end = is[i + 2];
			} else {
				if (distance >= 3) {
					sb.append(start).append("-").append(current).append(",");
					distance = 1;
					current = end;
					start = end;
					end = is[i + 2];
				} else if (distance == 2) {
					sb.append(start).append(",").append(current).append(",");
					distance = 1;
					current = end;
					start = end;
					end = is[i + 2];
				} else {
					sb.append(current).append(",");
					current = end;
					start = end;
					end = is[i + 2];
				}
			}

			if (i + 1 == is.length - 2) {

				if (end - current == 1) {
					distance++;
					if (distance >= 3) {
						sb.append(start).append("-").append(end);
						break;
					} else if (distance == 2) {
						sb.append(current).append(",").append(end);
						break;
					} else {
						sb.append(current).append(",").append(end);
						break;
					}
				} else {
					if (distance >= 3) {
						sb.append(start).append("-").append(current).append(",").append(end);
						break;
					} else if (distance == 2) {
						sb.append(start).append(",").append(current).append(",").append(end);
						break;
					} else {
						sb.append(start).append(",").append(end);
						break;
					}
				}
			}

		}

		return sb.toString();
	}

}
