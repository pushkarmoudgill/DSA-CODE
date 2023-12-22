package com.dpContest;

import java.util.Scanner;

public class Soldier {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long [] arr=new long[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextLong();
		}
		//long sq=
		long dp[][]=new long[n][2];
		
		dp[0][0]=arr[0];
		dp[0][1]=arr[0]*arr[0];
		long ans=Integer.MIN_VALUE;
		long ans1=findPower(arr,n,dp,ans);
		System.out.println(ans1);
	}
	
	static long findPower(long [] arr,int n,long[][]dp,long ans) {
		
		
		for(int i=1;i<n;i++) {
			dp[i][0]=Math.max(arr[i],arr[i]+dp[i-1][0]);
			dp[i][1]=Math.max(arr[i]*arr[i],(Math.max((arr[i]*arr[i])+dp[i-1][0],arr[i]+dp[i-1][1])));
			ans= Math.max(ans, Math.max(dp[i][0], dp[i][1]));
			//ans= Math.max(ans, dp[i][1]);
		}
		
		
		return ans;
	}
}
