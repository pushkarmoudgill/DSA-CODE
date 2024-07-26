package com.dp;

import java.util.Scanner;

public class LcsBottomUp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();

		int dp[][] = new int[s.length() + 1][t.length() + 1];

		int ans = find(s, t, s.length(), t.length(), dp);
		//System.out.println(ans);

		String str = "";

		int i =s.length(), j =t.length();
		while (i > 0 && j > 0) {

			if (s.charAt(i - 1) == t.charAt(j - 1)) {

				str += s.charAt(i - 1);
				i--;
				j--;
			} else {

				if (dp[i - 1][j] > dp[i][j - 1]) {
					i--;
				} else {
					j--;
				}
			}
		}

		String rev = "";
		for (int k = str.length() - 1; k >= 0; k--) {
			rev += str.charAt(k);
		}
		System.out.println(rev);
	}

	static int find(String s, String t, int m, int n, int dp[][]) {
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (s.charAt(i - 1) == t.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}
		return dp[m][n];
	}

}