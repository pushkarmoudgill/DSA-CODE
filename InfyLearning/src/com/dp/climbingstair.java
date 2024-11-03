package com.dp;

import java.util.Arrays;

public class climbingstair {
	
	public static void main(String [] args) {
		
		
		int []cost= {10,15,20};
		
		int n = cost.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        int startAt0thIndex = solve(0,n, dp, cost);
        int startAt1stIndex = solve(1,n, dp, cost);
       System.out.println(Math.min(startAt0thIndex, startAt1stIndex)); 
    }

   static  public int solve(int ind, int n , int[] dp, int[] cost){
        if (ind >= n) return 0;
        if (dp[ind] != -1) return dp[ind];
        dp[ind] = Math.min(solve(ind+1, n, dp, cost), solve(ind+2, n, dp, cost)) + cost[ind];
        return dp[ind];
    }
		
		
//		int [] dp=new int[arr.length+1];
//		int [] dp2=new int[arr.length];
//		  Arrays.fill(dp,-1);
//		
//		int cost =0;
//		int ans=solve(arr,0,cost,dp);
//		int ans1=solve(arr,1,cost,dp);
//		System.out.println(Math.min(ans, ans1));
//	}
//	
//	static int solve(int []arr,int i,int cost,int[] dp) {
//		
//		if(i>=arr.length) {
//			return cost;
//		}
//		if(dp[i]!=-1) {
//			return dp[i];
//		}
//		int ans=0;
//		
//		int ans1=(solve(arr,i+1,cost+arr[i],dp));
//		int ans2=(solve(arr,i+2,cost+arr[i],dp));
//		dp[i]=Math.min(ans1, ans2);
//		 
//		 return dp[i];
//	}

}
