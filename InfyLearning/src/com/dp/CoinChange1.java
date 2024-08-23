package com.dp;

import java.util.Arrays;

public class CoinChange1 {
public static void main(String [] args) {
	int coin [] = {1,2,3};
	
	int sum =5;
	
	int[][] dp = new int[coin.length+ 1][sum + 1];
    for (int[] row : dp)
        Arrays.fill(row, -1);
	int ans=count(sum,coin,0,dp);
	
	System.out.println(ans);
}


static int count (int sum,int [] coin,int i,int [][] dp) {
	
	
	if(sum==0) {
		return 1;
		}
	
	if(sum<0 || i==coin.length) {
		return 0;
	}
	if(dp[i][sum]!=-1) {
		return dp[i][sum];
	}
	int cnt=0;
	 cnt+= count (sum-coin[i],coin,i,dp);
	cnt+=count(sum,coin,i+1,dp);
	dp[i][sum]=cnt;
	return dp[i][sum];
}
}
