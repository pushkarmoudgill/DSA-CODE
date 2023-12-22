package com.dp;

import java.util.Scanner;

public class MimicString {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	int tc=sc.nextInt();
	for(int i=1;i<=tc;i++) {
		int s1=sc.nextInt();
		int s2=sc.nextInt();
		
		String s=sc.next();
		String t=sc.next();
		
		int dp[][]=new int [s1+1][s2+1];
		for(int l=0;l<s1+1;l++) {
			for(int k=0;k<s2+1;k++) {
				dp[l][k]= -1 ;
			}
		}
		int ans=match( s, t,s1,s2,dp);
		
		System.out.println(ans);
	}
}

  static int match(String s,String t,int i,int j,int[][]dp) {
	  if(i==0) {
		  return j;
	  }
	  if( j==0) {
		  return i;
	  }
	  if(dp[i][j]!=-1) {
		  return dp[i][j];
	  }
	  int ans=Integer.MAX_VALUE;
	  if(s.charAt(i-1)==t.charAt(j-1)) {
		dp[i][j]=  match(s,t,i-1,j-1,dp);
	  }
	  else {
		   ans=1+match(s,t,i-1,j,dp);
		   ans=Math.min(ans,(1+ match(s,t,i,j-1,dp)));
		  ans=Math.min((1+match(s,t,i-1,j-1,dp)), ans);
		  dp[i][j]=ans;
	  }
	  
	  
	  
	  return dp[i][j];
  }
}
