package com.dp;

import java.util.Arrays;
import java.util.Scanner;

public class CircularSubarraySum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int dp[] = new int[n];
		for (int i = 0; i < n; i++) {
			dp[i] = -1;
		}

		int dp1[] = new int[n];
		for (int i = 0; i < n; i++) {
			dp1[i] = -1;
		}
		 findSum(arr, n - 1, dp);
		//System.out.println(Arrays.toString(dp));
		 int ans1=Integer.MIN_VALUE;
		for(int j=0;j<dp.length;j++) {
			ans1=Math.max(ans1, dp[j]);
		}

	//	int ans2=Integer.MAX_VALUE;
				findSum1(arr, n - 1, dp1);
				//System.out.println(Arrays.toString(dp1));
				int ans2=Integer.MAX_VALUE;
				for(int j=0;j<dp1.length;j++) {
					ans2=Math.min(ans2, dp1[j]);
				}
		 int total=0;
			for(int j=0;j<arr.length;j++) {
				total+=arr[j];
			}
			if(ans2==total) {
				//int	ans=Math.max(ans1,ans2);
				System.out.println(ans2);
				return;
			}
int ans3=total-ans2;
		
	//	int ans=Integer.MIN_VALUE;
		
	int	ans=Math.max(ans1,ans3);
		
		System.out.println(ans);
	}

	static int findSum(int[] arr, int i, int[] dp) {

		if (i <0)
			return 0;

		if (dp[i] != -1) {
			return dp[i];
		}

		dp[i] = Math.max(arr[i] + findSum(arr, i - 1, dp), arr[i]);

		return dp[i];

	}
	static int findSum1(int[] arr, int i, int[] dp1) {

		if (i <0)
			return 0;

		if (dp1[i] != -1) {
			return dp1[i];
		}

		dp1[i] = Math.min(arr[i] + findSum1(arr, i - 1, dp1), arr[i]);

		return dp1[i];

	}
}
