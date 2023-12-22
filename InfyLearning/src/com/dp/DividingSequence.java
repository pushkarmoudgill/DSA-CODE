package com.dp;

import java.util.Scanner;

public class DividingSequence {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int dp[]=new int [n];
		for (int i = 0; i < n; i++) {
			dp[i] = 1;
		}
	int ans=	minimumDrop(arr,dp);
	System.out.println(ans);
		
}
	
	
	static int minimumDrop(int [] arr,int []dp) {
		int ans=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]%arr[j]==0) {
					dp[i]=Math.max(dp[i], dp[j]+1);
				}
				
			}
			ans=Math.max(ans, dp[i]);
		}
		return ans;
	}
}