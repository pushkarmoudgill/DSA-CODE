package com.dp;

import java.util.Arrays;

public class CoinChange {
	
	public static void main(String [] args) {
		
		int amount =5;
		int [] coin = {1,2,3};
		int[][] dp = new int[coin.length+ 1][amount + 1];
        for (int[] row : dp)
            Arrays.fill(row, -1);
		
		int ans=solve(amount,coin,0,dp);
				
		System.out.print(ans);
	}

	static int solve(int amount,int [] coin,int i,int [][]dp) {
		
		if(amount==0) {
			return 1;
		}
		
		if(i==coin.length) {
			return 0;
			
		}
		
		if(amount<0) {
			return 0;
		}
		if(dp[i][amount]!=-1) {
			return dp[i][amount];
		}
		
		dp[i][amount]=solve(amount-coin[i],coin,i,dp);
		
		dp[i][amount]+=solve(amount,coin,i+1,dp);
		
		
		return dp[i][amount];
	}
}
