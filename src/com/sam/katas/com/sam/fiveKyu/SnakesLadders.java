package com.sam.fiveKyu;

import java.util.HashMap;
import java.util.Map;

public class SnakesLadders {

	final Map<Integer, Integer> SNAKEORLADDER = new HashMap<>();
	final int WIN;
	int player1pos;
	int player2pos;
	boolean p1Turn;
	boolean p2Turn;

	public static void main(String[] args) {
		SnakesLadders game = new SnakesLadders();
		System.out.println(game.play(1, 1));
	}

	public SnakesLadders() {
		this.player1pos = 0;
		this.player2pos = 0;
		this.p1Turn = true;
		this.p2Turn = false;
		this.WIN = 100;
		this.SNAKEORLADDER.put(99, 80);
		this.SNAKEORLADDER.put(95, 75);
		this.SNAKEORLADDER.put(92, 88);
		this.SNAKEORLADDER.put(89, 68);
		this.SNAKEORLADDER.put(74, 53);
		this.SNAKEORLADDER.put(62, 19);
		this.SNAKEORLADDER.put(64, 60);
		this.SNAKEORLADDER.put(46, 25);
		this.SNAKEORLADDER.put(49, 11);
		this.SNAKEORLADDER.put(16, 6);
		this.SNAKEORLADDER.put(2, 38);
		this.SNAKEORLADDER.put(7, 14);
		this.SNAKEORLADDER.put(8, 31);
		this.SNAKEORLADDER.put(15, 26);
		this.SNAKEORLADDER.put(21, 42);
		this.SNAKEORLADDER.put(28, 84);
		this.SNAKEORLADDER.put(36, 44);
		this.SNAKEORLADDER.put(51, 67);
		this.SNAKEORLADDER.put(71, 91);
		this.SNAKEORLADDER.put(78, 98);
		this.SNAKEORLADDER.put(87, 94);
	}

	public String play(int die1, int die2) {

		boolean reroll = false;
		int roll = die1 + die2;

		if (p1Turn == false && p2Turn == false) {
			p1Turn = true;
			return "Game over!";
		}

		if (p1Turn) {
			player1pos += roll;
			if (player1pos > 100) {
				player1pos = player1pos - (player1pos - 100) *2;
			}
		} else {
			player2pos += roll;
			if (player2pos > 100) {
				player2pos = player2pos - (player2pos - 100) *2;
			}
		}
		
		if (die1 == die2) {
			reroll = true;
		}

		if (p1Turn && SNAKEORLADDER.containsKey(player1pos)) {
			player1pos = SNAKEORLADDER.get(player1pos);
			if (player1pos == WIN) {
				p1Turn = false;
				p2Turn = false;
				return "Player 1 Wins!";
			}
			if (reroll) {
				p1Turn = true;
				p2Turn = false;
				return "Player 1 is on square " + player1pos;
			} else {
				p1Turn = false;
				p2Turn = true;
				return "Player 1 is on square " + player1pos;
			}
		} else if (p1Turn && !SNAKEORLADDER.containsKey(player1pos) || p1Turn && !SNAKEORLADDER.containsKey(player1pos)) {
			if (player1pos == WIN) {
				p1Turn = false;
				p2Turn = false;
				return "Player 1 Wins!";
			}
			if (reroll) {
				p1Turn = true;
				p2Turn = false;
				return "Player 1 is on square " + player1pos;
			} else {
				p1Turn = false;
				p2Turn = true;
				return "Player 1 is on square " + player1pos;
			}
		}

		if (p2Turn && SNAKEORLADDER.containsKey(player2pos)) {
			player2pos = SNAKEORLADDER.get(player2pos);
			if (player2pos == WIN) {
				p1Turn = false;
				p2Turn = false;
				return "Player 2 Wins!";
			}
			if (reroll) {
				p1Turn = false;
				p2Turn = true;
				return "Player 2 is on square " + player2pos;
			} else {
				p1Turn = true;
				p2Turn = false;
				return "Player 2 is on square " + player2pos;
			}
		} else if (p2Turn && !SNAKEORLADDER.containsKey(player2pos) || p2Turn && !SNAKEORLADDER.containsKey(player2pos)) {
			if (player2pos == WIN) {
				p1Turn = false;
				p2Turn = false;
				return "Player 2 Wins!";
			}
			if (reroll) {
				p2Turn = true;
				p1Turn = false;
				return "Player 2 is on square " + player2pos;
			} else {
				p1Turn = true;
				p2Turn = false;
				return "Player 2 is on square " + player2pos;
			}
		}
		return null;
	}

}
