package com.dpContest;

import java.util.Scanner;

public class GreedyBuliding {
	
public static void main (String [] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int j=sc.nextInt();
			int h=sc.nextInt();
			int arr[]=new int [j+1];
			for(int k=1;k<=j;k++) {
				arr[k]=sc.nextInt();
			}
			int dp[][]=new int [h+1][j+1];
			for(int l=0;l<h+1;l++) {
				for(int k=0;k<j+1;k++) {
					dp[l][k]= -1 ;
				}
			}
		int ans=	mincost(arr,h,j,dp);
		System.out.println(ans);
		}
		
		

}

static int mincost(int [] arr,int h,int i,int[][]dp) {
	int ans=Integer.MAX_VALUE;
	
	if(h<1) {
		return 0;
	}

if(h>0&&i<1) {
	return -1;
}
if(h==arr[i]) {
	return 1;
}
if(dp[h][i]!=-1 )
{
	return dp[h][i];
}
    mincost(arr,h,i-1,dp);
      if(arr[i]<=h) {
    ans=Math.min(ans,  1+ mincost(arr,h-arr[i],i,dp));
    dp[h][i]=ans;
    
      }
      return dp[h][i];
}
      
}