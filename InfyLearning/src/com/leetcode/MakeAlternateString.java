package com.leetcode;

public class MakeAlternateString {
	public static void main(String [] args) {
		String s="10010100";
		 char[] charArray = s.toCharArray();
		 char[] charArray1 = s.toCharArray();
		
		int count=0;
		int count1=0;
		//String s1=
		
		if(charArray1[0]=='1') {
			charArray1[0]='0';
			count1++;
		}
		else {
			charArray1[0]='1';
			count1++;
		}
		for(int i=1;i<charArray1.length;i++) {
			if(charArray1[i-1]==charArray1[i]) {
				count1++;
				
				if(charArray1[i]=='1') {
					charArray1[i]='0';
				}
				else {
					charArray1[i]='1';
				}
			}
		}
		
		for(int i=1;i<charArray.length;i++) {
			if(charArray[i-1]==charArray[i]) {
				count++;
				
				if(charArray[i]=='1') {
					charArray[i]='0';
				}
				else {
					charArray[i]='1';
				}
			}
		}
		System.out.println(Math.min(count, count1));
	}

}
