package com.heapMAp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CheckAnagram {
	
	public static void main(String [] args) {
		
		Scanner sc =new Scanner (System.in);
		
		
		
		String s =sc.next();
		String t =sc.next();
		
		if(s.length()<t.length()) {
			System.out.println(0);
		}
		
		
	int ans=	countAnagramSubString(s,t);
	
	System.out.println(ans);

		
		
	}
	
	static int countAnagramSubString(String s,String t) {
		
		int count=0;
		
		HashMap<Character,Integer> sMap = new HashMap<>();
		
		for(char c : t.toCharArray()) {
			sMap.put(c, sMap.getOrDefault(c, 0) +1 );


		}
		for(int i=0;i<=s.length() - t.length();i++) {
			 
			String sSub=s.substring(i, i+t.length());
			
			
			HashMap<Character,Integer> tMap = new HashMap<>();
			
			for(char c : sSub.toCharArray()) {
				tMap.put(c, tMap.getOrDefault(c, 0) +1 );


			}
			
			   if (isAnagram(sMap, tMap)) {
	                count++;
	            }
			
		}
		
		
		
		return count;
		
	}
	
	static  boolean isAnagram(HashMap<Character, Integer> subFreq, HashMap<Character, Integer> tFreq) {
		 return subFreq.equals(tFreq);
}
}
