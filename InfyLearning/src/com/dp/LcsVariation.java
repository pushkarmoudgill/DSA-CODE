package com.dp;

import java.util.Scanner;

public class LcsVariation {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		
		
		String str1=sc.next();
		String str2=sc.next();
		
		int n=str1.length();int m=str2.length();
		
		int dp[][]=new int [n+1][m+1];
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=m;j++) {
				dp[i][j]=-1;
			}
		}
		
		int ans=findmin(str1,str2,str1.length(),str2.length(),dp);
		
		
		int a=n-ans;
		int b=m-ans;
		System.out.println(a+b);
	}
	
	static int findmin(String s,String t,int i,int j,int dp[][]) {
		if(i==0||j==0) {
			return 0;
		}
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
			
			int ans=Integer.MIN_VALUE;
			if(s.charAt(i-1)==t.charAt(j-1)) {
				 ans=1+findmin(s,t,i-1,j-1,dp);
			}
			else {
				ans=Math.max(ans, Math.max(findmin(s,t,i-1,j,dp),findmin(s,t,i,j-1,dp)));
			}
			dp[i][j]=ans;
			return dp[i][j];
	}

}
