package com.sam.fourKyu;

/**
 * https://www.codewars.com/kata/52742f58faf5485cae000b9a/solutions/java
 * Your task in order to complete this Kata is to write a function which formats a duration, given as a number of seconds, in a human-friendly way.
 *
The function must accept a non-negative integer. If it is zero, it just returns "now". Otherwise, the duration is expressed as a combination of years, days, hours, minutes and seconds.

It is much easier to understand with an example:

TimeFormatter.formatDuration(62)   //returns "1 minute and 2 seconds"
TimeFormatter.formatDuration(3662) //returns "1 hour, 1 minute and 2 seconds"
For the purpose of this Kata, a year is 365 days and a day is 24 hours.

Note that spaces are important.

Detailed rules
The resulting expression is made of components like 4 seconds, 1 year, etc. In general, a positive integer and one of the valid units of time, separated by a space. The unit of time is used in plural if the integer is greater than 1.

The components are separated by a comma and a space (", "). Except the last component, which is separated by " and ", just like it would be written in English.

A more significant units of time will occur before than a least significant one. Therefore, 1 second and 1 year is not correct, but 1 year and 1 second is.

Different components have different unit of times. So there is not repeated units like in 5 seconds and 1 second.

A component will not appear at all if its value happens to be zero. Hence, 1 minute and 0 seconds is not valid, but it should be just 1 minute.

A unit of time must be used "as much as possible". It means that the function should not return 61 seconds, but 1 minute and 1 second instead. Formally, the duration specified by of a component must not be greater than any valid more significant unit of time.
 * 
 * 
 * 
 * @author s.keshmiri
 *
 */

public class TimeFormatter {
	
	public static void main(String[] args) {
		System.out.println(TimeFormatter.formatDuration(205851834));
	}
	
    public static String formatDuration(int seconds) {
    	//System.out.println(seconds);
    	
    	StringBuilder sb = new StringBuilder("");
    	
    	// check if zero
    	if (seconds == 0) {
    		return sb.append("now").toString();
    	}
    	
    	// check if only seconds
    	if (seconds < 60) {
    		if (seconds == 1) {
    			return sb.append(seconds + " second").toString();
    		}else {
    			return sb.append(seconds + " seconds").toString();
    		}
    	} 
    	
    	int y = seconds/31536000; 
    	int years = y; // System.out.println("years =" + years);
    	seconds = seconds - years * 31536000; 
    	int d = seconds / 86400;
    	int days = d; // System.out.println("days =" + days);
    	seconds = seconds - days * 86400;
    	int h = seconds / 3600;
    	int hours = h; // System.out.println("hours =" + hours);
    	seconds = seconds - hours * 3600;
    	int m = seconds / 60;
    	int minutes = m; // System.out.println("minutes =" + minutes);
    	seconds = seconds - minutes * 60;
    	int s = seconds;
    	int secs = s; // System.out.println("seconds =" + seconds);
    	seconds = seconds - secs * 60;
    	
    	// YEARS 
    	sb.append((years == 0 ? "" : (years == 1 ? years + " year" : years + " years")));
    	if (days == 0 && hours == 0 && minutes == 0 && secs == 0) {
    		return sb.toString();
    	}
    	
    	if ((hours > 0  ^ minutes > 0 ^ secs > 0) && (days > 0 && hours > 0 && minutes > 0 && secs > 0) && years > 0
    			&& ((days == 0 && hours == 0 && minutes == 0 && secs > 0)
    				|| days == 0 && hours == 0 && minutes > 0 && secs == 0
    				|| days == 0 && hours > 0 && minutes == 0 && secs == 0
    				|| days > 0 && hours == 0 && minutes == 0 && secs == 0)			
    			) {
    		sb.append(" and ");
    	}

    	// DAYS
    	sb.append(years >= 1 ? ", " : "");
    	sb.append((days == 0 ? "" : (days == 1 ? days + " day" : days + " days")));
    	if (hours == 0 && minutes == 0 && secs == 0) {
    		return sb.toString();
    	}
    
    	if (hours > 0 ^ minutes > 0 ^ secs > 0 && !(hours > 0 && minutes > 0 && secs > 0) && (years > 0 || days > 0)) {
    		sb.append(" and ");
    	}
    	
    	// HOURS
    	sb.append(days >= 1 ? ", " : "");
    	sb.append((hours == 0 ? "" : (hours == 1 ? hours + " hour" : hours + " hours")));
    	if (minutes == 0 && secs == 0) {
    		return sb.toString();
    	}
    	
    	sb.append(hours >= 1 && !(minutes > 0 ^ secs > 0) ? ", " : "");
    	
    	if ((minutes > 0 || secs > 0) && ((minutes > 0 && !(secs >0)) || (secs > 0 && !(minutes > 0))) && (hours > 0 || days > 0 || years > 0)) {
    		sb.append(" and ");
    	}
    	
    	// MINUTES
    	sb.append((minutes == 0 ? "" : (minutes == 1 ? minutes + " minute" : minutes + " minutes")));
    	if (secs == 0) {
    		return sb.toString();
    	}
    	
    	if (!(minutes > 0 ^ secs > 0) && secs > 0) {
    		sb.append(" and ");
    	}
    	
    	// SECONDS
    	sb.append((secs == 0 ? "" : (secs == 1 ? secs + " second" : secs + " seconds")));
    	
    	
    	return sb.toString();
    }
}
