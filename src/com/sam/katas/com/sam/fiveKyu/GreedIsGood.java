package com.sam.fiveKyu;

public class GreedIsGood {
	
	public static void main(String[] args) {
		GreedIsGood.greedy(new int[]{3,3,3,3,3});
	}
	
	public static int greedy(int[] dice) {
		
		int countOne = 0;
		int countTwo = 0;
		int countThree = 0;
		int countFour = 0;
		int countFive = 0;
		int countSix = 0;
		
		
		for (int i = 0; i < dice.length; i++) {
			switch(dice[i]) {
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
			sum+=1000;
			countOne -=3;
		}
		if (countSix == 3 || countSix > 3) {
			sum+=600;
			countSix -=3;
		}
		if (countFive == 3 || countFive > 3) {
			sum+=500;
			countFive -= 3;
		}
		if (countFour == 3 || countFour > 3) {
			sum+=400;
			countFour -=3;
		}
		if (countThree == 3 || countThree > 3) {
			sum+=300;
			countThree -=3;
		}
		if (countTwo == 3 || countTwo > 3) {
			sum+=200;
			countTwo -=3;
		}
		
		if (countOne != 3) {
			for (int i = 0; i < countOne; i++) {
				sum+= 100;
			}
		}
			
		if (countFive != 3) {
			for (int i = 0; i < countFive; i++) {
				sum+= 50;
			}
		}
		System.out.println(sum);
		return sum;		
	}
}
