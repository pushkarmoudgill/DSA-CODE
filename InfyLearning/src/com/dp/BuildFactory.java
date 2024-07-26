package com.dp;

import java.util.Arrays;
import java.util.Scanner;

public class BuildFactory {
	public static void main(String [] args) {
		
		Scanner sc=new Scanner (System.in);
		
		int N=sc.nextInt();
		int C=sc.nextInt();
		int cost[]=new int [N];
		int val[]=new int [N];
		for(int i=0;i<N;i++) {
			int c=sc.nextInt();
			int v=sc.nextInt();
			cost[i]=c;
			val[i]=v;
			
				
				
		}
		
		int dp[][]=new int [C+1][N+1];
		for(int i=0;i<=C;i++) {
			for(int j=0;j<=N;j++) {
				dp[i][j]=-1;
			}
		}
//		System.out.println(Arrays.toString(cost));
//		System.out.println(Arrays.toString(val));
		
		int ans=maxProd(C,N-1,cost,val,dp);
		System.out.println(ans);
	}
	static int maxProd(int C,int n,int []cost,int [] val,int [][] dp) {
		if(n<0) {
			return 0;
		}
		if(C==0) {
			return 0;
		}
		if(dp[C][n]!=-1) {
			return dp[C][n];
		}
		
		int take=0;
		int nt=0;
		
		if(cost[n]<=C) {
			 take=maxProd(C-cost[n],n-1,cost,val,dp)+val[n];
			 
			 
		}
		nt=maxProd(C,n-1,cost,val,dp);
		return dp[C][n]=Math.max(take, nt);
		
	}

}
