package com.sam.fourKyu;

public class RangeExtraction {
	
	public static String rangeExtraction(int[] is) {
		
		StringBuilder sb = new StringBuilder();
		int start = is[0], current = is[0], end = is[1], distance = 1;
		
		for (int i = 0; i <= is.length-2; i++) {
			
			if (end - current == 1) {
				distance++;
				current = is[i+1];
				end = is[i+2];
			} else {
				if (distance >= 3) {
					sb.append(start).append("-").append(current).append(",");
					distance = 1;
					current = end;
					start = end;
					end = is[i+2];
				} else if (distance == 2) {
					sb.append(start).append(",").append(current).append(",");
					distance = 1;
					current = end;
					start = end;
					end = is[i+2];
				} else {
					sb.append(current).append(",");
					current = end;
					start = end;
					end = is[i+2];
				}
			}
			
			if (i+1 == is.length-2) {
				
				if (end - current == 1) {
					distance++;
					if (distance >=3 ) {
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
