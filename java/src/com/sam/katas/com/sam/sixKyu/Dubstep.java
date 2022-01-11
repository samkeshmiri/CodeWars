package com.sam.sixKyu;

public class Dubstep {
	
    public static String SongDecoder (String song) {
        StringBuilder sb = new StringBuilder();
        sb.append(song.replaceAll("(WUB)+", " ")); // + matches one or more occurences 
        System.out.println(sb);
        return sb.toString().trim();
    }

}
