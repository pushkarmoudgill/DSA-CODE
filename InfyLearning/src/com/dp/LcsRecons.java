package com.dp;

import java.util.Scanner;

public class LcsRecons {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		
		int m=s.length();
		int n=t.length();
		int dp[][] = new int[s.length() + 1][t.length() + 1];
		for (int l = 0; l < s.length() + 1; l++) {
			for (int k = 0; k < t.length() + 1; k++) {
				dp[l][k] = 0;
			}
		}
		int ans = shortestString(s, t, s.length() , t.length() , dp);
		//System.out.println(ans);
		String str="";
		
		int i=m,j=n; 
		while(i>0&&j>0) {
			
			if(s.charAt(i-1)==t.charAt(j-1)) {
				
			str+=s.charAt(i-1);
			i--;j--;
			}
			else {
					
				if(dp[i-1][j]>dp[i][j-1]) {
						i--;
					}
					else {
						j--;
					}
					
					
			}
			
			
		}
		
		///while()
		
		String rev="";
		for(int k=str.length()-1;k>=0;k--) {
			rev+=str.charAt(k);
		}
		System.out.println(rev);

	}

	static int shortestString(String s, String t, int i, int j, int[][] dp) {
		int ans = Integer.MIN_VALUE;
		if (i == 0 || j == 0) {
			return 0;
		}
		if(dp[i][j]!=0) {
			return dp[i][j];
		}
		if (s.charAt(i-1) == t.charAt(j-1))
			dp[i][j] = 1 + shortestString(s, t, i - 1, j - 1, dp);
		else {
			dp[i][j] = Math.max(ans, Math.max(shortestString(s, t, i - 1, j, dp), shortestString(s, t, i, j - 1, dp)));
		}
		return dp[i][j];

	}

}
