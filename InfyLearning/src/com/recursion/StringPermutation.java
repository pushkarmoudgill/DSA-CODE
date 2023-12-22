package com.recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StringPermutation {
	 static ArrayList<String> list=new ArrayList<String>();
	public static void solve(String curr,String rem) {
	
		// ArrayList<String> list=new ArrayList<String>();
		if(rem.length()==0) {
			list.add(curr);
		}
		
		for(int i=0;i<rem.length();i++) {
		String ros=rem.substring(0,i)+rem.substring(i+1);
		
		solve(curr+rem.charAt(i),ros);
		
		
		}
//		Collections.sort(list);
//		  for(String fruit:list)    
//			    System.out.println(fruit);    
		
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		String curr="";
		String rem=sc.nextLine();
		ArrayList<String> list=new ArrayList<String>();
		solve(curr,rem);
		
		Collections.sort(list);
		  for(String fruit:list)    
			    System.out.println(fruit);
	
	}

}
