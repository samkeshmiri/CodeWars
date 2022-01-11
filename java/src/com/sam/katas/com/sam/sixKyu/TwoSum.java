package com.sam.sixKyu;

/**
 * Write a function that takes an array of numbers (integers for the tests) and
 * a target number. It should find two different items in the array that, when
 * added together, give the target value. The indices of these items should then
 * be returned in a tuple like so: (index1, index2).
 * 
 * https://www.codewars.com/kata/52c31f8e6605bcc646000082
 * 
 * @author s.keshmiri
 *
 */
public class TwoSum {

	public static int[] twoSum(int[] numbers, int target) {

		int[] arr = doStuff(numbers, target, 0);
		return arr;
	}

	public static void main(String[] args) {
		System.out.println(twoSum(new int[] { 1, 2, 3 }, 4)); // 0,2
	}

	public static int[] doStuff(int[] nums, int target, int index) {

		for (int i = 0; i < nums.length; i++) {
			if (nums[index] + nums[i] == target) {
				System.out.println(index + ", " + i);
				return new int[] { index, i };
			}
		}

		index++;

		return doStuff(nums, target, index);
	}

}
