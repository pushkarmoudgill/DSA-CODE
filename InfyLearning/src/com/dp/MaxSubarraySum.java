
package com.dp;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSubarraySum {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int dp[]=new int [n];
		for (int i = 0; i < n; i++) {
			dp[i] = -1;
		}
		int ans=0;
	int ans1=	maxSum(arr,n-1,dp);
		for(int j=0;j<dp.length;j++) {
			ans=Math.max(ans, dp[j]);
		}
		System.out.println(ans);
}
	
	static int maxSum(int [] arr,int i,int[]dp) {
		if(i<0) {
			return 0;
			
		}
		if(dp[i]!=-1) {
			return dp[i];
		}
			
		dp[i]= Math.max(arr[i]+(maxSum(arr, i-1,dp)),arr[i]);
		return dp[i];
		
	}
}