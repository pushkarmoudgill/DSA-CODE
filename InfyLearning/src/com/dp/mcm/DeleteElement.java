package com.dp.mcm;

import java.util.Scanner;

public class DeleteElement {
public static void main(String [] args) {
	Scanner sc=new Scanner (System.in);
	
	
	int n=sc.nextInt();
	
	int arr[]=new int [n+2];
	for(int i=0;i<n+2;i++) {
		arr[i]=1;
	}
	for(int i=1;i<=n;i++) {
		arr[i]=sc.nextInt();
	}
	int dp[][]=new int [n+1][n+1];
	
	for(int i=0;i<=n;i++) {
		for(int j=0;j<n+1;j++) {
			dp[i][j]=-1;
		}
	}
	
int ans=	solve(1,n,arr,dp);
System.out.println(ans);
}


static int solve(int st,int end,int [] arr,int [][]dp) {
	
	if(st>end) {
		return 0;
	}
	if(dp[st][end]!=-1) {
		return dp[st][end];
	}
	int max=Integer.MIN_VALUE;
	
	for(int i=st ;i<=end;i++) {
		
		max=Math.max(max,solve(st,i-1,arr,dp)+solve(i+1,end,arr,dp)+arr[st-1]*arr[i]*arr[end+1]);
	}
	dp[st][end]=max;
	
	return dp[st][end];
}
}
