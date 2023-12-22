package com.recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class permutationstr {
	public static void solve(char[] c,int idx,int n,List<String>arr1) {
		if(idx==n-1) {
			String s=new String (c);
			arr1.add(s);
			return;
		}
for(int i=idx;i<n;i++) {
	char temp=c[idx];
	c[idx]=c[i];
	c[i]=temp;
	//String s1=new String(c);
	solve(c,idx+1,n,arr1);
	temp=c[i];
	c[i]=c[idx];
	c[idx]=temp;
}
	}
	

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
	//String curr="";
	String str=sc.nextLine();

char[] c = str.toCharArray();
	int n=c.length;
	ArrayList<String> list=new ArrayList<String>();
	solve(c,0,n,list);
	Collections.sort(list);
	 for(String LIST:list)    
		    System.out.println(LIST);
	//System.out.println(list);
}
}