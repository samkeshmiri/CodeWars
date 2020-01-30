package com.sam.fourKyu;

import java.util.HashSet;
import java.util.Set;

public class SudokuValidator {

	public static void main(String[] args) {
	       int[][] sudoku = {
	                {5, 3, 4, 6, 7, 8, 9, 1, 2},
	                {6, 7, 2, 1, 9, 5, 3, 4, 8},
	                {1, 9, 8, 3, 4, 2, 5, 6, 7},
	                {8, 5, 9, 7, 6, 1, 4, 2, 3},
	                {4, 2, 6, 8, 5, 3, 7, 9, 1},
	                {7, 1, 3, 9, 2, 4, 8, 5, 6},
	                {9, 6, 1, 5, 3, 7, 2, 8, 4},
	                {2, 8, 7, 4, 1, 9, 6, 3, 5},
	                {3, 4, 5, 2, 8, 6, 1, 7, 9}
	        };
		System.out.println(SudokuValidator.check(sudoku));
	}

	public static boolean check(int[][] sudoku) {

		if (!checkRow(sudoku)) {
			return false;
		} else if (!checkColumn(sudoku)) {
			return false;
		} else if (!checkGrid(sudoku)) {
			return false;
		}
		return true;
	}

	public static boolean checkColumn(int[][] sudoku) {
		for (int i = 0; i < sudoku.length; i++) {
			Set<Integer> set = new HashSet<>();
			for (int x = 0; x < 9; x++) {
				set.add(sudoku[i][x]);
			}
			if (set.size() != 9) {
				return false;
			}
		}
		return true;
	}

	public static boolean checkRow(int[][] sudoku) {
		for (int[] line : sudoku) {
			Set<Integer> SET = new HashSet<>();
			for (int number : line) {
				SET.add(number);
			}
			if (SET.size() != 9) {
				return false;
			}
		}
		return true;
	}

	public static boolean checkGrid(int[][] sudoku) {
		for (int k = 0; k < 9; k+=3) {
			Set<Integer> set = new HashSet<>();
			for (int i = 0; i < 9; i+=3) { // start of 3*3 grid
				for (int j = 0; j < 9; j++) { 
					set.add(sudoku[k+j%3][i+j/3]);
				}
				if (set.size() != 9) {
					return false;
				}
			}
		}
		return true;
	}
	
}
