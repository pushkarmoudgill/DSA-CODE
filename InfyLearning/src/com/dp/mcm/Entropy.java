package com.dp.mcm;

import java.util.Scanner;

public class Entropy {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	long arr[]=new long [n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextLong();
	}
	long dp[][]=new long [n][n];
	
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			dp[i][j]=-1;
		}
	}
	
	long ans=mcm(arr,0,n-1,dp);
	System.out.println(ans);
}

static long mcm(long [] arr,int l,int r, long [][]dp) {
	if(l==r) {
		dp[l][r]=0;
	}
	
	if(dp[l][r]!=-1) {
		return dp[l][r];
	}
	
	long sum=0;
	long ans=Integer.MAX_VALUE;
	for(int i=l;i<=r;i++) {
		sum+=arr[i];
	}
	
	for(int k=l;k<r;k++) {
		long temp=mcm(arr,l,k,dp)+mcm(arr,k+1,r,dp)+sum;
		ans=Math.min(ans,temp);
	}
	
	dp[l][r]=ans;
	return dp[l][r];
}
}
