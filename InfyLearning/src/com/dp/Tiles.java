package com.dp;

import java.util.Scanner;

public class Tiles {
	public static void main(String[] args) {

		// System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int dp[] = new int[length + 1];
		for (int i = 0; i < dp.length; i++) {
			dp[i] = -1;
		}
		int ans = func(length, dp);
		 long M = 1000000007;
		System.out.println(ans);
	}
	
	
	

	static int func(int len, int[] dp) {
		if (len == 1 || len == 2) {
			return len;
		}
		if (dp[len] != -1) {
			return dp[len];
		}
long a=func(len - 1, dp) ;
int b=func(len - 2, dp);
		dp[len] =  (int) ((a +  b) % 1000000007);

		return dp[len];

	}

}
