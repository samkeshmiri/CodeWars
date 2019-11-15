package com.sam.fourKyu;

public class TimeFormatter {
	
	public static void main(String[] args) {
		System.out.println(TimeFormatter.formatDuration(132030240));
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
    	if (years > 0 && days > 0 ^ hours > 0 ^ minutes > 0 ^ secs > 0 && !sb.toString().contains("and") && (days > 0 && hours > 0 && minutes > 0 && secs > 0)) {
    		sb.append(" and ");
    	}

    	// DAYS
    	sb.append(years >= 1 ? ", " : "");
    	sb.append((days == 0 ? "" : (days == 1 ? days + " day" : days + " days")));
    	if (hours == 0 && minutes == 0 && secs == 0) {
    		return sb.toString();
    	}
    
    	if (!(hours > 0 ^ minutes > 0 ^ secs > 0) && !sb.toString().contains("and") && (hours > 0 && minutes > 0 && secs > 0)) {
    		sb.append(" and ");
    	}
    	
    	// HOURS
    	sb.append(days >= 1 ? ", " : "");
    	sb.append((hours == 0 ? "" : (hours == 1 ? hours + " hour" : hours + " hours")));
    	if (minutes == 0 && secs == 0) {
    		return sb.toString();
    	}
    	
    	sb.append(hours >= 1 && !(minutes > 0 ^ secs > 0) ? ", " : "");
    	if (!(minutes > 0 ^ secs > 0) && !sb.toString().contains("and") && secs > 0 && !(minutes > 0 && secs > 0)) {
    		sb.append(" and ");
    	}
    	
    	// MINUTES
    	sb.append((minutes == 0 ? "" : (minutes == 1 ? minutes + " minute" : minutes + " minutes")));
    	if (secs == 0) {
    		return sb.toString();
    	}
    	
    	if (secs > 0 && !sb.toString().contains("and")) {
    		sb.append(" and ");
    	}
    	
    	// SECONDS
    	sb.append((secs == 0 ? "" : (secs == 1 ? secs + " second" : secs + " seconds")));
    	
    	
    	return sb.toString();
    }
}
