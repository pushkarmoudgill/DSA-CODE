package com.dpContest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class rangeSum {
	
	public static void main(String[] args) throws IOException {

 
		Scanner sc = new Scanner(System.in);
	        int n =sc.nextInt();
	        
	        int arr[]=new int[n+1];
			
			for(int i=1;i<=n;i++) {
				arr[i]=sc.nextInt(); 
			}

		
				long dp[]=new long [n+1];
				for (int i = 0; i < dp.length; i++) {
					dp[i] = 0;
				}
				long ans=findsum(arr,n,dp);
				//System.out.println(Arrays.toString(dp));
				int q=sc.nextInt();
				//System.out.println("qqq"+q);
				
				for(int i=0;i<q;i++) {
					//int sum=0;
					
					int num1=sc.nextInt();
					int num2=sc.nextInt();
					//int arr[num1]-arr[num1-1]
					System.out.println(dp[num2]-dp[num1-1]);
					
				}
				
			
			
			
			
}
	static long findsum(int [] arr,int i,long dp[]) {
		
		for(int j=1;j<=i;j++)
		{
		  dp[j]=arr[j]+dp[j-1];
		}
	return  dp[i];
	}
}