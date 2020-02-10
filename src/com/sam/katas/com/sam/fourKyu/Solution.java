package com.sam.fourKyu;

import java.util.Arrays;

public class Solution {
	
	public static void main(String[] args) {
		System.out.println(Solution.bowling_score("X X X X X X X X X 11")); // 30
	}
	
	public static int bowling_score(String frames) {
		String[] splitFrames = frames.split(" ");
		int[] frameScores = new int[10];
		boolean strike = false;
		boolean spare = false;
		
		for (int i = 0; i < splitFrames.length; i++) {		
			int frameScore = 0;
			String[] frame = splitFrames[i].split("");
			if (frame[0].matches("[0-9]")) {
				if (frame[1].matches("[0-9]")) {
					if (strike) {
						frameScore = (2*(Integer.parseInt(frame[0]) + Integer.parseInt(frame[1])));
						strike = false;
					} else {
						frameScore = Integer.parseInt(frame[0]) + Integer.parseInt(frame[1]);
					}
				} else if (frame[1].matches("[\\\\]")) {
					frameScore = Integer.parseInt(frame[0]) + 10;
				}
			}
			if (frame[0].matches("[X]")) {
				frameScore = 10;
				if (strike) {
					frameScore += 20;
				}
				strike = true;
			}
			frameScores[i] = frameScore;
		}
		
		return Arrays.stream(frameScores).sum();
	}

}
