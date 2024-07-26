package com.dp;

import java.util.Scanner;

public class ShortestSubsequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t="";
		for(int i=s.length()-1;i>=0;i--) {
			t+=s.charAt(i);
		}
		
		//String t = sc.next();
		int dp[][] = new int[s.length() + 1][t.length() + 1];
		for (int l = 0; l < s.length() + 1; l++) {
			for (int k = 0; k < t.length() + 1; k++) {
				dp[l][k] = -1;
			}
		}
		int ans = shortestString(s, t, s.length() - 1, t.length() - 1, dp);
		//int ans1=s.length()+t.length()-ans;
		System.out.println(ans);

	}

	static int shortestString(String s, String t, int i, int j, int[][] dp) {
		int ans = Integer.MIN_VALUE;
		if (i == -1 || j == -1) {
			return 0;
		}
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		if (s.charAt(i) == t.charAt(j))
			dp[i][j] = 1 + shortestString(s, t, i - 1, j - 1, dp);
		else {
			dp[i][j] = Math.max(ans, Math.max(shortestString(s, t, i - 1, j, dp), shortestString(s, t, i, j - 1, dp)));
		}
		return dp[i][j];

	}

}
