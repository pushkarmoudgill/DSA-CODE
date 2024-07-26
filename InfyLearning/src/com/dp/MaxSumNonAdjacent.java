package com.dp;

public class MaxSumNonAdjacent {
	
	public static void main(String [] args) {
		int arr[]= {3, 2, 7, 10};
		
		int ans=solve(0,arr,arr.length);
		
		System.out.println(ans);
	}

	
	
	static int solve(int i,int [] arr,int n) {
		
		if(i==n-1) {
			return arr[i];
			
		}
		if(i==n-2) {
			
			return Math.max(arr[i], arr[i+1]);
		}
		
		
		int max1=arr[i]+solve(i+2,arr,n);
		
		int max2=0+solve(i+1,arr,n);
		
		int max=Math.max(max1, max2);
		
		return max;
	}
}
