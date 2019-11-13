package com.sam.fiveKyu;


/**
 * https://www.codewars.com/kata/5270d0d18625160ada0000e4/solutions/java
 * 
 * Greed is a dice game played with five six-sided dice. Your mission, should you choose to accept it, is to score a throw according to these rules. You will always be given an array with five six-sided dice values.

 Three 1's => 1000 points
 Three 6's =>  600 points
 Three 5's =>  500 points
 Three 4's =>  400 points
 Three 3's =>  300 points
 Three 2's =>  200 points
 One   1   =>  100 points
 One   5   =>   50 point
A single die can only be counted once in each roll. For example, a "5" can only count as part of a triplet (contributing to the 500 points) or as a single 50 points, but not both in the same roll.

Example scoring

 Throw       Score
 ---------   ------------------
 5 1 3 4 1   50 + 2 * 100 = 250
 1 1 1 3 1   1000 + 100 = 1100
 2 4 4 5 4   400 + 50 = 450
 * 
 * @author s.keshmiri
 *
 */

public class GreedIsGood {

	public static void main(String[] args) {
		GreedIsGood.greedy(new int[] { 3, 3, 3, 3, 3 });
	}

	public static int greedy(int[] dice) {

		int countOne = 0;
		int countTwo = 0;
		int countThree = 0;
		int countFour = 0;
		int countFive = 0;
		int countSix = 0;

		for (int i = 0; i < dice.length; i++) {
			switch (dice[i]) {
			case 1:
				countOne++;
				break;
			case 2:
				countTwo++;
				break;
			case 3:
				countThree++;
				break;
			case 4:
				countFour++;
				break;
			case 5:
				countFive++;
				break;
			case 6:
				countSix++;
				break;
			default:
				break;

			}
		}

		int sum = 0;

		if (countOne == 3 || countOne > 3) {
			sum += 1000;
			countOne -= 3;
		}
		if (countSix == 3 || countSix > 3) {
			sum += 600;
			countSix -= 3;
		}
		if (countFive == 3 || countFive > 3) {
			sum += 500;
			countFive -= 3;
		}
		if (countFour == 3 || countFour > 3) {
			sum += 400;
			countFour -= 3;
		}
		if (countThree == 3 || countThree > 3) {
			sum += 300;
			countThree -= 3;
		}
		if (countTwo == 3 || countTwo > 3) {
			sum += 200;
			countTwo -= 3;
		}

		if (countOne != 3) {
			for (int i = 0; i < countOne; i++) {
				sum += 100;
			}
		}

		if (countFive != 3) {
			for (int i = 0; i < countFive; i++) {
				sum += 50;
			}
		}
		System.out.println(sum);
		return sum;
	}
}
