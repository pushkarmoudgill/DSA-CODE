package com.dpContest;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SuperWord {
	
	public static void main(String [] args) {
		Scanner sc=new Scanner (System.in);
		
		  Set<String> Set = new HashSet<String>(); 
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			String s=sc.next();
			Set.add(s);
		}
		
		int n=sc.nextInt();
		String s=sc.next();
		
		int dp[]=new int [n+1];
		for(int i=0;i<n+1;i++) {
			dp[i]=0;
		}
		dp[0]=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=20;j++ ) {
				int start =i-j+1;
				
				int length=j;
				if(start<=0) {
					break;
				}
				if(Set.contains(s.substring(start-1, start-1+length))&&dp[start-1]==1) {
					dp[i]=1;
					break;
				}
			}
		}
		
		if(dp[n]==1) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}

}
