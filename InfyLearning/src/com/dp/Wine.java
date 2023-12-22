package com.dp;

import java.util.Arrays;
import java.util.Scanner;

public class Wine {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int[][]dp=new int[n+1][n+1];
		//Arrays.fill(dp, -1);
		for(int j=0;j<n+1;j++) {
			for(int k=0;k<n+1;k++) {
				dp[j][k]= -1 ;
			}
		}
		
	int ans=    findProfit(arr,0,n-1,dp);
	System.out.println(ans);
	}
	
	static int  findProfit(int[] arr,int i,int j,int [][] dp) {
		int profit=0;
		if (dp[i][j] != -1) {
		//System.out.println(dp[i][j]);
		return dp[i][j];
		}
		int n=arr.length;
		
	if(i==j) {
		//System.out.println(arr[i]* n-(j-i));
		return arr[i]* (n-(j-i));
	}
	
	
	     int leftprofit=  arr[i]* ( n-(j-i) )+ findProfit(arr, i+1, j, dp);
	     int rprofit=  arr[j]* ( n-(j-i) ) + findProfit(arr, i, j-1, dp);
	     
	     dp[i][j]=Math.max(leftprofit, rprofit);
	     return dp[i][j];
	
	}

}
