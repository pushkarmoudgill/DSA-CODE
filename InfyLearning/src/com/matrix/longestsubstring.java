package com.matrix;

import java.util.HashMap;

public class longestsubstring {
public static void main(String[] args) {
	String str="dvdf";
	HashMap<Character, Integer> map = new HashMap<>();
	int l=0,r=0;
	int max=0;
	for(r=0;r<str.length();r++) {
		
		if( map.containsKey(str.charAt(r))) {
			l++;
			//r=l;
		}
		map.put(str.charAt(r), r);
			max=Math.max((r-l)+1, max);
			
		
	}
	System.out.println(max);
}
}
