package com.sam.sixKyu;

public class TwoSum {
	
	public static int[] twoSum(int[] numbers, int target) {
		
		int[] arr = doStuff(numbers, target, 0);
		return arr;
    }
    
    public static void main(String[] args) {
    	System.out.println(twoSum(new int[]{1,2,3}, 4)); // 0,2
	}
    
    public static int[] doStuff(int[] nums, int target, int index) {
    	
    	for (int i = 0; i < nums.length; i++) {
    		if (nums[index] + nums[i] == target) {
    			System.out.println(index + ", " + i);
    			return new int[] {index, i};
    		}
    	}
    	
    	index++;
    	
    	return doStuff(nums, target, index);
    }
    
}
    
