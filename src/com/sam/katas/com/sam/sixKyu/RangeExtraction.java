// https://www.codewars.com/kata/5edc8c53d7cede0032eb6029/solutions/java

package com.sam.sixKyu;

class Solution{
	
	public static void main(String[] args) {
		System.out.println(solve(11)); // 25 (5*5 and 11 + 5 == 16 sqrt = 4^2)
	}
	
    public static long solve(int n){
    	//check for smallest square by looping x to n
    	// check if x is a perfect square on each iteration
    	// if x is perfect square
    	// check if x + n is a perfect square number 
    	// return that i
    	
    	for (int i = 1; i < n; i++) {
    		double sr = Math.sqrt(Math.pow(i, 2) + n);
    		if (isPerfectSquare(sr)) {
    			
    			return (long) Math.pow(i, 2);
    		}
    	}

    	return -1L;
    }
    
    public static boolean isPerfectSquare(double n) {
    	if (n - Math.floor(n) == 0) {
    		return true;
    	}
    	return false;
    }
}
