package com.dp.mcm;

import java.util.Scanner;

public class EggDrop {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	
	
	int n=sc.nextInt();
	
	for(int i=0;i<n;i++) {
		int f=sc.nextInt();
		int k=sc.nextInt();
		int dp[][]=new int [f+1][k+1];
		for(int l=0;l<f+1;l++) {
			for(int j=0;j<k+1;j++) {
				dp[l][j]= -1 ;
			}
		}
		int ans=solve(f,k,dp);
		System.out.println(ans);
	}
	
}

static int solve(int f,int k,int dp[][]) {
	int min=Integer.MAX_VALUE;
	if(f==0||f==1) {
		return f;
	}
	
	if(k==1) {
		return f;
	}
	if(dp[f][k]!=-1) {
		return dp[f][k];
	}
	
	for(int i=1;i<=f;i++) {
	int temp=1+	Math.max(solve(i-1,k-1,dp),solve(f-i,k,dp));
	min=Math.min(temp, min);
	}
	dp[f][k]=min;
	return dp[f][k];
}
}
