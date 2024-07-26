package com.dp;

import java.util.Arrays;
import java.util.Scanner;

public class Stickbinary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		int m=sc.nextInt();
		int n=sc.nextInt();
		
		
		int ans=0;
		String arr[]=new String [c];
		for(int i=0;i<c;i++) {
			String s=sc.next();
			
			arr[i]=s;
		}
		//System.out.println(Arrays.toString(arr));
		int [][][]dp=new int [m+1][n+1][c+1];
		for(int i=0;i<m+1;i++) {
			for(int j=0;j<n+1;j++) {
				for(int k=0;k<c+1;k++) {
					dp[i][j][k]=-1;
				}
			}
		}
		 ans=maxStick(m,n,arr.length-1,arr,dp);
		System.out.println(ans);
	}

	
	static int maxStick(int m,int n ,int i,String [] arr,int [][][]dp)
	{
		if(m==0&&n==0) {
			return 0;
		}
		if(i<0) {
			return 0;
		}
		if(dp[m][n][i]!=-1) {
			return dp[m][n][i];
		}
		
		String s=arr[i];
		
		int count_zero=0;
		int count_one=0;
		for(int j=0;j<s.length();j++) {
		if(s.charAt(j)=='1') {
			count_one++;
		}
		if(s.charAt(j)=='0') {
			count_zero++;
		}
		}
		
		int take=0;
		int nottake=0;
		if(count_zero<=m&&count_one<=n) {
			take=1+maxStick( m-count_zero, n -count_one, i-1, arr,dp);
			
			
		}
		
		nottake=maxStick(m,n,i-1,arr,dp);
		
		return Math.max(take, nottake);
	}
	
}
