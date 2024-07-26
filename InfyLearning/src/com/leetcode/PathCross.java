package com.leetcode;

import java.util.HashSet;
import java.util.Scanner;

public class PathCross {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	
	String s="NESWW";
	HashSet<String> set=new HashSet<>();
	int x=0,y=0;
	set.add("0,0");
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='N') {
			y++;
		}
		else if(s.charAt(i)=='S') {
			y--;
		}
		else if(s.charAt(i)=='W') {
			x++;
		}
		else if(s.charAt(i)=='E') {
			x--;
		}
	}
	StringBuilder sb=new StringBuilder();
	sb.append(x).append(",").append(y);
	if(set.contains(sb.toString()))
	//	return true;
	set.add(sb.toString());
	
}
//return false;
}
