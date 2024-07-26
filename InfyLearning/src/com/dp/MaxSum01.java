package com.dp;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSum01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int[] arr=new int [n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int ldp[]=new int[n];
		for (int i = 0; i < n; i++) {
			ldp[i] = -1;
		}
		int rdp[]=new int[n];
		for (int i = 0; i < n; i++) {
			rdp[i] = -1;
		}
		
		leftSum(arr,n-1,ldp);
		rightSum(arr,0,rdp);
//		System.out.println(Arrays.toString(ldp));
//		System.out.println(Arrays.toString(rdp));
		
		int max=Integer.MIN_VALUE;
		max=Math.max(max,rdp[0]);
		max=Math.max(max, ldp[n-1]);
		
		for(int i=1;i<n-1;i++) {
			max=Math.max(max,Math.max(arr[i],0)+Math.max(ldp[i-1], 0)+Math.max(rdp[i+1], 0));
		}
		if(max==0) {
			int maxx=Integer.MIN_VALUE;
			for(int i=0;i<n;i++) {
				maxx=Math.max(maxx, arr[i]);
			}
			System.out.println(maxx);
			return;
		}
System.out.println(max);
}
	static int leftSum(int [] arr,int i,int []dp) {
		if(i<0) {
			return 0;
		}
		if(dp[i]!=-1) {
			return dp[i];
		}
		dp[i]=Math.max(leftSum(arr, i-1, dp)+arr[i], arr[i]);
		return dp[i];
	}
	
	static int rightSum(int [] arr,int i,int []dp) {
		if(i>arr.length-1) {
			return 0;
		}
		if(dp[i]!=-1) {
			return dp[i];
		}
		dp[i]=Math.max(rightSum(arr, i+1, dp)+arr[i], arr[i]);
		return dp[i];
	}
}