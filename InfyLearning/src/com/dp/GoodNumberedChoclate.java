package com.dp;

import java.util.Scanner;

public class GoodNumberedChoclate {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int i = 1; i <= t; i++) {
			int j = sc.nextInt();
			int arr[] = new int[j + 1];
			for (int k = 1; k <= j; k++) {
				arr[k] = sc.nextInt();
			}

			int[][] dp = new int[j + 1][j + 1];
			for (int l = 0; l <= j; l++) {
				for (int m = 0; m <= j; m++) {
					dp[l][m] = -1;
				}
			}
			int ans = findHappiness(j, j, arr, dp);

			System.out.println(ans);

		}
	}

	static int findHappiness(int j, int i, int[] arr, int[][] dp) {
		int ans = Integer.MIN_VALUE;

		if (j == 0 || i == 0) {
			return 0;
		}
		if (dp[i][j] != -1)
			return dp[i][j];
		if (j < i)
			ans = findHappiness(j, i - 1, arr, dp);
		else
			ans = Math.max(findHappiness(j, i - 1, arr, dp), arr[i] + findHappiness(j - i, i, arr, dp));

		dp[i][j] = ans;
		return dp[i][j];
	}

}
