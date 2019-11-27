package com.sam.fiveKyu;

/**
 * https://www.codewars.com/kata/human-readable-time/java
 * 
 * Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)
 * 
 * HH = hours, padded to 2 digits, range: 00 - 99
 * MM = minutes, padded to 2 digits, range: 00 - 59
 * SS = seconds, padded to 2 digits, range: 00 - 59
 * 
 * @author s.keshmiri
 *
 */

public class HumanReadableTime {
	
	public static void main(String[] args) {
		System.out.println(HumanReadableTime.makeReadable(20));
	}

	public static String makeReadable(int seconds) {
    	int h = seconds / 3600;
    	String hours = Integer.toString(h); // System.out.println("hours =" + hours);
    	seconds = seconds - Integer.parseInt(hours) * 3600;
    	int m = seconds / 60;
    	String minutes = Integer.toString(m); // System.out.println("minutes =" + minutes);
    	seconds = seconds - Integer.parseInt(minutes) * 60;
    	int s = seconds;
    	String secs = Integer.toString(s); // System.out.println("seconds =" + seconds);
    	seconds = seconds - Integer.parseInt(secs) * 60;
   
    	if (h < 10) hours = "0" + hours;
    	if (m < 10) minutes = "0" + minutes;
    	if (s < 10) secs = "0" + secs;

		return new StringBuilder(hours + ":" + minutes + ":" + secs).toString();
	}
	
}
